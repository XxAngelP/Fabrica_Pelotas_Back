package fabrica.external.jpa.repositories;

import fabrica.external.jpa.model.EstatusPanache;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstatusPanacheRepository implements PanacheRepository<EstatusPanache> {
}
