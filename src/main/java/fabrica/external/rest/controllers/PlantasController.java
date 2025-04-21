package fabrica.external.rest.controllers;

import fabrica.core.business.input.PlantaService;
import fabrica.external.rest.dto.PlantasDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;

import java.util.List;
import java.util.stream.Collectors;

public class PlantasController {
    @Inject
    PlantaService plantaService;

    @GET
    public List<PlantasDto> list() {
        return plantaService.listAll().stream().map(PlantasDto::fromEntity).collect(Collectors.toList());
    }
}