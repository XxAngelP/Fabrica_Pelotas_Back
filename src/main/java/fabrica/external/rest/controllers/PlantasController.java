package fabrica.external.rest.controllers;

import fabrica.core.business.input.PlantaService;
import fabrica.external.rest.dto.PlantasDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.util.List;
import java.util.stream.Collectors;

@Path("fabrica/plantas")
@Produces("application/json")
@Consumes("application/json")
public class PlantasController {
    @Inject
    PlantaService plantaService;

    @GET
    public List<PlantasDto> list() {
        return plantaService.listAll().stream().map(PlantasDto::fromEntity).collect(Collectors.toList());
    }
}