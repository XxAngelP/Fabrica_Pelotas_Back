package fabrica.core.business.implementation;

import fabrica.core.business.input.TecnicoService;
import fabrica.core.business.output.TecnicoRepository;
import fabrica.core.entity.Tecnico;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class TecnicoBs implements TecnicoService {
    @Inject
    TecnicoRepository tecnicoRepository;

    @Override
    public List<Tecnico> listAll() {
        return tecnicoRepository.findAll();
    }
}
