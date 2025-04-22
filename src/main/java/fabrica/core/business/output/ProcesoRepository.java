package fabrica.core.business.output;

import fabrica.core.entity.Proceso;

import java.util.List;

public interface ProcesoRepository {
    List<Proceso> findAll();
}
