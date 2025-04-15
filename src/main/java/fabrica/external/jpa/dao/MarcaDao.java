package fabrica.external.jpa.dao;

import fabrica.core.business.output.MarcaRepository;
import fabrica.core.entity.Marca;
import fabrica.external.jpa.model.MarcaPanache;
import fabrica.external.jpa.repositories.MarcaPanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class MarcaDao implements MarcaRepository {
    @Inject
    MarcaPanacheRepository marcaPanacheRepository;

    @Override
    public List<Marca> findAll() {
        return marcaPanacheRepository.listAll().stream().map(MarcaPanache::toEntity).collect(Collectors.toList());
    }
}
