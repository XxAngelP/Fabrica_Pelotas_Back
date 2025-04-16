package fabrica.core.business.output;

import fabrica.core.entity.Dificultad;

import java.util.List;

public interface DificultadRepository {
    List<Dificultad> findAll();
}
