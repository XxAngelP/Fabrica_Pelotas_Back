package fabrica.external.jpa.model;

import fabrica.core.entity.Maquina;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Maquina")
public class MaquinaPanache {
    @Id
    @Column(nullable = false,name = "idMaquina")
    @SequenceGenerator(name = "Maquina_seq", sequenceName = "Maquina_seq", allocationSize = 1)
    @GeneratedValue(generator = "Maquina_seq", strategy = GenerationType.SEQUENCE)
    private Integer idMaquina;
    @Column(name = "modeloMaquina")
    private String modeloMaquina;
    @Column(name = "noSerie")
    private String noSerie;
    @Column(name = "idEstatus")
    private Integer idEstatus;

    @ManyToOne
    @JoinColumn(name = "fk_idMarca", referencedColumnName = "idMarca", insertable = false, updatable = false)
    private MarcaPanache idMarca;

    @ManyToOne
    @JoinColumn(name = "fk_idProcesoPlanta", referencedColumnName = "idProcesoPlanta", insertable = false, updatable = false)
    private ProcesoPlantaPanache idProcesoPlanta;

public Maquina toEntity() {
    return Maquina.builder()
            .idMaquina(this.idMaquina)
            .modeloMaquina(this.modeloMaquina)
            .noSerie(this.noSerie)
            .idEstatus(this.idEstatus)
            .nombreMarca(this.idMarca != null ? this.idMarca.getNombreMarca() : null)
            .idProcesoPlanta(this.idProcesoPlanta != null ? this.idProcesoPlanta.getIdProcesoPlanta() : null)
            .build();
    }
}
