package fabrica.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fabrica.core.entity.Turno;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TurnoDto {
    @JsonProperty
    private Integer idTurno;
    @JsonProperty
    private String nombreTurno;
    @JsonProperty
    private Integer horaInicio;
    @JsonProperty
    private Integer horaFin;

    public static TurnoDto fromEntity(Turno turno){
        return TurnoDto.builder()
                .idTurno(turno.getIdTurno())
                .nombreTurno(turno.getNombreTurno())
                .horaInicio(turno.getHoraInicio())
                .horaFin(turno.getHoraFin())
                .build();
    }
}
