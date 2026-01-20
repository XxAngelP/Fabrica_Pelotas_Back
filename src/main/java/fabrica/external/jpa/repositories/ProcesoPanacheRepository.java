package fabrica.external.jpa.repositories;

import fabrica.external.jpa.model.ProcesoPanache;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProcesoPanacheRepository implements PanacheRepository<ProcesoPanache> {
}
