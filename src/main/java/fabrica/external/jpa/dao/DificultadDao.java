package fabrica.external.jpa.dao;

import fabrica.core.business.output.DificultadRepository;
import fabrica.core.entity.Dificultad;
import fabrica.external.jpa.model.DificultadPanache;
import fabrica.external.jpa.repositories.DificultadPanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class DificultadDao implements DificultadRepository {
    @Inject
    DificultadPanacheRepository dificultadPanacheRepository;

    @Override
    public List<Dificultad> findAll() {
        return dificultadPanacheRepository.listAll().stream().map(DificultadPanache::toEntity).collect(Collectors.toList());
    }
}
