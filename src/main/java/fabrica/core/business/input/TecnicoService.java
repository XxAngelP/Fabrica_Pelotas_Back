package fabrica.core.business.input;

import fabrica.core.entity.Tecnico;

import java.util.List;
/**
 * En este servicio se manejaran metodos GET,POST,PUT y DELETE
 * para obtener, crear, actualizar y eliminar Tecnicos para
 * integrar en las Asignaciones.
 */
public interface TecnicoService {
    List<Tecnico> listAll();
}
