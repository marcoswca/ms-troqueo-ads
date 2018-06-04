package com.troqueo.ads.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.troqueo.ads.domain.ad.Ad;
import com.troqueo.ads.service.AdService;
import com.troqueo.ads.service.dto.AdDTO;
import com.troqueo.ads.web.rest.util.HeaderUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AdsResource {

    private static final Logger log = LoggerFactory.getLogger(AdsResource.class);

    private final AdService adService;

    MongoOperations mongoOperations;

    public AdsResource(AdService adService) {
        this.adService = adService;
    }

    @GetMapping("/anuncios")
    @Timed
    public ResponseEntity<List<AdDTO>> listAds(@RequestParam Map<String, String> requestParams) {
        return new ResponseEntity<>(adService.list(requestParams), HttpStatus.OK);
    }

    @GetMapping("/destaques")
    @Timed
    public ResponseEntity<List<AdDTO>> top(@RequestParam Map<String, String> requestParams) {
        return new ResponseEntity<>(adService.list(requestParams), HttpStatus.OK);
    }

    @GetMapping("/anuncios/{id}")
    @Timed
    public ResponseEntity<AdDTO> getAd(@PathVariable String id) {
        return ResponseUtil.wrapOrNotFound(
            adService.findById(id)
                .map(AdDTO::new));
    }

    @PostMapping("/anuncios")
    @Timed
    public ResponseEntity<Ad> createUser(@Valid @RequestBody AdDTO adDTO) throws URISyntaxException {

        Ad newAd = adService.createAd(adDTO);
        return ResponseEntity.created(new URI("/api/anuncios/" + newAd.get_id()))
            .headers(HeaderUtil.createAlert("A user is created with identifier " + newAd.get_id(), newAd.get_id()))
            .body(newAd);
    }

    @DeleteMapping("/anuncios/{id}")
    @Timed
    public String deleteAd(@PathVariable String id) {
        return adService.delete(id);
    }

    @PutMapping("/anuncios/{id}")
    @Timed
    public ResponseEntity<AdDTO> updateAd(@PathVariable String id, @RequestBody AdDTO adDTO) {
        Optional<AdDTO> updatedAd = adService.update(adDTO);

        return ResponseUtil.wrapOrNotFound(updatedAd,
            HeaderUtil.createAlert("A ad is updated with identifier " + adDTO.get_id(), adDTO.get_id()));
    }

}
