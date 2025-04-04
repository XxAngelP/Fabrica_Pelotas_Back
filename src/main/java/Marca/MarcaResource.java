package Marca;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("marca")
public class MarcaResource {
    @Inject
    MarcaRepository marcaRepository;

    @GET
    public List<Marca> getAll(){
        return marcaRepository.listAll();
    }

    @GET
    @Path("{id}")
    public Marca get(@PathParam("id") Long id){
        return marcaRepository.findById(id);
    }

    @POST
    @Transactional
    public Response insert(Marca marca){
        marcaRepository.persist(marca);
        return Response.ok("Marca Agregada Correctamente").build();
    }

    @PUT
    @Path("{id}")
    @Transactional
    public Response update(@PathParam("id") Long id, Marca marca){
        var updatedMarca = marcaRepository.findById(id);
        if(updatedMarca != null){
            updatedMarca.setNombreMarca(marca.getNombreMarca());
            marcaRepository.persist(updatedMarca);
            return Response.ok("Marca Actualizada").build();
        }
        return Response.status(404).entity("Marca no encontrada").build();
    }
}
