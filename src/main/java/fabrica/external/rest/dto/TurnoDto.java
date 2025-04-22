package fabrica.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fabrica.core.entity.Turno;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Getter
@Setter
@Builder
@Schema
public class TurnoDto {
    @JsonProperty
    @Schema(description = "Identificador Principal de Turno")
    private Integer idTurno;
    @JsonProperty
    @Schema(description = "Nombre de Turno")
    private String nombreTurno;
    @JsonProperty
    @Schema(description = "Hora de Inicio de Turno")
    private Integer horaInicio;
    @JsonProperty
    @Schema(description = "Hora de Fin de Turno")
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
