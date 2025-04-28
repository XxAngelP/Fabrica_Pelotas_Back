package fabrica.core.business.input;

import fabrica.core.entity.Turno;

import java.util.List;
/**
 * Este Servicio es independiente y solo manejara metodos GET
 * para obtener los Turnos como catalogo para vincular
 * a las Asignaciones para los Tecnicos.
 */
public interface TurnoService {
    List<Turno> listAll();
}
