package fabrica.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty
    @Schema(description = "Identificador Principal de Maquina")
    private Integer idMaquina;
    @JsonProperty
    @Schema(description = "modelo de Maquina")
    private String modeloMaquina;
    @JsonProperty
    @Schema(description = "numeron de serie")
    private String noSerie;
    @JsonProperty
    @Schema(description = "Identificador de Estatus")
    private Integer idEstatus;
    @JsonProperty
    @Schema(description = "nombre de Marca")
    private String nombreMarca;
    @JsonProperty
    @Schema(description = "identificador de ProcesoPlanta")
    private Integer idProcesoPlanta;


    public static MaquinaDto fromEntity(Maquina maquina){
        return MaquinaDto.builder()
                .idMaquina(maquina.getIdMaquina())
                .modeloMaquina(maquina.getModeloMaquina())
                .noSerie(maquina.getNoSerie())
                .idEstatus(maquina.getIdEstatus())
                .nombreMarca(maquina.getNombreMarca())
                .idProcesoPlanta(maquina.getIdProcesoPlanta())
                .build();
    }
}
