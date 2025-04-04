package Procesos;

import Dificultad.Dificultad;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Procesos extends PanacheEntityBase {
    @Id
    @Column(precision = 3, scale = 0) // DECIMAL(3)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "procesos_seq")
    @SequenceGenerator(name = "procesos_seq", sequenceName = "procesos_seq", allocationSize = 1)
    private Long idProcesos;
    private String nombreProceso;
    @ManyToOne // Relación muchos-a-uno
    @JoinColumn(name = "idDificultad") // Almacena el ID del cliente en la tabla Pedido
    public Dificultad dificultad;

    public Long getIdProcesos() {
        return idProcesos;
    }

    public void setIdProcesos(Long idProcesos) {
        this.idProcesos = idProcesos;
    }

    public String getNombreProceso() {
        return nombreProceso;
    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return "Procesos{" +
                "dificultad=" + dificultad +
                ", id=" + idProcesos +
                ", id=" + idProcesos +
                ", nombreProceso='" + nombreProceso + '\'' +
                '}';
    }
}
