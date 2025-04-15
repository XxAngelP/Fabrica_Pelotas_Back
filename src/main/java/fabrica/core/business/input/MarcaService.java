package fabrica.core.business.input;

import fabrica.core.entity.Marca;
import fabrica.external.jpa.model.MarcaPanache;

import java.util.List;

public interface MarcaService {
    List<Marca> listAll();
}
