package fabrica.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Turno {
    private Integer idTurno;
    private String nombreTurno;
    private Integer horaInicio;
    private Integer horaFin;
}
