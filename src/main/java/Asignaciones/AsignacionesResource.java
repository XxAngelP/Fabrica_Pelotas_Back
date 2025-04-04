package Asignaciones;

import Assets.PaginatedResponse;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("asignaciones")
public class AsignacionesResource {

    private AsignacionesRepository asignacionesRepository;
    private AsignacionesMapperImpl asignacionesMapper;

    @Inject
    public AsignacionesResource(AsignacionesRepository asignacionesRepository, AsignacionesMapperImpl asignacionesMapper) {
        this.asignacionesRepository = asignacionesRepository;
        this.asignacionesMapper = asignacionesMapper;
    }

    @GET
    @Path("paginated/{page}")
    public PaginatedResponse listPaginated(@PathParam("page") int page) {
        return asignacionesMapper.listPaginated(page);
    }

    @GET
    public List<ResponseAsignacionesDTO> list() {
        return asignacionesMapper.getAll();
    }

    @GET
    @Path("all")
    public List<Asignaciones> listAll(){
        return asignacionesRepository.listAll();
    }

    @GET
    @Path("{id}")
    public AsignacionesDTO get(@PathParam("id") Long id) {
        var asignaciones = asignacionesRepository.findById(id);
        if (asignaciones != null) {
            return asignacionesMapper.get(asignaciones);
        }
        return null;
    }

    @POST
    @Transactional
    public Asignaciones create(AsignacionesDTO asignaciones) {
            var nuevo = asignacionesMapper.create(asignaciones);
            asignacionesRepository.persist(nuevo);
            return nuevo;
    }

    @PUT
    @Transactional
    @Path("{id}")
    public Asignaciones update(@PathParam("id") Long id, AsignacionesDTO asignaciones) {
        var uptdatedAsignaciones = asignacionesRepository.findById(id);
        if (uptdatedAsignaciones != null) {
            asignacionesMapper.update(asignaciones, uptdatedAsignaciones);
            asignacionesRepository.persist(uptdatedAsignaciones);
            return uptdatedAsignaciones;
        }
        return null;
    }

    @DELETE
    @Transactional
    @Path("{id}")
    public void delete(@PathParam("id") Long id){
        asignacionesRepository.deleteById(id);
    }
}
