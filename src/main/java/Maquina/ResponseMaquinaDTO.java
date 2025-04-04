package Maquina;

public record ResponseMaquinaDTO(
    Long id,
    String marca,
    String modelo,
    String serie,
    String proceso,
    String planta,
    Integer status
) {
}
