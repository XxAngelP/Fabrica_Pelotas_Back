package fabrica.external.rest.controllers;


import fabrica.core.business.input.EstatusService;
import fabrica.external.rest.dto.EstatusDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import java.util.stream.Collectors;

@Path("fabrica/estatus")
@Produces("application/json")
@Consumes("application/json")
public class EstatusController {
    @Inject
    EstatusService estatusService;

    @GET
    @APIResponse(
            responseCode = "200",
            description = "Peticion Exitosa",
            content = @Content(schema = @Schema(implementation = EstatusDto.class))
    )
    public Response list() {
        return Response.ok(estatusService.listAll().stream().map(EstatusDto::fromEntity).collect(Collectors.toList())).build();
    }
}
