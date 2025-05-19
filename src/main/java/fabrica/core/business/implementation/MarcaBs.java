package fabrica.core.business.implementation;

import fabrica.core.business.input.MarcaService;
import fabrica.core.business.output.MarcaRepository;
import fabrica.core.entity.Marca;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class MarcaBs implements MarcaService {
    @Inject
    MarcaRepository marcaRepository;

    @Override
    public List<Marca> listAll() {
        return marcaRepository.findAll();
    }

    @Override
    public Boolean createMarca(Marca marca) {
        if(marcaRepository.findMarcaByNombre(marca.getNombreMarca()).isPresent()){
            return false;
        }
        return marcaRepository.saveMarca(marca);
    }

    @Override
    public Boolean updateMarca(Marca marca) {
        if(marcaRepository.findMarcaByNombre(marca.getNombreMarca()).isPresent()){
            return marcaRepository.saveMarca(marca);
        }
        return false;
    }

    @Override
    public Boolean deleteMarca(Integer id) {
        if(marcaRepository.findMarcaById(id).isPresent()){
            marcaRepository.deleteMarca(id);
        }
        return true;
    }
}
