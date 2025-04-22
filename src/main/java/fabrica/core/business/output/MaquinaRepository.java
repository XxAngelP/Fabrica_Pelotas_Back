package fabrica.core.business.output;

import fabrica.core.entity.Maquina;

import java.util.List;

public interface MaquinaRepository {
    List<Maquina> findAll();
}
