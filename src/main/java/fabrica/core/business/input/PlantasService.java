package fabrica.core.business.input;

import fabrica.core.entity.Plantas;
import fabrica.external.jpa.model.PlantasPanache;

import java.util.List;

public interface PlantasService {

    List<Plantas> listAll();
}
