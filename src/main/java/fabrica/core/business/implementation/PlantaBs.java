package fabrica.core.business.implementation;

import fabrica.core.business.input.PlantaService;
import fabrica.core.business.output.PlantaRepository;
import fabrica.core.entity.Planta;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class PlantaBs implements PlantaService {
    @Inject
    PlantaRepository plantaRepository;

    @Override
    public List<Planta> listAll() {
        return plantaRepository.findAll();
    }
}
