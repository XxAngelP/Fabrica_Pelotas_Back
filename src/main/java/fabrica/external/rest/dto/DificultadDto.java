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
@Schema(description = "Representacion de una Dificultad")
public class DificultadDto {
    @JsonProperty
    @Schema(description = "Identificador Principal de Dificultad", required = true, example = "1")
    private Integer idDificultad;
    @JsonProperty
    @Schema(description = "Nombre de Dificultad", required = true, example = "Easy")
    private String  nombreDificultad;


    /**
     * Convierte esta representacion de Dificultad a su representacion de business logic.
     *
     * @return La representacion de business logic de esta entidad.
     */
    public static DificultadDto fromEntity(Dificultad dificultad){
        return DificultadDto.builder()
                .idDificultad(dificultad.getIdDificultad())
                .nombreDificultad(dificultad.getNombreDificultad())
                .build();
    }
}
