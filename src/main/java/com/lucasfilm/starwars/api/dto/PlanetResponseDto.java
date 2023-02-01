package com.lucasfilm.starwars.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record PlanetResponseDto(
        @JsonProperty("id") String id,
        @JsonProperty("name") String name,
        @JsonProperty("weather") String weather,
        @JsonProperty("field") String field,
        @JsonProperty("films") List<FilmResponseDto> films

){
}
