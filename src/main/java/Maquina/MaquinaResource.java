package Maquina;

import Assets.PaginatedResponse;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("maquina")
public class MaquinaResource {

    private MaquinaRepository maquinaRepository;
    private MaquinaMapperlmpl maquinaMapper;

    @Inject
    public MaquinaResource(MaquinaRepository maquinaRepository, MaquinaMapperlmpl maquinaMapper) {
        this.maquinaRepository = maquinaRepository;
        this.maquinaMapper = maquinaMapper;
    }

    @GET
    public List<ResponseMaquinaDTO> getAll(){
        return maquinaMapper.getAll();
    }

    @GET
    @Path("paginated")
    public PaginatedResponse<ResponseMaquinaDTO> listPaginated(@QueryParam("page") int page) {
        return maquinaMapper.listPaginated(page);
    }


    @POST
    @Transactional
    public Response insert(CreateMaquinaDTO maquina){
        var newMaquina = maquinaMapper.fromCreate(maquina);
        maquinaRepository.persist(newMaquina);
        return Response.ok("Maquina Agregada Correctamente").build();
    }

    @PUT
    @Transactional
    @Path("{id}")
    public Response update(@PathParam("id") Long id, UpdateMaquinaDTO maquina){
        var updatedMaquina = maquinaRepository.findById(id);
        if(updatedMaquina != null){
            maquinaMapper.fromUpdate(maquina, updatedMaquina);
            maquinaRepository.persist(updatedMaquina);
            return Response.ok("Maquina actualizada").build();
        }
        return Response.status(404).entity("Maquina no encontrada").build();
    }
}
