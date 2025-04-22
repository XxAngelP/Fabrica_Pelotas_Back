package fabrica.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fabrica.core.entity.ProcesoPlanta;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Getter
@Setter
@Builder
@Schema
public class ProcesoPlantaDto {
    @JsonProperty
    @Schema(description = "Identificador Principal de ProcesoPlanta")
    private Integer idProcesoPlanta;
    @JsonProperty
    @Schema(description = "color de planta")
    private String colorPlanta;
    @JsonProperty
    @Schema(description = "nombre de Proceso")
    private String nombreProceso;


    public static ProcesoPlantaDto fromEntity(ProcesoPlanta procesoPlanta){
        return ProcesoPlantaDto.builder()
                .idProcesoPlanta(procesoPlanta.getIdProcesoPlanta())
                .colorPlanta(procesoPlanta.getColorPlanta())
                .nombreProceso(procesoPlanta.getNombreProceso())
                .build();
    }
}
