package fabrica.external.jpa.repositories;

import fabrica.external.jpa.model.ProcesoPlantaPanache;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProcesoPlantaPanacheRepository implements PanacheRepository<ProcesoPlantaPanache> {
}
