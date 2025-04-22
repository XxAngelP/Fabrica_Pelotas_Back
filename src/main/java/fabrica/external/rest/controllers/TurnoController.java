package fabrica.external.rest.controllers;

import fabrica.core.business.input.TurnoService;
import fabrica.external.rest.dto.TurnoDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.util.List;
import java.util.stream.Collectors;

@Path("fabrica/turnos")
@Produces("application/json")
@Consumes("application/json")
public class TurnoController {
    @Inject
    TurnoService turnoService;

    @GET
    public List<TurnoDto> list() {
        return turnoService.listAll().stream().map(TurnoDto::fromEntity).collect(Collectors.toList());
    }
}
