package fabrica.external.jpa.repositories;

import fabrica.external.jpa.model.MarcaPanache;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MarcaPanacheRepository implements PanacheRepository<MarcaPanache> {
}
