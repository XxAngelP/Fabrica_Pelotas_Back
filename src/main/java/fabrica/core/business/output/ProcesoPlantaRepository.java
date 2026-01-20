package fabrica.core.business.output;

import fabrica.core.entity.ProcesoPlanta;

import java.util.List;

public interface ProcesoPlantaRepository {
    List<ProcesoPlanta> findAll();
}
