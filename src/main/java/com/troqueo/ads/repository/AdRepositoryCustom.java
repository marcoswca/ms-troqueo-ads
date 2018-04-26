package com.troqueo.ads.repository;

import com.troqueo.ads.domain.ad.Ad;

import java.util.List;
import java.util.Map;

public interface AdRepositoryCustom {
    List<Ad> aggregate(Map<String, String> queryParams);
}
