package fabrica.external.rest.controllers;

import fabrica.core.business.input.ProcesoService;
import fabrica.external.rest.dto.ProcesoDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("fabrica/procesos")
@Produces("application/json")
@Consumes("application/json")
public class ProcesoController {
    @Inject
    ProcesoService procesoService;

    @GET
    public List<ProcesoDto> getProcesos() {
        return procesoService.listAll().stream().map(ProcesoDto::fromEntity).collect(Collectors.toList());
    }
}
