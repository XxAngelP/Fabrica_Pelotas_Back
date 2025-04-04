package Maquina;

public record CreateMaquinaDTO(
        Long idMarca,
        String modeloMaquina,
        String noSerie,
        Long idProcesoPlanta,
        Integer status
) {
}
