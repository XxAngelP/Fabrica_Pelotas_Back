package fabrica.core.business.input;

import fabrica.core.entity.Estatus;

import java.util.List;
/**
 * Este Servicio es independiente y solo manejara metodos GET
 * para obtener los estatus como catalogo para vincular
 * a las maquinas.
 */
public interface EstatusService {
    List<Estatus> listAll();
}
