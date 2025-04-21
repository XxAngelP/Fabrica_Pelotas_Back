package fabrica.external.jpa.dao;

import fabrica.core.business.output.PlantasRepository;
import fabrica.core.entity.Plantas;
import fabrica.external.jpa.model.PlantasPanache;
import fabrica.external.jpa.repositories.PlantasPanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PlantasDao implements PlantasRepository {
    @Inject
    PlantasPanacheRepository plantasPanacheRepository;

    @Override
    public List<Plantas> findAll() {
        return plantasPanacheRepository.listAll().stream().map(PlantasPanache::toEntity).collect(Collectors.toList());
    }
}
