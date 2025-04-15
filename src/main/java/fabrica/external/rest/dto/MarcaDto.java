package fabrica.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fabrica.core.entity.Marca;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class MarcaDto {
    @JsonProperty
    private Integer idMarca;
    @JsonProperty
    private String nombreMarca;

    public static MarcaDto fromEntity(Marca marca){
        return MarcaDto.builder()
                .idMarca(marca.getIdMarca())
                .nombreMarca(marca.getNombreMarca())
                .build();
    }
}
