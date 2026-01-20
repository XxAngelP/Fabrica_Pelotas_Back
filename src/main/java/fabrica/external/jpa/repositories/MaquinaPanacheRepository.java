package fabrica.external.jpa.repositories;

import fabrica.external.jpa.model.MaquinaPanache;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MaquinaPanacheRepository implements PanacheRepository<MaquinaPanache> {
}
