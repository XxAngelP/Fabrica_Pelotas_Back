package Maquina;

public record UpdateMaquinaDTO(
        Long idMarca,
        String modeloMaquina,
        String noSerie,
        Long idProcesoPlanta,
        Integer status
) {
}
