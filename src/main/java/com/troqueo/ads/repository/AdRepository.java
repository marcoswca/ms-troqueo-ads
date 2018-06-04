package com.troqueo.ads.repository;

import com.troqueo.ads.domain.ad.Ad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Spring Data MongoDB repository for the Product entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AdRepository extends MongoRepository<Ad, String>, AdRepositoryCustom {

    Optional<Ad> findOneBy_id(String id);

}
