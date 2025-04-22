package fabrica.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fabrica.core.entity.Dificultad;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Builder
@Getter
@Setter
@Schema
public class DificultadDto {
    @JsonProperty
    @Schema(description = "Identificador Principar de Dificultad")
    private Integer idDificultad;
    @JsonProperty
    @Schema(description = "Nombre de Dificultad")
    private String  nombreDificultad;

    public static DificultadDto fromEntity(Dificultad dificultad){
        return DificultadDto.builder()
                .idDificultad(dificultad.getIdDificultad())
                .nombreDificultad(dificultad.getNombreDificultad())
                .build();
    }
}
