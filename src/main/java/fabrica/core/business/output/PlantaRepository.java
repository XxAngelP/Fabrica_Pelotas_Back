package fabrica.core.business.output;

import fabrica.core.entity.Planta;

import java.util.List;

public interface PlantaRepository {
    List<Planta> findAll();
}
