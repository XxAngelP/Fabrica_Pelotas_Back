package fabrica.core.business.output;

import fabrica.core.entity.Tecnico;

import java.util.List;

public interface TecnicoRepository {
    List<Tecnico> findAll();
}
