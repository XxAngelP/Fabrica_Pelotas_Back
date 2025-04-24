package fabrica.external.jpa.dao;

import fabrica.core.business.output.EstatusRepository;
import fabrica.core.entity.Estatus;
import fabrica.external.jpa.model.EstatusPanache;
import fabrica.external.jpa.repositories.EstatusPanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class EstatusDao implements EstatusRepository {
    @Inject
    EstatusPanacheRepository estatusPanacheRepository;
    @Override
    public List<Estatus> findAll() {
        return estatusPanacheRepository.listAll().stream().map(EstatusPanache::toEntity).collect(Collectors.toList());
    }
}
