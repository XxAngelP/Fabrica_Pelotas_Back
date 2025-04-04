package Tecnico;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TecnicoRepository implements PanacheRepository<Tecnico> {
}
