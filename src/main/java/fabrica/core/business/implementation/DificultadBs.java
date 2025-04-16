package fabrica.core.business.implementation;

import fabrica.core.business.input.DificultadService;
import fabrica.core.business.output.DificultadRepository;
import fabrica.core.entity.Dificultad;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class DificultadBs implements DificultadService {
    @Inject
    DificultadRepository dificultadRepository;

    @Override
    public List<Dificultad> listAll() {
        return dificultadRepository.findAll();
    }
}
