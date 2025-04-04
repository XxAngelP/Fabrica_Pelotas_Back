package Maquina;

import Marca.Marca;
import ProcesoPlanta.ProcesoPlanta;
import Procesos.Procesos;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;

@Entity
public class Maquina {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "maquina_seq")
    @SequenceGenerator(name = "maquina_seq", sequenceName = "maquina_seq", allocationSize = 1)
    private Long idMaquina;
    @ManyToOne // Relación muchos-a-uno
    @JoinColumn(name = "idMarca") // Almacena el ID del cliente en la tabla Pedido
    private Marca marca;
    private String modeloMaquina;
    private String noSerie;
    @ManyToOne // Relación muchos-a-uno
    @JoinColumn(name = "idProcesoPlanta") // Almacena el ID del cliente en la tabla Pedido
    private ProcesoPlanta procesoPlanta;// Define un número con hasta 1 dígito entero y sin decimales
    public Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ProcesoPlanta getProcesoPlanta() {
        return procesoPlanta;
    }

    public void setProcesoPlanta(ProcesoPlanta procesoPlanta) {
        this.procesoPlanta = procesoPlanta;
    }

    public String getNoSerie() {
        return noSerie;
    }

    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    public String getModeloMaquina() {
        return modeloMaquina;
    }

    public void setModeloMaquina(String modeloMaquina) {
        this.modeloMaquina = modeloMaquina;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Long getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(Long idMaquina) {
        this.idMaquina = idMaquina;
    }
}
