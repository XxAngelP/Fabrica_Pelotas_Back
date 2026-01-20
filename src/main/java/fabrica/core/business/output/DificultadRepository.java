package fabrica.core.business.output;

import fabrica.core.entity.Dificultad;

import java.util.List;

/**
 * Interfaz que define el contrato para la capa de negocio, que se encarga de
 * obtener la lista de dificultades.
 *
 * @author Angel Erenesto Baez S.
 */
public interface DificultadRepository {
    /**
     * Metodo que se encarga de obtener todas las dificultades registradas en la
     * base de datos.
     *
     * @return Un listado de todas las dificultades encontradas.
     */
    List<Dificultad> findAll();
}
