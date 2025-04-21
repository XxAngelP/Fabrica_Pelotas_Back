package fabrica.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fabrica.core.entity.Plantas;
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


    public static PlantasDto fromEntity(Plantas plantas){
        return PlantasDto.builder()
                .colorPlanta(plantas.getColorPlanta())
                .nombrePlanta(plantas.getNombrePlanta())
                .superficie(plantas.getSuperficie())
                .build();
    }
}
