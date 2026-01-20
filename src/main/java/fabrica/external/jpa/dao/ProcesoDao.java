package fabrica.external.jpa.dao;

import fabrica.core.business.output.ProcesoRepository;
import fabrica.core.entity.Proceso;
import fabrica.external.jpa.model.ProcesoPanache;
import fabrica.external.jpa.repositories.ProcesoPanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class ProcesoDao implements ProcesoRepository {

    @Inject
    ProcesoPanacheRepository procesoPanacheRepository;

    @Override
    public List<Proceso> findAll() {
        return procesoPanacheRepository.listAll().stream().map(ProcesoPanache::toEntity).collect(Collectors.toList());
    }
}
