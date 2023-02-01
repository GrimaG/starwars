package com.lucasfilm.starwars.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@Builder
public class FilmDomain {
    private Integer externalID;
    private String name;
    private String director;
    private LocalDateTime released;

}
