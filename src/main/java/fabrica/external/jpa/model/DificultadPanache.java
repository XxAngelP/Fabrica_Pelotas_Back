package fabrica.external.jpa.model;

import fabrica.core.entity.Dificultad;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Dificutad")
public class DificultadPanache {
    @Id
    @Column(nullable = false, name = "idDificultad")
    @SequenceGenerator(name = "Dificultad_seq", sequenceName = "Dificultad_seq", allocationSize = 1)
    @GeneratedValue(generator = "Dificultad_seq",strategy = GenerationType.SEQUENCE)
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

