package Plantas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Plantas {

    @Id
    @Column(nullable = false)
    private String ColorPlanta;
    @Column(nullable = false)
    @JsonIgnore
    private String nombrePlanta;
    @JsonIgnore
    @Column(nullable = false)
    private Float superficie;

    public String getColorPlanta() {
        return ColorPlanta;
    }

    public void setColorPlanta(String colorPlanta) {
        ColorPlanta = colorPlanta;
    }

    public Float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Float superficie) {
        this.superficie = superficie;
    }

    public String getNombrePlanta() {
        return nombrePlanta;
    }

    public void setNombrePlanta(String nombrePlanta) {
        this.nombrePlanta = nombrePlanta;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Plantas plantas = (Plantas) o;
        return Objects.equals(getColorPlanta(), plantas.getColorPlanta()) && Objects.equals(getNombrePlanta(), plantas.getNombrePlanta()) && Objects.equals(getSuperficie(), plantas.getSuperficie());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getColorPlanta());
        result = 31 * result + Objects.hashCode(getNombrePlanta());
        result = 31 * result + Objects.hashCode(getSuperficie());
        return result;
    }

    @Override
    public String toString() {
        return "Plantas{" +
                "ColorPlanta='" + ColorPlanta + '\'' +
                ", nombrePlanta='" + nombrePlanta + '\'' +
                ", superficie=" + superficie +
                '}';
    }
}
