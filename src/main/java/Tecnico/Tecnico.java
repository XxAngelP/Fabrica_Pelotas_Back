package Tecnico;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tecnico_seq")
    @SequenceGenerator(name = "tecnico_seq", sequenceName = "tecnico_seq", allocationSize = 1)
    @Size(min = 4, max = 10)
    private Long DNI;
    @JsonProperty("nombre")
    @Size(max = 45)
    private String nombreTecnico;
    @Size(max = 45)
    @JsonProperty("apellido")
    private String apellidoTecnico;
    @Size(max = 10)
    @JsonProperty("telefono1")
    private String telefono1Tecnico;
    @Size(max = 10)
    @JsonProperty("telefono2")
    private String telefono2Tecnico;
    @Size(max = 10)
    @JsonProperty("telefono3")
    private String telefono3Tecnico;
    @JsonProperty("email")
    private String emailTecnico;
    @Size(max = 8)
    @JsonProperty("nacido")
    private Integer fecha_nacimiento;

    public Integer getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Integer fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public String getNombreTecnico() {
        return nombreTecnico;
    }

    public void setNombreTecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }

    public String getApellidoTecnico() {
        return apellidoTecnico;
    }

    public void setApellidoTecnico(String apellidoTecnico) {
        this.apellidoTecnico = apellidoTecnico;
    }

    public String getTelefono1Tecnico() {
        return telefono1Tecnico;
    }

    public void setTelefono1Tecnico(String telefono1Tecnico) {
        this.telefono1Tecnico = telefono1Tecnico;
    }

    public String getTelefono2Tecnico() {
        return telefono2Tecnico;
    }

    public void setTelefono2Tecnico(String telefono2Tecnico) {
        this.telefono2Tecnico = telefono2Tecnico;
    }

    public String getTelefono3Tecnico() {
        return telefono3Tecnico;
    }

    public void setTelefono3Tecnico(String telefono3Tecnico) {
        this.telefono3Tecnico = telefono3Tecnico;
    }

    public String getEmailTecnico() {
        return emailTecnico;
    }

    public void setEmailTecnico(String emailTecnico) {
        this.emailTecnico = emailTecnico;
    }
}
