package fabrica.external.rest.controllers;

import fabrica.core.business.input.TurnoService;
import fabrica.external.rest.dto.MaquinaDto;
import fabrica.external.rest.dto.TurnoDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import java.util.List;
import java.util.stream.Collectors;

@Path("fabrica/turnos")
@Produces("application/json")
@Consumes("application/json")
public class TurnoController {
    @Inject
    TurnoService turnoService;

    @GET
    @APIResponse(
            responseCode = "200",
            description = "Peticion Exitosa",
            content = @Content(schema = @Schema(implementation = TurnoDto.class))
    )
    public Response list() {
        return Response.ok(turnoService.listAll().stream().map(TurnoDto::fromEntity).collect(Collectors.toList())).build();
    }
}
