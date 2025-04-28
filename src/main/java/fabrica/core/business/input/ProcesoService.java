package fabrica.core.business.input;

import fabrica.core.entity.Proceso;

import java.util.List;
/**
 * En este servicio se manejaran metodos GET,POST,PUT y DELETE
 * para obtener, crear, actualizar y eliminar Procesos para
 * integrar en los Procesos Planta.
 */
public interface ProcesoService {
    List<Proceso> listAll();
}
