package fabrica.external.jpa.dao;

import fabrica.core.business.output.ProcesoPlantaRepository;
import fabrica.core.entity.ProcesoPlanta;
import fabrica.external.jpa.model.ProcesoPlantaPanache;
import fabrica.external.jpa.repositories.ProcesoPlantaPanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class ProcesoPlantaDao implements ProcesoPlantaRepository {
    @Inject
    ProcesoPlantaPanacheRepository procesoPlantaPanacheRepository;

    @Override
    public List<ProcesoPlanta> findAll() {
        return procesoPlantaPanacheRepository.findAll().stream().map(ProcesoPlantaPanache::toEntity).collect(Collectors.toList());
    }
}
