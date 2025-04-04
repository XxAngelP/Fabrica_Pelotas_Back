package Asignaciones;

import Maquina.Maquina;
import Marca.Marca;
import Tecnico.Tecnico;
import Turno.Turno;
import jakarta.persistence.*;

@Entity
public class Asignaciones {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "asignaciones_seq")
    @SequenceGenerator(name = "asignaciones_seq", sequenceName = "asignaciones_seq", allocationSize = 1)
    private Long idAsignacion;
    @ManyToOne
    @JoinColumn(name = "idMaquina1")
    private Maquina maquina1;
    @ManyToOne
    @JoinColumn(name = "idMaquina2")
    private Maquina maquina2;
    @ManyToOne
    @JoinColumn(name = "DNI", nullable = true)
    private Tecnico tecnico;
    @ManyToOne
    @JoinColumn(name = "idTurno")
    private Turno turno;
    private Integer fechaInicio;
    private Integer fechaFin;

    public Long getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(Long idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public Maquina getMaquina1() {
        return maquina1;
    }

    public void setMaquina1(Maquina maquina1) {
        this.maquina1 = maquina1;
    }

    public Maquina getMaquina2() {
        return maquina2;
    }

    public void setMaquina2(Maquina maquina2) {
        this.maquina2 = maquina2;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Integer getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Integer fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Integer getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Integer fechaFin) {
        this.fechaFin = fechaFin;
    }
}
