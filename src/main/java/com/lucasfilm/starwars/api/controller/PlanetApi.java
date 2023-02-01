package com.lucasfilm.starwars.api.controller;

import com.lucasfilm.starwars.api.dto.PlanetResponseDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/planet")
public interface PlanetApi {

    @ApiOperation("Planet Api" )

    @PutMapping("/registre/{planet_id}")
    @ResponseStatus(code = HttpStatus.CREATED, reason = "CREATED")
    public PlanetResponseDto registre(@PathVariable("planet_id") String planetId);

    @GetMapping ("/list")
    public List<PlanetResponseDto> list();

    @GetMapping ("/search")
    public List<PlanetResponseDto> find(@RequestParam("planet_id") String id, @RequestParam("name") String name);

    @DeleteMapping ("/{planet_id}")
    @ResponseStatus(code = HttpStatus.OK, reason = "OK")
    public void delete(@PathVariable("planet_id") String planetId);



}
