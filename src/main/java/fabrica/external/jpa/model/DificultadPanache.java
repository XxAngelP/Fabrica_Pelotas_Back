package fabrica.external.jpa.model;

import fabrica.core.entity.Dificultad;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/**
 * Entidad que representa una Dificultad en la base de datos.
 *
 * @author Angel Erensto Baez S
 */
@Entity
@Builder
@Getter
@Setter
@Table(name = "Dificultad")
public class DificultadPanache {
    /**
     * Identificador principal de la Dificultad.
     */
    @Id
    @Column(nullable = false, name = "idDificultad")
    @SequenceGenerator(name = "Dificultad_seq", sequenceName = "Dificultad_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Dificultad_seq")
    private Integer idDificultad;

    /**
     * Nombre de la Dificultad.
     */
    @Column(nullable = false, name = "nombreDificultad")
    private String nombreDificultad;

    /**
     * Convierte esta entidad a su representacion de business logic.
     *
     * @return La representacion de business logic de esta entidad.
     */
    public Dificultad toEntity(){
        return Dificultad.builder()
                .idDificultad(this.getIdDificultad())
                .nombreDificultad(this.getNombreDificultad())
                .build();
    }
}
