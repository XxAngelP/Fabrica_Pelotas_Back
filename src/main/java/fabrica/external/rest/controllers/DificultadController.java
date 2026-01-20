package fabrica.external.rest.controllers;

import fabrica.core.business.input.DificultadService;
import fabrica.external.rest.dto.DificultadDto;
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

/**
 * Documentacion de la clase DificultadController.
 *
 * @author Angel Erenesto Baez S.
 */
@Path("fabrica/dificultad")
@Produces("application/json")
@Consumes("application/json")
/**
 * Controlador encargado de gestionar las solicitudes de obtener la lista de
 * dificultades.
 *
 * @author Angel Erenesto Baez S.
 */
public class DificultadController {
    @Inject
    DificultadService dificultadService;

    @GET
    @APIResponse(
            responseCode = "200",
            description = "Peticion Exitosa, se devuelve la lista de dificultades.",
            content = @Content(schema = @Schema(implementation = DificultadDto.class))
    )
    /**
     * Metodo que se encarga de obtener la lista de dificultades.
     *
     * @return La lista de dificultades encontradas.
     */
    public Response list() {
        return Response.ok(dificultadService.listAll().stream().map(DificultadDto::fromEntity).collect(Collectors.toList())).build();
    }
}
