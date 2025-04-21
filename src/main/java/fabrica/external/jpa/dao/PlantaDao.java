package fabrica.external.jpa.dao;

import fabrica.core.business.output.PlantaRepository;
import fabrica.core.entity.Planta;
import fabrica.external.jpa.model.PlantaPanache;
import fabrica.external.jpa.repositories.PlantasPanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PlantaDao implements PlantaRepository {
    @Inject
    PlantasPanacheRepository plantasPanacheRepository;

    @Override
    public List<Planta> findAll() {
        return plantasPanacheRepository.listAll().stream().map(PlantaPanache::toEntity).collect(Collectors.toList());
    }
}
