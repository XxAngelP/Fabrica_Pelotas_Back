package fabrica.external.jpa.model;

import fabrica.core.entity.ProcesoPlanta;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@Table(name = "ProcesoPlanta")
public class ProcesoPlantaPanache {
    @Id
    @Column(nullable = false,name = "idProcesoPlanta")
    @SequenceGenerator(name = "ProcesoPlanta_seq", sequenceName = "ProcesoPlanta_seq", allocationSize = 1)
    @GeneratedValue(generator = "ProcesoPlanta_seq", strategy = GenerationType.SEQUENCE)
    private Integer idProcesoPlanta;

    @ManyToOne
    @JoinColumn(name = "fk_colorPlanta", referencedColumnName = "colorPlanta", insertable = false, updatable = false)
    private PlantaPanache colorPlanta;

    @ManyToOne
    @JoinColumn(name = "fk_idProceso", referencedColumnName = "idProceso", insertable = false, updatable = false)
    private ProcesoPanache idProceso;

public ProcesoPlanta toEntity() {
    return ProcesoPlanta.builder()
            .idProcesoPlanta(this.idProcesoPlanta)
            .colorPlanta(this.colorPlanta != null ? this.colorPlanta.getColorPlanta() : null)
            .nombreProceso(this.idProceso != null ? this.idProceso.getNombreProceso() : null)
            .build();
    }
}
