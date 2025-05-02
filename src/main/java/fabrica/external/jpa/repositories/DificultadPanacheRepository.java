package fabrica.external.jpa.repositories;

import fabrica.external.jpa.model.DificultadPanache;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Repositorio para la entidad DificultadPanache.
 *
 * @author Angel Erenesto Baez S.
 */
@ApplicationScoped
public class DificultadPanacheRepository implements PanacheRepository<DificultadPanache> {
}
