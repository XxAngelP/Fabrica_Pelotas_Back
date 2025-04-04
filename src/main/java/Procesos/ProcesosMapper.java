package Procesos;

import Assets.PaginatedResponse;

import java.util.List;

public interface ProcesosMapper {
    Procesos fromCreate(CreateProcesosDTO dto);

    List<ProsesosResponseDTO> obtenerListaDTO();

    void fromUpdate(UpdateProcesosDTO dto, Procesos Procesos);

    PaginatedResponse<ProsesosResponseDTO> obtenerPanacheQuery(int page);
}
