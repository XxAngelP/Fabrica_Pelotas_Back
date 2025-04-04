package ProcesoPlanta;

import Assets.PaginatedResponse;
import Plantas.PlantasRepository;
import Procesos.ProcesosRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.NoSuchElementException;

@Path("procesoPlanta")
public class ProcesoPlantaResource {
    private ProcesoPlantaRepository ProcesoPlantaRepository;
    private ProcesosPlantaMapperImpl mapper;

    @Inject
    public ProcesoPlantaResource(ProcesoPlantaRepository ProcesoPlantaRepository, ProcesosPlantaMapperImpl pp) {
        this.ProcesoPlantaRepository = ProcesoPlantaRepository;
        this.mapper = pp;
    }

     @GET
     public List<ResponseProcesoPlantaDTO> list() {
        return mapper.getAll();
     }

     @GET
     @Path("{id}")
     public ResponseProcesoPlantaDTO find(@PathParam("id") Long id){
        ProcesoPlanta pp = ProcesoPlantaRepository.findById(id);
        return mapper.find(pp);
     }

     @GET
     @Path("{id}")
     public PaginatedResponse<ResponseProcesoPlantaDTO> get(@PathParam("id") int page) {
         return mapper.page(page);
     }

     @POST
     @Transactional
     public Response save(ProcesoPlantaDTO ProcesoPlanta) {
        var pp = mapper.create(ProcesoPlanta);
        ProcesoPlantaRepository.persist(pp);
        return Response.ok("Nueva asignacion creada").build();
     }

    @PUT
    @Transactional
    @Path("{id}")
    public Response update(@PathParam("id") Long id, ProcesoPlantaDTO ProcesoPlanta) {
        var updatedProcesoPlanta = ProcesoPlantaRepository.findById(id);
        if (updatedProcesoPlanta != null) {
            mapper.update(ProcesoPlanta,updatedProcesoPlanta);
            ProcesoPlantaRepository.persist(updatedProcesoPlanta);
            return Response.ok("Asignacion de proceso actualizada correctamente").build();
        }
        return Response.status(404).entity("Asignacion de proceso no encontrada").build();
    }
}
