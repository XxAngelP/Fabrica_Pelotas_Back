package fabrica.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fabrica.core.entity.Tecnico;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TecnicoDto {
    @JsonProperty
    private Integer dni;
    @JsonProperty
    private String nombreTecnico;
    @JsonProperty
    private String apellidoTecnico1;
    @JsonProperty
    private String apellidoTecnico2;
    @JsonProperty
    private String telefonoTecnico1;
    @JsonProperty
    private String telefonoTecnico2;
    @JsonProperty
    private String telefonoTecnico3;
    @JsonProperty
    private Integer fechaNacimiento;

    public static TecnicoDto fromEntity(Tecnico tecnico){
        return TecnicoDto.builder()
                .dni(tecnico.getDni())
                .nombreTecnico(tecnico.getNombreTecnico())
                .apellidoTecnico1(tecnico.getApellidoTecnico1())
                .apellidoTecnico2(tecnico.getApellidoTecnico2())
                .telefonoTecnico1(tecnico.getTelefonoTecnico1())
                .telefonoTecnico2(tecnico.getTelefonoTecnico2())
                .telefonoTecnico3(tecnico.getTelefonoTecnico3())
                .fechaNacimiento(tecnico.getFechaNacimiento())
                .build();
    }
}
