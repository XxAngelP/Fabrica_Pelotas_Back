package Dificultad;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("dificultad")
public class DificultadResource {
    @Inject
    DificultadRepository DificultadRepository;

    @GET
    public List<Dificultad> list() {
        return DificultadRepository.listAll();
    }
}
