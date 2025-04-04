package Turno;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TurnoRepository implements PanacheRepository<Turno> {
}
