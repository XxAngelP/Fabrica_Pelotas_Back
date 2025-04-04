package Procesos;

import Assets.PaginatedResponse;
import Dificultad.Dificultad;
import jakarta.enterprise.context.RequestScoped;

import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class ProcesosMapperImpl {

    public PaginatedResponse<ProsesosResponseDTO> obtenerPanacheQuery(int page) {
        // Crear la consulta base
        List<Procesos> entidades = Procesos.findAll().list(); // Consulta la lista completa

        // Mapear manualmente los resultados al DTO
        List<ProsesosResponseDTO> mappedList = entidades.stream()
                .map(entidad -> new ProsesosResponseDTO(
                        entidad.getIdProcesos(),
                        entidad.getNombreProceso(),
                        entidad.getDificultad().getNombreDificultad()))
                .collect(Collectors.toList());

        // Implementar paginación manual
        int totalPages = (int) Math.ceil((double) mappedList.size() / 10 ); // Total de páginas
        int fromIndex = Math.min((page - 1) * 10, mappedList.size());
        int toIndex = Math.min(page * 10, mappedList.size());

        // Sublista con los elementos de la página actual
        List<ProsesosResponseDTO> paginatedList = mappedList.subList(fromIndex, toIndex);

        // Retornar una respuesta paginada
        return new PaginatedResponse<>(page, totalPages, paginatedList);
    }
    public List<ProsesosResponseDTO> getAll(){
        ProcesosRepository repo = new ProcesosRepository();

        List<Procesos> procesos = repo.listAll();

        List<ProsesosResponseDTO> mappedList = procesos .stream()
                .map(  proceso -> new ProsesosResponseDTO(
                            proceso.getIdProcesos(),
                            proceso.getNombreProceso(),
                            proceso.getDificultad().getNombreDificultad()
                        )).collect(Collectors.toList());

        return mappedList;
    }



    public void fromUpdate(UpdateProcesosDTO dto,Procesos Procesos) {
        Procesos.setNombreProceso(dto.nombreProceso());
        Dificultad dificultad = new Dificultad();
        dificultad.setIdDificultad(dto.idDificultad());
        Procesos.setDificultad(dificultad);
    }

    public Procesos fromCreate(CreateProcesosDTO dto) {
        var procesos = new Procesos();
        procesos.setNombreProceso(dto.nombreProceso());
        Dificultad dificultad = new Dificultad();
        dificultad.setIdDificultad(dto.idDificultad());
        procesos.setDificultad(dificultad);
        return procesos;
    }

    public ProsesosResponseDTO fromEntity(Procesos Procesos) {
        return new ProsesosResponseDTO(Procesos.getIdProcesos(), Procesos.getNombreProceso(), Procesos.getDificultad().getNombreDificultad());
    }
}
