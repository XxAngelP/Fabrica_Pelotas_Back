package fabrica.external.jpa.repositories;

import fabrica.external.jpa.model.MarcaPanache;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface MarcaPanacheRepository extends PanacheRepository<MarcaPanache> {
    MarcaPanache findByNombre(String nombre);
}
