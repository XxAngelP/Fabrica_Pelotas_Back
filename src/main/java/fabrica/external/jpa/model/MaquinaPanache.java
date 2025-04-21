package fabrica.external.jpa.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
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
    @Column(name = "estatus")
    private Integer estatus;

    @ManyToOne
    @JoinColumn(name = "fk_idMarca", referencedColumnName = "idMarca", insertable = false, updatable = false)
    private MarcaPanache idMarca;

    @ManyToOne
    @JoinColumn(name = "fk_idProcesoPlanta", referencedColumnName = "idProcesoPlanta", insertable = false, updatable = false)
    private ProcesoPlantaPanache idProcesoPlanta;

}
