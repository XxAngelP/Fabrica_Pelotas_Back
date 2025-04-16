package fabrica.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fabrica.core.entity.Dificultad;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class DificultadDto {
    @JsonProperty
    private Integer idDificultad;
    @JsonProperty
    private String  nombreDificultad;

    public static DificultadDto fromEntity(Dificultad dificultad){
        return DificultadDto.builder()
                .idDificultad(dificultad.getIdDificultad())
                .nombreDificultad(dificultad.getNombreDificultad())
                .build();
    }
}
