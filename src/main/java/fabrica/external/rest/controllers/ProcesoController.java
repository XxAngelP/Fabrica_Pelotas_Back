package fabrica.external.rest.controllers;

import fabrica.core.business.input.ProcesoService;
import fabrica.external.rest.dto.MaquinaDto;
import fabrica.external.rest.dto.ProcesoDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import java.util.List;
import java.util.stream.Collectors;

@Path("fabrica/procesos")
@Produces("application/json")
@Consumes("application/json")
public class ProcesoController {
    @Inject
    ProcesoService procesoService;

    @GET
    @APIResponse(
            responseCode = "200",
            description = "Peticion Exitosa",
            content = @Content(schema = @Schema(implementation = ProcesoDto.class))
    )
    public Response getProcesos() {
        return Response.ok(procesoService.listAll().stream().map(ProcesoDto::fromEntity).collect(Collectors.toList())).build();
    }
}
