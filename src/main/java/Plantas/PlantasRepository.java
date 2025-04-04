package Plantas;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PlantasRepository implements PanacheRepository<Plantas> {
}
