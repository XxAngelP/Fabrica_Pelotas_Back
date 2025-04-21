package fabrica.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Plantas {
    private String colorPlanta;
    private String nombrePlanta;
    private Float superficie;
}
