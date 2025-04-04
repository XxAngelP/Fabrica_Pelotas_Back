package Maquina;

import Assets.PaginatedResponse;
import Marca.Marca;
import ProcesoPlanta.ProcesoPlanta;
import Procesos.ProsesosResponseDTO;
import jakarta.enterprise.context.RequestScoped;

import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class MaquinaMapperlmpl {

    public Maquina fromCreate(CreateMaquinaDTO dto){
        var maquina = new Maquina();
        var marca = new Marca();
        marca.setIdMarca(dto.idMarca());
        maquina.setMarca(marca);
        maquina.setModeloMaquina(dto.modeloMaquina());
        maquina.setNoSerie(dto.noSerie());
        var procesoPlanta = new ProcesoPlanta();
        procesoPlanta.setIdProcesoPlanta(dto.idProcesoPlanta());
        maquina.setProcesoPlanta(procesoPlanta);
        maquina.setStatus(dto.status());
        return maquina;
    }

    public void fromUpdate(UpdateMaquinaDTO dto, Maquina maquina) {
        var marca = new Marca();
        marca.setIdMarca(dto.idMarca());
        maquina.setMarca(marca);
        maquina.setModeloMaquina(dto.modeloMaquina());
        maquina.setNoSerie(dto.noSerie());
        var procesoPlanta = new ProcesoPlanta();
        procesoPlanta.setIdProcesoPlanta(dto.idProcesoPlanta());
        maquina.setProcesoPlanta(procesoPlanta);
        maquina.setStatus(dto.status());
    }

    public PaginatedResponse<ResponseMaquinaDTO> listPaginated(int page) {
        MaquinaRepository maquina = new MaquinaRepository();
        // Crear la consulta base
        List<Maquina> entidades = maquina.listAll();// Consulta la lista completa

        // Mapear manualmente los resultados al DTO
        List<ResponseMaquinaDTO> mappedList = entidades.stream()
                .map(entidad -> new ResponseMaquinaDTO(
                    entidad.getIdMaquina(),
                    entidad.getMarca().getNombreMarca(),
                    entidad.getModeloMaquina(),
                    entidad.getNoSerie(),
                    entidad.getProcesoPlanta().getProcesos().getNombreProceso(),
                    entidad.getProcesoPlanta().getPlantas().getColorPlanta(),
                    entidad.getStatus()
                ))
                .collect(Collectors.toList());

        // Implementar paginación manual
        int totalPages = (int) Math.ceil((double) mappedList.size() / 20 ); // Total de páginas
        int fromIndex = Math.min((page - 1) * 20, mappedList.size());
        int toIndex = Math.min(page * 20, mappedList.size());

        // Sublista con los elementos de la página actual
        List<ResponseMaquinaDTO> paginatedList = mappedList.subList(fromIndex, toIndex);

        // Retornar una respuesta paginada
        return new PaginatedResponse<>(page, totalPages, paginatedList);
    }

    public List<ResponseMaquinaDTO> getAll(){
        MaquinaRepository maquina = new MaquinaRepository();
        return maquina.listAll().stream()
                .map(entidad -> new ResponseMaquinaDTO(
                    entidad.getIdMaquina(),
                    entidad.getMarca().getNombreMarca(),
                    entidad.getModeloMaquina(),
                    entidad.getNoSerie(),
                    entidad.getProcesoPlanta().getProcesos().getNombreProceso(),
                    entidad.getProcesoPlanta().getPlantas().getColorPlanta(),
                    entidad.getStatus()
                ))
                .collect(Collectors.toList());
    }
}
