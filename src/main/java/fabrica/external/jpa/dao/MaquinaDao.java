package fabrica.external.jpa.dao;

import fabrica.core.business.output.MaquinaRepository;
import fabrica.core.entity.Maquina;
import fabrica.external.jpa.model.MaquinaPanache;
import fabrica.external.jpa.repositories.MaquinaPanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class MaquinaDao implements MaquinaRepository {
    @Inject
    MaquinaPanacheRepository maquinaPanacheRepository;

    @Override
    public List<Maquina> findAll() {
        return maquinaPanacheRepository.listAll().stream().map(MaquinaPanache::toEntity).collect(Collectors.toList());
    }
}
