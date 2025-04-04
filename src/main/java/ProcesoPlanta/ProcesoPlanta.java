package ProcesoPlanta;

import Dificultad.Dificultad;
import Plantas.Plantas;
import Procesos.Procesos;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
public class ProcesoPlanta extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "procesoplanta_seq")
    @SequenceGenerator(name = "procesoplanta_seq", sequenceName = "procesoplanta_seq", allocationSize = 1)
    private Long idProcesoPlanta;
    @ManyToOne // Relación muchos-a-uno
    @JoinColumn(name = "ColorPlanta") // Almacena el ID del cliente en la tabla Pedido
    private Plantas plantas;
    @ManyToOne // Relación muchos-a-uno
    @JoinColumn(name = "idProcesos") // Almacena el ID del cliente en la tabla Pedido
    private Procesos procesos;

    public Long getIdProcesoPlanta() {
        return idProcesoPlanta;
    }

    public void setIdProcesoPlanta(Long idProcesoPlanta) {
        this.idProcesoPlanta = idProcesoPlanta;
    }

    public Plantas getPlantas() {
        return plantas;
    }

    public void setPlantas(Plantas plantas) {
        this.plantas = plantas;
    }

    public Procesos getProcesos() {
        return procesos;
    }

    public void setProcesos(Procesos procesos) {
        this.procesos = procesos;
    }

    @Override
    public String toString() {
        return "ProcesoPlanta{" +
                "idProcesoPlanta=" + idProcesoPlanta +
                ", plantas=" + plantas +
                ", procesos=" + procesos +
                '}';
    }
}
