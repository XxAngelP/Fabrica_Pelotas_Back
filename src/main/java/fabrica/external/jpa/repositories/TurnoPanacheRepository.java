package fabrica.external.jpa.repositories;

import fabrica.external.jpa.model.TurnoPanache;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TurnoPanacheRepository implements PanacheRepository<TurnoPanache> {
}
