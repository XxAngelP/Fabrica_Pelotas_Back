package fabrica.external.jpa.model;

import fabrica.core.entity.Plantas;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@Table(name = "Plantas")
public class PlantasPanache {
    @Id
    @Column(name = "colorPlanta")
    private String colorPlanta;
    @Column(name = "nombrePlanta")
    private String nombrePlanta;
    @Column(name = "superficie")
    private Float superficie;

    public Plantas toEntity(){
        return fabrica.core.entity.Plantas.builder()
                .colorPlanta(this.colorPlanta)
                .nombrePlanta(this.nombrePlanta)
                .superficie(this.superficie)
                .build();
    }
}