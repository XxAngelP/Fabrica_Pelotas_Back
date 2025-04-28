package fabrica.core.business.input;

import fabrica.core.entity.Dificultad;

import java.util.List;

/**
 * Este Servicio es independiente y solo manejara metodos GET
 * para obtener las dificultades como catalogo para vincular
 * a los procesos.
 */
public interface DificultadService {
    List<Dificultad> listAll();
}
