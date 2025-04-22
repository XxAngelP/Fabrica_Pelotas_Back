package fabrica.external.rest.controllers;

import fabrica.core.business.input.ProcesoPlantaService;
import fabrica.external.rest.dto.ProcesoPlantaDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.util.List;
import java.util.stream.Collectors;

@Path("fabrica/procesoPlanta")
@Produces("application/json")
@Consumes("application/json")
public class ProcesoPlantaController {
    @Inject
    ProcesoPlantaService procesoPlantaService;

    @GET
    public List<ProcesoPlantaDto> list() {
        return procesoPlantaService.listAll().stream().map(ProcesoPlantaDto::fromEntity).collect(Collectors.toList());
    }
}
