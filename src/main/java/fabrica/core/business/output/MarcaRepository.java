package fabrica.core.business.output;

import fabrica.core.entity.Marca;
import fabrica.external.jpa.model.MarcaPanache;

import java.util.List;
import java.util.Optional;

public interface MarcaRepository {
    List<Marca> findAll();

    Optional<Marca> findMarcaById(Integer id);

    Boolean saveMarca(Marca marca);

    Optional<Marca> findMarcaByNombre(String nombre);
}
