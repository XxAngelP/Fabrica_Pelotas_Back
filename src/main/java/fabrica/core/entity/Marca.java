package fabrica.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Marca {
    private Integer idMarca;
    private String nombreMarca;
}
