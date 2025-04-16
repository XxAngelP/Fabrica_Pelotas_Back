package fabrica.external.rest.controllers;

import Dificultad.Dificultad;
import fabrica.core.business.input.DificultadService;
import fabrica.external.rest.dto.DificultadDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;

import java.util.List;
import java.util.stream.Collectors;

public class DificultadController {
    @Inject
    DificultadService dificultadService;

    @GET
    public List<DificultadDto> list() {
        return dificultadService.listAll().stream().map(DificultadDto::fromEntity).collect(Collectors.toList());
    }
}
