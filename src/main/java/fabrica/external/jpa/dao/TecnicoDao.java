package fabrica.external.jpa.dao;

import fabrica.core.business.output.TecnicoRepository;
import fabrica.core.entity.Tecnico;
import fabrica.external.jpa.model.TecnicoPanache;
import fabrica.external.jpa.repositories.TecnicoPanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class TecnicoDao implements TecnicoRepository {
    @Inject
    TecnicoPanacheRepository tecnicoPanacheRepository;

    @Override
    public List<Tecnico> findAll() {
        return tecnicoPanacheRepository.listAll().stream().map(TecnicoPanache::toEntity).collect(Collectors.toList());
    }
}
