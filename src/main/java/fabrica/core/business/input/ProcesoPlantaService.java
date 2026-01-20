package fabrica.core.business.input;

import fabrica.core.entity.ProcesoPlanta;

import java.util.List;
/**
 * En este servicio se manejaran metodos GET,POST,PUT y DELETE
 * para obtener, crear, actualizar y eliminar los Procesos que
 * se relacionan con Plantas para integrar en las Maquinas.
 */
public interface ProcesoPlantaService {
    List<ProcesoPlanta> listAll();
}
