package fabrica.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fabrica.core.entity.Dificultad;
import fabrica.core.entity.Proceso;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Getter
@Setter
@Builder
@Schema
public class ProcesoDto {
    @JsonProperty
    @Schema(description = "Identificador Principal de Proceso")
    private Integer idProceso;
    @JsonProperty
    @Schema(description = "Nombre de Proceso")
    private String nombreProceso;
    @JsonProperty
    @Schema(description = "Nombre de Dificultad")
    private String nombreDificultad;

    public static ProcesoDto fromEntity(Proceso proceso){
        return ProcesoDto.builder()
                .idProceso(proceso.getIdProceso())
                .nombreProceso(proceso.getNombreProceso())
                .nombreProceso(proceso.getNombreDificultad())
                .build();
    }
}
