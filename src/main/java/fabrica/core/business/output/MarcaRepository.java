package fabrica.core.business.output;

import fabrica.core.entity.Marca;
import fabrica.external.jpa.model.MarcaPanache;

import java.util.List;

public interface MarcaRepository {
    List<Marca> findAll();
}
