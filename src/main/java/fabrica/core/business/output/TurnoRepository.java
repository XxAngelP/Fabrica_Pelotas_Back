package fabrica.core.business.output;

import fabrica.core.entity.Turno;

import java.util.List;

public interface TurnoRepository {
    List<Turno> findAll();
}
