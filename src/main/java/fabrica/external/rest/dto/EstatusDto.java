package fabrica.external.rest.dto;

import fabrica.core.entity.Estatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EstatusDto {
    private Integer idEstatus;
    private String nombreEstatus;


    public static EstatusDto fromEntity(Estatus estatus){
        return EstatusDto.builder()
                .idEstatus(estatus.getIdEstatus())
                .nombreEstatus(estatus.getNombreEstatus())
                .build();
    }
}
