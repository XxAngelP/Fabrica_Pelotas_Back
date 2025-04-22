package fabrica.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProcesoPlanta {
    private Integer idProcesoPlanta;
    private String colorPlanta;
    private String nombreProceso;
}
