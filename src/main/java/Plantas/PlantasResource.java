package Plantas;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.specimpl.BuiltResponseEntityNotBacked;

import java.util.List;

@Path("plantas")
public class PlantasResource {

    @Inject
    private PlantasRepository plantasRepository;

    @GET
    public List<Plantas> list(){
        return plantasRepository.listAll();
    }

    @GET
    @Path("{id}")
    public Plantas get(@PathParam("id") Long id){
        return plantasRepository.findById(id);
    }

    @POST
    @Transactional
    public Response insert(Plantas plantas){
        plantasRepository.persist(plantas);
        return Response.ok("Planta Agregada Correctamente").build();
    }

    @PUT
    @Transactional
    @Path("{id}")
    public Response update(@PathParam("id") Long id, Plantas plantas){
        var updatedPlanta = plantasRepository.findById(id);
        if(updatedPlanta != null){
            updatedPlanta.setNombrePlanta(plantas.getNombrePlanta());
            updatedPlanta.setColorPlanta(plantas.getColorPlanta());
            updatedPlanta.setSuperficie(plantas.getSuperficie());
            plantasRepository.persist(updatedPlanta);
            return Response.ok("Planta Actualizada").build();
        }
        return Response.status(404).entity("Planta no encontrada").build();
    }

}
