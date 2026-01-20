package fabrica.core.business.input;

import fabrica.core.entity.Maquina;

import java.util.List;
/**
 * En este servicio se manejaran metodos GET,POST,PUT y DELETE
 * para obtener, crear, actualizar y eliminar Maquinas para
 * integrar en las Asignaciones.
 */
public interface MaquinaService {
    List<Maquina> listAll();
}
