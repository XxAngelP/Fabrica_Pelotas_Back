package fabrica.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Tecnico {
    private Integer dni;
    private String nombreTecnico;
    private String apellidoTecnico1;
    private String apellidoTecnico2;
    private String telefonoTecnico1;
    private String telefonoTecnico2;
    private String telefonoTecnico3;
    private Integer fechaNacimiento;
}
