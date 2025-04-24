package fabrica.external.jpa.model;

import fabrica.core.entity.Estatus;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Builder
@Setter
@Getter
@Table(name = "Estatus")
public class EstatusPanache {
    @Id
    @Column(nullable = false,name = "idEstatus")
    @SequenceGenerator(name = "Estatus_seq", sequenceName = "Estatus_seq", allocationSize = 1)
    @GeneratedValue(generator = "Estatus_seq", strategy = GenerationType.SEQUENCE)
    private Integer idEstatus;
    @Column(name = "nombreEstatus")
    private String nombreEstatus;


    public Estatus toEntity() {
        return Estatus.builder()
                .idEstatus(this.idEstatus)
                .nombreEstatus(this.nombreEstatus)
                .build();
    }
}
