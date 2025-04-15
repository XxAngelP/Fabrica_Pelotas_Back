package Marca;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

public class Marca {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marca_seq")
    @SequenceGenerator(name = "marca_seq", sequenceName = "marca_seq", allocationSize = 1)
    @JsonProperty("id")
    private Long idMarca;
    @JsonProperty("name")
    @Column(nullable = false)
    private String nombreMarca;

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Long idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }
}
