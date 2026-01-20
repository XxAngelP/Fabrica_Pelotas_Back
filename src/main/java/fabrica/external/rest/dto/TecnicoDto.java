package fabrica.external.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fabrica.core.entity.Tecnico;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Getter
@Setter
@Builder
@Schema
public class TecnicoDto {
    @JsonProperty
    @Schema(description = "Identificador Principal de Tecnico")
    private Integer dni;
    @JsonProperty
    @Schema(description = "Nombre de Tecnico")
    private String nombreTecnico;
    @JsonProperty
    @Schema(description = "Apellido de Tecnico")
    private String apellidoTecnico1;
    @JsonProperty
    @Schema(description = "Segundo Apellido de Tecnico")
    private String apellidoTecnico2;
    @JsonProperty
    @Schema(description = "Primer Telefono de Tecnico")
    private String telefonoTecnico1;
    @JsonProperty
    @Schema(description = "Segundo Telefono de Tecnico")
    private String telefonoTecnico2;
    @JsonProperty
    @Schema(description = "Tercer Telefono de Tecnico")
    private String telefonoTecnico3;
    @JsonProperty
    @Schema(description = "Fecha de Nacimiento de Tecnico")
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
