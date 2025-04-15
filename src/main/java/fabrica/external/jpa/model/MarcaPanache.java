package fabrica.external.jpa.model;

import fabrica.core.entity.Marca;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@Table(name = "Marca")
public class MarcaPanache {
    @Id
    @Column(nullable = false,name = "idMarca")
    @SequenceGenerator(name = "Marca_seq", sequenceName = "Marca_seq", allocationSize = 1)
    @GeneratedValue(generator = "Marca_seq", strategy = GenerationType.SEQUENCE)
    private Integer idMarca;
    @Column(name = "nombreMarca")
    private String nombreMarca;

    public Marca toEntity(){
        return Marca.builder()
                .idMarca(this.getIdMarca())
                .nombreMarca(this.getNombreMarca())
                .build();
    }
}
