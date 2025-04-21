package fabrica.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Proceso {
    private Integer idProceso;
    private String nombreProceso;
    private Dificultad idDificultad;
}
