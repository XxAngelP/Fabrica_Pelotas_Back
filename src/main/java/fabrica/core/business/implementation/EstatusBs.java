package fabrica.core.business.implementation;

import fabrica.core.business.input.EstatusService;
import fabrica.core.business.output.EstatusRepository;
import fabrica.core.entity.Estatus;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class EstatusBs implements EstatusService {
    @Inject
    private EstatusRepository estatusRepository;

    @Override
    public List<Estatus> listAll() {
        return estatusRepository.findAll();
    }
}
