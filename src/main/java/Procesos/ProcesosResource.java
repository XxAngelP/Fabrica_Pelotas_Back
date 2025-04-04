package Procesos;

import Assets.PaginatedResponse;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;

import java.util.List;

@Path("procesos")
public class ProcesosResource {
    private ProcesosRepository ProcesosRepository;
    private ProcesosMapperImpl procesosMapper;

    @Inject
    public ProcesosResource(ProcesosRepository ProcesosRepository, ProcesosMapperImpl procesosMapper) {
        this.ProcesosRepository = ProcesosRepository;
        this.procesosMapper = procesosMapper;
    }
    @GET
    public List<ProsesosResponseDTO> list() {
        return procesosMapper.getAll();
    }

    @GET
    @Path("page")
    public PaginatedResponse<ProsesosResponseDTO> list(@QueryParam("page") @DefaultValue("1") int page){
        return procesosMapper.obtenerPanacheQuery(page);
    }

    @GET
    @Path("{id}")
    public ProsesosResponseDTO get(@PathParam("id") Long id) {
        Procesos proceso = ProcesosRepository.findById(id);
        return procesosMapper.fromEntity(proceso);
    }

    @POST
    @Transactional
    public Procesos save(CreateProcesosDTO Procesos) {
        var proceso = procesosMapper.fromCreate(Procesos);
        ProcesosRepository.persist(proceso);
        return proceso;
    }

    @PUT
    @Transactional
    @Path("{id}")
    public Procesos update(@PathParam("id") Long id, UpdateProcesosDTO procesos) {
        Procesos found = ProcesosRepository.findById(id);
        procesosMapper.fromUpdate(procesos, found);
        ProcesosRepository.persist(found);
        return found;
    }
}
