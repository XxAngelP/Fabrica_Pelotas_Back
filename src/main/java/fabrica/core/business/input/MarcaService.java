package fabrica.core.business.input;

import fabrica.core.entity.Marca;
import fabrica.external.jpa.model.MarcaPanache;

import java.util.List;
import java.util.Optional;

/**
 * En este servicio se manejaran metodos GET,POST,PUT y DELETE
 * para obtener, crear, actualizar y eliminar Marcas para
 * integrar en las Maquinas.
 */
public interface MarcaService {
    List<Marca> listAll();

    Boolean createMarca(Marca marca);

    Boolean updateMarca(Marca marca);

    Boolean deleteMarca(Integer id);
}
