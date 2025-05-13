package fabrica.external.rest.controllers;

import fabrica.core.business.input.MarcaService;
import fabrica.external.rest.dto.MarcaDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import java.util.stream.Collectors;

@Path("fabrica/marca")
@Produces("application/json")
@Consumes("application/json")
public class MarcaController {
    @Inject
    MarcaService marcaService;

    @GET
    @APIResponse(
            responseCode = "200",
            description = "Peticion Exitosa",
            content = @Content(schema = @Schema(implementation = MarcaDto.class))
    )
    public Response listAll() {
        return Response.ok(marcaService.listAll().stream().map(MarcaDto::fromEntity).collect(Collectors.toList())).build();
    }
}
