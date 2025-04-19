package fabrica.core.business.implementation;

import fabrica.core.business.input.TurnoService;
import fabrica.core.business.output.TurnoRepository;
import fabrica.core.entity.Turno;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class TurnoBs implements TurnoService {
    @Inject
    TurnoRepository turnoRepository;

    @Override
    public List<Turno> listAll(){
        return turnoRepository.findAll();
    }
}
