package Procesos;

import Dificultad.Dificultad;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public record ProsesosResponseDTO(
        @JsonProperty("id")
        Long idProcesos,
        @JsonProperty("nombre")
        String nombreProceso,
        @JsonProperty("dificultad")
        String dificultadProceso
) {
}
