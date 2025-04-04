package Turno;

import Maquina.MaquinaRepository;
import Maquina.ResponseMaquinaDTO;
import jakarta.enterprise.context.RequestScoped;

import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class TurnoDTOImpl {

    public List<TurnoDTO> getAll(){
        TurnoRepository turno = new TurnoRepository();
        return turno.listAll().stream()
                .map(entidad -> new TurnoDTO(
                        entidad.getIdTurno(),
                        entidad.getNombreTurno(),
                        this.convertirHora(entidad.getHoraInicio()),
                        this.convertirHora(entidad.getHoraFin())
                ))
                .collect(Collectors.toList());
    }

    private String convertirHora(Integer hora){
            int Hr = hora/100;
            int min = hora % 100;

            String hrS = Integer.toString(Hr);
            String minS = Integer.toString(min);

            if(hrS.length()==1){
                hrS = "0"+hrS;
            }
        if(minS.length()==1){
            minS = "0"+minS;
        }

        return hrS+":"+minS;
    }
}
