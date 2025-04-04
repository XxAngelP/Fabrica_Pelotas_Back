package Turno;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("turno")
public class TurnoResource {
    @Inject
    TurnoRepository turnoRepository;
    @Inject
    TurnoDTOImpl mapper;

    @GET
    public List<TurnoDTO> list() {
        return mapper.getAll();
    }
}
