package com.lucasfilm.starwars.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Document(collection = "reconciliation")
public class PlanetEntity {
    @Id
    private String id;

    @Field("external_id")
    @Indexed
    private Integer externalId;
    @Field("name")
    @TextIndexed
    private String name;

    @Field("weather")
    private String weather;

    @Field("field")
    private String field;

    @Field("created_at")
    private LocalDateTime createdAt;

    @Field("films")
    private List<FilmEntity> films;

}
