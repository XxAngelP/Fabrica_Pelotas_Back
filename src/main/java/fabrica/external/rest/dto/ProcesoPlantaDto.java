package fabrica.external.rest.dto;

import fabrica.core.entity.ProcesoPlanta;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProcesoPlantaDto {
    private Integer idProcesoPlanta;
    private String colorPlanta;
    private String nombreProceso;


    public static ProcesoPlantaDto fromEntity(ProcesoPlanta procesoPlanta){
        return ProcesoPlantaDto.builder()
                .idProcesoPlanta(procesoPlanta.getIdProcesoPlanta())
                .colorPlanta(procesoPlanta.getColorPlanta())
                .nombreProceso(procesoPlanta.getNombreProceso())
                .build();
    }
}
