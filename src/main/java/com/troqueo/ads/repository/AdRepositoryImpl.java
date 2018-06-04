package com.troqueo.ads.repository;

import com.troqueo.ads.domain.ad.Ad;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.*;
import org.springframework.data.mongodb.core.query.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;

public class AdRepositoryImpl implements AdRepositoryCustom {

    private final MongoTemplate mongoTemplate;

    public AdRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<Ad> aggregate(Map<String, String> queryParams) {
        List<AggregationOperation> aggregationOperations = new ArrayList<AggregationOperation>();
        if (queryParams.containsKey("maiorPreco")) {
            MatchOperation maxPriceOperation = getMaxPriceOperation(Float.parseFloat(queryParams.get("maiorPreco")));
            aggregationOperations.add(maxPriceOperation);
        }

        if (queryParams.containsKey("menorPreco")) {
            MatchOperation minPriceOperation = getMinPriceOperation(Float.parseFloat(queryParams.get("menorPreco")));
            aggregationOperations.add(minPriceOperation);
        }

        ProjectionOperation projectionOperation = getProjectOperation();
        aggregationOperations.add(projectionOperation);

        TypedAggregation<Ad> agg = Aggregation.newAggregation(Ad.class, aggregationOperations);

        return mongoTemplate.aggregate(agg, "ads", Ad.class).getMappedResults();

    }

    private MatchOperation getMaxPriceOperation(float maiorPreco) {
        Criteria priceCriteria = Criteria.where("negociacao.preco").lt(maiorPreco);
        return match(priceCriteria);
    }

    private MatchOperation getMinPriceOperation(float menorPreco) {
        Criteria priceCriteria = Criteria.where("negociacao.preco").gt(menorPreco);
        return match(priceCriteria);
    }

    private ProjectionOperation getProjectOperation() {
        return project(
            "_id",
            "veiculo",
            "negociacao",
            "documentacao",
            "imagens",
            "createdAt",
            "updatedAt",
            "usuario"
        );
    }
}
