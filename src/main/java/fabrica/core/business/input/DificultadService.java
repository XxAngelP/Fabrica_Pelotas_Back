package fabrica.core.business.input;

import fabrica.core.entity.Dificultad;

import java.util.List;

/**
 * Servicio para gestionar las operaciones relacionadas con las dificultades.
 */
public interface DificultadService {

    /**
     * Obtiene un listado de todas las dificultades registradas.
     *
     * @return Una lista que contiene todas las dificultades.
     */
    List<Dificultad> listAll();
}
