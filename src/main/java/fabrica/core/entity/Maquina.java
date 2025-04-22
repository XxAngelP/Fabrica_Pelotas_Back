package fabrica.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Maquina{
    private Integer idMaquina;
    private String modeloMaquina;
    private String noSerie;
    private Integer estatus;
    private String nombreMarca;
    private Integer idProcesoPlanta;
}
