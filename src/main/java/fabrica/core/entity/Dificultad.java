package fabrica.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Representa la dificultad de un proceso, es decir, el nivel de complejidad que
 * tiene, puede ser facil, medio o dificil.
 *
 * @author Angel Erenesto Baez S.
 */
@Getter
@Setter
@Builder
public class Dificultad {
    /**
     * Identificador unico de la dificultad.
     */
    private Integer idDificultad;

    /**
     * Nombre de la dificultad.
     */
    private String nombreDificultad;
}
