package fabrica.external.jpa.model;

import fabrica.core.entity.Tecnico;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Tecnico")
public class TecnicoPanache {
    @Id
    @Column(nullable = false, name = "dni")
    @SequenceGenerator(name = "Tecnico_seq", sequenceName = "Tecnico_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Tecnico_seq")
    private Integer dni;
    @Column(nullable = false, name = "nombreTecnico")
    private String nombreTecnico;
    @Column(nullable = false, name = "apellidoTecnico1")
    private String apellidoTecnico1;
    @Column(nullable = false, name = "apellidoTecnico2")
    private String apellidoTecnico2;
    @Column(nullable = false, name = "telefonoTecnico1")
    private String telefonoTecnico1;
    @Column(nullable = true, name = "telefonoTecnico2")
    private String telefonoTecnico2;
    @Column(nullable = true, name = "telefonoTecnico3")
    private String telefonoTecnico3;
    @Column(nullable = false, name = "fechaNacimiento")
    private Integer fecha_nacimiento;

    public Tecnico toEntity(){
        return Tecnico.builder()
                .dni(this.dni)
                .nombreTecnico(this.nombreTecnico)
                .apellidoTecnico1(this.apellidoTecnico1)
                .apellidoTecnico2(this.apellidoTecnico2)
                .telefonoTecnico1(this.telefonoTecnico1)
                .telefonoTecnico2(this.telefonoTecnico2)
                .telefonoTecnico3(this.telefonoTecnico3)
                .fechaNacimiento(this.fecha_nacimiento)
                .build();
    }
}
