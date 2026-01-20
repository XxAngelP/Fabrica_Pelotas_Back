package fabrica.external.jpa.dao;

import fabrica.core.business.output.MarcaRepository;
import fabrica.core.entity.Marca;
import fabrica.external.jpa.model.MarcaPanache;
import fabrica.external.jpa.repositories.MarcaPanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@ApplicationScoped
public class MarcaDao implements MarcaRepository {
    @Inject
    MarcaPanacheRepository marcaPanacheRepository;

    @Override
    public List<Marca> findAll() {
        return marcaPanacheRepository.listAll().stream().map(MarcaPanache::toEntity).collect(Collectors.toList());
    }

    @Override
    public Optional<Marca> findMarcaById(Integer id) {
        Long identificador = Long.valueOf(id);
        return Optional.ofNullable(marcaPanacheRepository.findById(identificador).toEntity());
    }

    @Override
    public Boolean saveMarca(Marca marca) {
        marcaPanacheRepository.persist(MarcaPanache.fromEntity(marca));
        return true;
    }

    @Override
    public Optional<Marca> findMarcaByNombre(String nombre) {
        return Optional.ofNullable(marcaPanacheRepository.findByNombre(nombre).toEntity());
    }

    @Override
    public Boolean deleteMarca(Integer id) {
        Long Id = Long.valueOf(id);
        return marcaPanacheRepository.deleteById(Id);
    }


}
