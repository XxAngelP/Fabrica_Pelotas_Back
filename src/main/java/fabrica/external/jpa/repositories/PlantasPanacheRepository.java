package fabrica.external.jpa.repositories;

import fabrica.external.jpa.model.PlantaPanache;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PlantasPanacheRepository implements PanacheRepository<PlantaPanache> {
}
