package fabrica.external.rest.controllers;

import fabrica.core.business.input.TecnicoService;
import fabrica.external.rest.dto.TecnicoDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.util.List;
import java.util.stream.Collectors;

@Path("fabrica/tecnico")
@Produces("application/json")
@Consumes("application/json")
public class TecnicoController {
    @Inject
    TecnicoService tecnicoService;

    @GET
    public List<TecnicoDto> list() {
        return tecnicoService.listAll().stream().map(TecnicoDto::fromEntity).collect(Collectors.toList());
    }
}
