package fabrica.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Dificultad {
    private Integer idDificultad;
    private String nombreDificultad;
}
