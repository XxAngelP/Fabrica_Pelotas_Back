package Tecnico;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;

import java.util.List;

@Path("tecnico")
public class TecnicoResource {
    @Inject
    private TecnicoRepository tecnicoRepository;

    @GET
    public List<Tecnico> getAll() {
        return tecnicoRepository.listAll();
    }

    @GET
    @Path("{dni}")
    public Tecnico get(@PathParam("dni") Long dni) {
        return tecnicoRepository.findById(dni);
    }

    @POST
    @Transactional
    public Tecnico insert(Tecnico tecnico) {
        tecnicoRepository.persist(tecnico);
        return tecnico;
    }

    @PUT
    @Transactional
    @Path("{dni}")
    public Tecnico update(@PathParam("dni") Long dni, Tecnico tecnico) {
        var updatedTecnico = tecnicoRepository.findById(dni);
        if(updatedTecnico != null) {
            updatedTecnico.setNombreTecnico(tecnico.getNombreTecnico());
            updatedTecnico.setApellidoTecnico(tecnico.getApellidoTecnico());
            updatedTecnico.setTelefono1Tecnico(tecnico.getTelefono1Tecnico());
            updatedTecnico.setTelefono2Tecnico(tecnico.getTelefono2Tecnico());
            updatedTecnico.setTelefono3Tecnico(tecnico.getTelefono3Tecnico());
            updatedTecnico.setEmailTecnico(tecnico.getEmailTecnico());
            tecnicoRepository.persist(updatedTecnico);
        }
        return updatedTecnico;
    }

    @DELETE
    @Transactional
    @Path("{dni}")
    public void delete(@PathParam("dni") Long dni){
        tecnicoRepository.deleteById(dni);
    }
}
