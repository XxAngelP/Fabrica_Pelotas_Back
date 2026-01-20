package fabrica.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fabrica.core.entity.Planta;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Getter
@Setter
@Builder
@Schema
public class PlantasDto {
    @JsonProperty
    @Schema(description = "color de planta")
    private String colorPlanta;
    @JsonProperty
    @Schema(description = "nombre de planta")
    private String nombrePlanta;
    @JsonProperty
    @Schema(description = "superficie de planta")
    private Float superficie;


    public static PlantasDto fromEntity(Planta planta){
        return PlantasDto.builder()
                .colorPlanta(planta.getColorPlanta())
                .nombrePlanta(planta.getNombrePlanta())
                .superficie(planta.getSuperficie())
                .build();
    }
}
