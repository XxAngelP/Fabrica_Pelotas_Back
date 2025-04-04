package ProcesoPlanta;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProcesoPlantaRepository implements PanacheRepository<ProcesoPlanta> {
}
