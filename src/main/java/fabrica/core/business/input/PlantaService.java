package fabrica.core.business.input;

import fabrica.core.entity.Planta;

import java.util.List;
/**
 * En este servicio se manejaran metodos GET,POST,PUT y DELETE
 * para obtener, crear, actualizar y eliminar Plantas para
 * integrar en los ProcesosPlanta.
 */
public interface PlantaService {

    List<Planta> listAll();
}
