package fabrica.core.business.implementation;

import fabrica.core.business.input.PlantasService;
import fabrica.core.business.output.PlantasRepository;
import fabrica.core.entity.Plantas;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class PlantasBs implements PlantasService {
    @Inject
    PlantasRepository plantasRepository;

    @Override
    public List<Plantas> listAll() {
        return plantasRepository.findAll();
    }
}
