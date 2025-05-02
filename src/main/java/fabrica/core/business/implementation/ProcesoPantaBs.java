package fabrica.core.business.implementation;

import fabrica.core.business.input.ProcesoPlantaService;
import fabrica.core.business.input.ProcesoService;
import fabrica.core.business.output.ProcesoRepository;
import fabrica.core.entity.Proceso;
import fabrica.core.entity.ProcesoPlanta;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class ProcesoPantaBs implements ProcesoPlantaService {
    @Inject
    ProcesoPlantaService procesoPlantaService;

    @Override
    public List<ProcesoPlanta> listAll() {
        return procesoPlantaService.listAll();
    }
}
