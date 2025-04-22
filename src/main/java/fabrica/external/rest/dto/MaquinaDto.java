package fabrica.external.rest.dto;

import fabrica.core.entity.Maquina;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Getter
@Setter
@Builder
@Schema
public class MaquinaDto {
    @Schema(description = "Identificador Principal de Maquina")
    private Integer idMaquina;
    @Schema(description = "modelo de Maquina")
    private String modeloMaquina;
    @Schema(description = "numeron de serie")
    private String noSerie;
    @Schema(description = "Identificador de Estatus")
    private Integer estatus;
    @Schema(description = "nombre de Marca")
    private String nombreMarca;
    @Schema(description = "identificador de ProcesoPlanta")
    private Integer idProcesoPlanta;


    public static MaquinaDto fromEntity(Maquina maquina){
        return MaquinaDto.builder()
                .idMaquina(maquina.getIdMaquina())
                .modeloMaquina(maquina.getModeloMaquina())
                .noSerie(maquina.getNoSerie())
                .estatus(maquina.getEstatus())
                .nombreMarca(maquina.getNombreMarca())
                .idProcesoPlanta(maquina.getIdProcesoPlanta())
                .build();
    }
}
