package fabrica.external.jpa.model;

import fabrica.core.entity.Dificultad;
import jakarta.persistence.*;
import lombok.*;

/**
 * Entidad que representa una Dificultad en la base de datos.
 *
 * @author Angel Erensto Baez S
 */
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Dificultad")
public class DificultadPanache {
    @Id
    @Column(nullable = false, name = "idDificultad")
    @SequenceGenerator(name = "Dificultad_seq", sequenceName = "Dificultad_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Dificultad_seq")
    private Integer idDificultad;
    @Column(nullable = false, name = "nombreDificultad")
    private String nombreDificultad;

    public Dificultad toEntity(){
        return Dificultad.builder()
                .idDificultad(this.getIdDificultad())
                .nombreDificultad(this.getNombreDificultad())
                .build();
    }
}

