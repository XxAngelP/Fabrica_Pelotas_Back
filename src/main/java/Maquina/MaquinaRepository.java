package Maquina;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MaquinaRepository implements PanacheRepository<Maquina> {
}
