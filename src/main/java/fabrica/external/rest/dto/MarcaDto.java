package fabrica.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fabrica.core.entity.Marca;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Builder
@Getter
@Setter
@Schema
public class MarcaDto {
    @JsonProperty
    @Schema(description = "identificador de Marca")
    private Integer idMarca;
    @JsonProperty
    @Schema(description = "nombre de Marca")
    private String nombreMarca;

    public static MarcaDto fromEntity(Marca marca){
        return MarcaDto.builder()
                .idMarca(marca.getIdMarca())
                .nombreMarca(marca.getNombreMarca())
                .build();
    }
}
