package com.lucasfilm.starwars.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record FilmResponseDto(
        @JsonProperty("name") String name,
        @JsonProperty("director") String director,
        @JsonProperty("launched") String date){
}
