package fabrica.core.business.output;

import fabrica.core.entity.Plantas;

import java.util.List;

public interface PlantasRepository {
    List<Plantas> findAll();
}
