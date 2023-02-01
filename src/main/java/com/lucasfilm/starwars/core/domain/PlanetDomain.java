package com.lucasfilm.starwars.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class PlanetDomain {

    private String id;
    private Integer externalId;
    private String name;
    private String weather;
    private String field;
    private LocalDateTime createdAt;
    private LocalDateTime lastUpdate;

}
