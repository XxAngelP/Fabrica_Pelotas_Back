package fabrica.core.business.implementation;

import fabrica.core.business.input.ProcesoService;
import fabrica.core.business.output.ProcesoRepository;
import fabrica.core.entity.Proceso;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class ProcesoPantaBs implements ProcesoService {
    @Inject
    ProcesoRepository procesoRepository;

    @Override
    public List<Proceso> listAll() {
        return procesoRepository.findAll();
    }
}
