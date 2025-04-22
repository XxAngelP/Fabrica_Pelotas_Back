package fabrica.external.rest.dto;

import fabrica.core.entity.Dificultad;
import fabrica.core.entity.Proceso;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProcesoDto {
    private Integer idProceso;
    private String nombreProceso;
    private String nombreDificultad;

    public static ProcesoDto fromEntity(Proceso proceso){
        return ProcesoDto.builder()
                .idProceso(proceso.getIdProceso())
                .nombreProceso(proceso.getNombreProceso())
                .nombreProceso(proceso.getNombreDificultad())
                .build();
    }
}
