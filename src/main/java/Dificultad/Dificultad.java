package Dificultad;

import Procesos.Procesos;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
public class Dificultad extends PanacheEntityBase {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dificultad_seq")
    @SequenceGenerator(name = "dificultad_seq", sequenceName = "dificultad_seq", allocationSize = 1)
    private Long idDificultad;
    @Column(nullable = false)
    private String nombreDificultad;

    public Long getIdDificultad() {
        return idDificultad;
    }

    public void setIdDificultad(Long idDificultad) {
        this.idDificultad = idDificultad;
    }

    public String getNombreDificultad() {
        return nombreDificultad;
    }

    public void setNombreDificultad(String nombreDificultad) {
        this.nombreDificultad = nombreDificultad;
    }
}
