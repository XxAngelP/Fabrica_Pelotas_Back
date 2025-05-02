package fabrica.external.jpa.model;

import fabrica.core.entity.Turno;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Turno")
public class TurnoPanache {
    @Id
    @Column(nullable = false,name = "idTurno")
    @SequenceGenerator(name = "Turno_seq", sequenceName = "Turno_seq", allocationSize = 1)
    @GeneratedValue(generator = "Turno_seq", strategy = GenerationType.SEQUENCE)
    private Integer idTurno;
    @Column(name = "nombreTurno")
    private String nombreTurno;
    @Column(name = "horaInicio")
    private Integer horaInicio;
    @Column(name = "horaFin")
    private Integer horaFin;

    public Turno toEntity(){
        return Turno.builder()
                .idTurno(this.getIdTurno())
                .nombreTurno(this.getNombreTurno())
                .horaInicio(this.getHoraInicio())
                .horaFin(this.getHoraFin())
                .build();
    }
}
