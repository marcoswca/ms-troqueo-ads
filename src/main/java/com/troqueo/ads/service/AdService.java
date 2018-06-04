package com.troqueo.ads.service;

import com.troqueo.ads.domain.ad.Ad;
import com.troqueo.ads.domain.user.User;
import com.troqueo.ads.repository.AdRepository;
import com.troqueo.ads.service.dto.AdDTO;
import com.troqueo.ads.web.rest.errors.NotFoundRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class AdService {

    private final Logger log = LoggerFactory.getLogger(AdService.class);

    private final AdRepository adRepository;

    private RestTemplate restTemplate;

    public AdService(AdRepository adRepository) {
        this.adRepository = adRepository;
    }

    public Ad createAd(AdDTO adDTO) {
        Ad ad = new Ad();
        ad.setCreatedAt(new Date().toInstant());
        ad.setUpdatedAt(new Date().toInstant());
        ad.setVeiculo(adDTO.getVeiculo());
        ad.setDocumentacao(adDTO.getDocumentacao());
        ad.setNegociacao(adDTO.getNegociacao());
        ad.setImagens(adDTO.getImagens());
        ad.setUsuario(adDTO.getUsuario());
        Ad adInstance = adRepository.save(ad);
        log.debug("Created Information for Ad: {}", ad);
        return adInstance;
    }

    public List<AdDTO> list(Map<String, String> aggregate) {
        List<AdDTO> ads = new ArrayList<>();
        adRepository.aggregate(aggregate).forEach(ad -> {
            ads.add(new AdDTO(ad));
        });
        return ads;
    }

    public String delete(String id) {
        if (adRepository.findOne(id) != null) {
            adRepository.delete(id);
            return id;
        } else {
            throw new NotFoundRequestException();
        }
    }

    public Optional<AdDTO> update(AdDTO adDTO) {
        return Optional.of(adRepository
            .findOne(adDTO.get_id()))
            .map(ad -> {
                ad.setImagens(adDTO.getImagens());
                ad.setNegociacao(adDTO.getNegociacao());
                ad.setDocumentacao(adDTO.getDocumentacao());
                ad.setVeiculo(adDTO.getVeiculo());
                ad.setUpdatedAt(new Date().toInstant());
                adRepository.save(ad);
                log.debug("Changed Information for ad: {}", ad);
                return ad;
            })
            .map(AdDTO::new);
    }

    public Optional<Ad> findById(String id) {
        Optional<Ad> ad = adRepository.findOneBy_id(id);
        User user;
        if (ad.orElseThrow(NotFoundRequestException::new).getUsuario() != null) {
            restTemplate = new RestTemplate();
            user = restTemplate.getForObject("http://localhost:8080/api/users/" + ad.get().getUsuario(), User.class);
            ad.get().setUser(user);
            return ad;
        } else {
            throw new NotFoundRequestException();
        }
    }
}
