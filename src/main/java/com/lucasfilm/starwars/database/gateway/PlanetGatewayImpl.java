package com.lucasfilm.starwars.database.gateway;

import com.lucasfilm.starwars.core.domain.PlanetDomain;
import com.lucasfilm.starwars.core.gateway.PlanetGateway;
import com.lucasfilm.starwars.database.repository.PlanetMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PlanetGatewayImpl implements PlanetGateway {
    private final PlanetMongoRepository repository;

    @Override
    public PlanetDomain save(PlanetDomain planet) {
        return null;
    }

    @Override
    public PlanetDomain findById(String id) {
        return null;
    }
}
