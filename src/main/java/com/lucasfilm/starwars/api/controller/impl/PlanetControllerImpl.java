package com.lucasfilm.starwars.api.controller.impl;

import com.lucasfilm.starwars.api.controller.PlanetApi;
import com.lucasfilm.starwars.api.dto.PlanetResponseDto;
import com.lucasfilm.starwars.core.usecase.PlanetUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlanetControllerImpl implements PlanetApi {
    private final PlanetUseCase useCase;

    @Override
    public PlanetResponseDto registre(String planetId) {
        return null;
    }

    @Override
    public List<PlanetResponseDto> list() {
        return null;
    }

    @Override
    public List<PlanetResponseDto> find(String id, String name) {
        return null;
    }

    @Override
    public void delete(String planetId) {

    }
}
