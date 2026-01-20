package fabrica.core.business.output;

import fabrica.core.entity.Estatus;

import java.util.List;

public interface EstatusRepository {
    List<Estatus> findAll();
}
