package fabrica.external.jpa.model;

import fabrica.core.entity.Proceso;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@Table(name = "Proceso")
public class ProcesoPanache {
    @Id
    @Column(nullable = false,name = "idProceso")
    @SequenceGenerator(name = "Proceso_seq", sequenceName = "Proceso_seq", allocationSize = 1)
    @GeneratedValue(generator = "Proceso_seq", strategy = GenerationType.SEQUENCE)
    private Integer idProceso;
    @Column(name = "nombreProceso")
    private String nombreProceso;

    @ManyToOne
    @JoinColumn(name = "fk_idDificultad", referencedColumnName = "idDificultad", insertable = false, updatable = false)
    private DificultadPanache idDificultad;


    public Proceso toEntity(){
        return Proceso.builder()
                .idProceso(this.idProceso)
                .nombreProceso(this.nombreProceso)
                .nombreDificultad(this.idDificultad.getNombreDificultad())
                .build();
    }
}
