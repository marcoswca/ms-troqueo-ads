package com.troqueo.ads.web.rest;

import com.troqueo.ads.domain.ad.Ad;
import com.troqueo.ads.repository.AdRepository;
import com.troqueo.ads.security.SecurityUtils;
import com.troqueo.ads.security.jwt.TokenProvider;
import com.troqueo.ads.web.rest.errors.NotFoundRequestException;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AdsResource {

    private final AdRepository adRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(AdsResource.class);
    private TokenProvider tokenProvider;
    public AdsResource(AdRepository adRepository) {
        this.adRepository = adRepository;
    }

    @GetMapping("/anuncios")
    public List<Ad> listAds(@RequestParam Map<String, String> requestParams){
        return adRepository.aggregate(requestParams);
    }

    @GetMapping("/anuncios/{id}")
    public Ad getAd(@PathVariable String id){
        return adRepository.findOne(id);
    }

    @PostMapping("/anuncios")
    public Ad createAd(@RequestBody Ad ad) {
        Ad adInstance = adRepository.save(ad);
        return ad;
    }

    @DeleteMapping("/anuncios/{id}")
    public String deleteAd(@PathVariable String id){
        if (adRepository.findOne(id) != null) {
            adRepository.delete(id);
            return id;
        } else {
            throw new NotFoundRequestException();
        }
    }

}
