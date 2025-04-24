package fabrica.core.business.implementation;

import fabrica.core.business.input.DificultadService;
import fabrica.core.business.output.DificultadRepository;
import fabrica.core.entity.Dificultad;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
/**
 * Implementacion del servicio para la gestion de las dificultades.
 *
 * @author Angel Erenesto Baez S.
 */
public class DificultadBs implements DificultadService {
    /**
     * Inyeccion del repositorio que se encarga de comunicar con la capa de
     * persistencia.
     */
    @Inject
    DificultadRepository dificultadRepository;

    /**
     * Metodo que se encarga de obtener todas las dificultades registradas en la
     * base de datos.
     *
     * @return Un listado de todas las dificultades encontradas.
     */
    @Override
    public List<Dificultad> listAll() {
        return dificultadRepository.findAll();
    }
}
