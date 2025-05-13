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
        //recibe la marca

        return null;
    }
}
