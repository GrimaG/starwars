package com.lucasfilm.starwars.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class FilmEntity {

    @Id
    private Integer id;

    @Field("name")
    private String name;

    @Field("director")
    private String director;

    @Field("release_date")
    private LocalDateTime released;


}
