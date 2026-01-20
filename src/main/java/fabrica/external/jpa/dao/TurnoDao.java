package fabrica.external.jpa.dao;

import fabrica.core.business.output.TurnoRepository;
import fabrica.core.entity.Turno;
import fabrica.external.jpa.model.TurnoPanache;
import fabrica.external.jpa.repositories.TurnoPanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class TurnoDao implements TurnoRepository {
    @Inject
    TurnoPanacheRepository turnoPanacheRepository;

    @Override
    public List<Turno> findAll() {
        return turnoPanacheRepository.listAll().stream().map(TurnoPanache::toEntity).collect(Collectors.toList());
    }
}
