package fabrica.core.business.implementation;

import fabrica.core.business.input.MaquinaService;
import fabrica.core.business.output.MaquinaRepository;
import fabrica.core.entity.Maquina;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class MaquinaBs implements MaquinaService {
    @Inject
    MaquinaRepository maquinaRepository;

    @Override
    public List<Maquina> listAll() {
        return maquinaRepository.findAll();
    }
}
