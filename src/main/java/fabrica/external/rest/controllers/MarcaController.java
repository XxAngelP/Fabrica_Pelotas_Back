package fabrica.external.rest.controllers;

import fabrica.core.business.input.MarcaService;
import fabrica.external.rest.dto.MarcaDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;

import java.util.List;
import java.util.stream.Collectors;

@Path("fabrica/marca")
@Produces("application/json")
@Consumes("application/json")
public class MarcaController {
    @Inject
    MarcaService marcaService;

    @GET
    public List<MarcaDto> listAll() {
        return marcaService.listAll().stream().map(MarcaDto::fromEntity).collect(Collectors.toList());
    }
}
