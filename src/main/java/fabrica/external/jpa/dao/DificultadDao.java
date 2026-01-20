package fabrica.external.jpa.dao;

import fabrica.core.business.output.DificultadRepository;
import fabrica.core.entity.Dificultad;
import fabrica.external.jpa.model.DificultadPanache;
import fabrica.external.jpa.repositories.DificultadPanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementacion de la interfaz DificultadRepository que se encarga de comunicar a la logica de negocio
 * con la capa de persistencia de la entidad Dificultad.
 *
 * @author Angel Erenesto Baez S.
 */
@ApplicationScoped
public class DificultadDao implements DificultadRepository {
    /**
     * Inyeccion de dependencia del repositorio de la entidad DificultadPanache.
     */
    @Inject
    DificultadPanacheRepository dificultadPanacheRepository;

    /**
     * Metodo que se encarga de obtener todas las dificultades de la base de datos.
     *
     * @return Un listado de todas las dificultades encontradas.
     */
    @Override
    public List<Dificultad> findAll() {
        return dificultadPanacheRepository.listAll().stream().map(DificultadPanache::toEntity).collect(Collectors.toList());
    }
}
