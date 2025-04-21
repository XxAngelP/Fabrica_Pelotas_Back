package fabrica.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fabrica.core.entity.Planta;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PlantasDto {
    @JsonProperty
    private String colorPlanta;
    @JsonProperty
    private String nombrePlanta;
    @JsonProperty
    private Float superficie;


    public static PlantasDto fromEntity(Planta planta){
        return PlantasDto.builder()
                .colorPlanta(planta.getColorPlanta())
                .nombrePlanta(planta.getNombrePlanta())
                .superficie(planta.getSuperficie())
                .build();
    }
}
