package com.lucasfilm.starwars.database.repository;

import com.lucasfilm.starwars.database.entity.PlanetEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetMongoRepository extends MongoRepository<PlanetEntity, String> {
    public PlanetEntity findByReconciliationId(String id);

}
