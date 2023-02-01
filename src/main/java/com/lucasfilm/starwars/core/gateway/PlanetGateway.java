package com.lucasfilm.starwars.core.gateway;

import com.lucasfilm.starwars.core.domain.PlanetDomain;

public interface PlanetGateway {
    public PlanetDomain save(PlanetDomain planet);

    public PlanetDomain findById(String id);

}
