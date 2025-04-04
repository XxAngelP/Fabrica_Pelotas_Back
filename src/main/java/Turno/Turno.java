package Turno;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Turno {
    @Id
    private Long idTurno;
    @JsonProperty("nombre")
    private String nombreTurno;
    @JsonProperty("inicio")
    private Integer HoraInicio;
    @JsonProperty("fin")
    private Integer HoraFin;

    public Long getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Long idTurno) {
        this.idTurno = idTurno;
    }

    public String getNombreTurno() {
        return nombreTurno;
    }

    public void setNombreTurno(String nombreTurno) {
        this.nombreTurno = nombreTurno;
    }

    public Integer getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(Integer horaInicio) {
        HoraInicio = horaInicio;
    }

    public Integer getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(Integer horaFin) {
        HoraFin = horaFin;
    }
}
