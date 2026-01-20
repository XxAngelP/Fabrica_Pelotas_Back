package fabrica.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Estatus {
    private Integer idEstatus;
    private String nombreEstatus;
}
