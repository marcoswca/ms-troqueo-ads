package com.troqueo.ads.repository;

import com.troqueo.ads.domain.ad.Ad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Spring Data MongoDB repository for the Product entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AdRepository extends MongoRepository<Ad,String>, AdRepositoryCustom {

}
