package ProcesoPlanta;

import Assets.PaginatedResponse;
import Plantas.Plantas;
import Procesos.Procesos;
import jakarta.enterprise.context.RequestScoped;

import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class ProcesosPlantaMapperImpl {

    public ProcesoPlanta create(ProcesoPlantaDTO dto) {
        ProcesoPlanta pp = new ProcesoPlanta();
        Plantas planta = new Plantas();
        Procesos proceso = new Procesos();
        planta.setColorPlanta(dto.colorPlanta());
        proceso.setIdProcesos(dto.idProcesos());
        pp.setPlantas(planta);
        pp.setProcesos(proceso);
        return pp;
    }

    public void update(ProcesoPlantaDTO dto, ProcesoPlanta pp) {
        Plantas planta = new Plantas();
        Procesos proceso = new Procesos();
        planta.setColorPlanta(dto.colorPlanta());
        proceso.setIdProcesos(dto.idProcesos());
        pp.setPlantas(planta);
        pp.setProcesos(proceso);
    }

    public PaginatedResponse<ResponseProcesoPlantaDTO> page(int page){
        ProcesoPlantaRepository repo = new ProcesoPlantaRepository();

        List<ProcesoPlanta> entidad = repo.listAll();

        List<ResponseProcesoPlantaDTO> mappedList = entidad.stream()
                .map(e -> new ResponseProcesoPlantaDTO(
                        e.getIdProcesoPlanta(),
                        e.getPlantas().getColorPlanta(),
                        e.getProcesos().getNombreProceso()
                ))
                .collect(Collectors.toList());

        int totalPages = (int) Math.ceil((double) mappedList.size() / 20 ); // Total de páginas
        int fromIndex = Math.min((page - 1) * 20, mappedList.size());
        int toIndex = Math.min(page * 20, mappedList.size());

        List<ResponseProcesoPlantaDTO> paginatedList = mappedList.subList(fromIndex,toIndex);
        return new PaginatedResponse<>(page, totalPages,paginatedList);
    }

    public List<ResponseProcesoPlantaDTO> getAll(){
        ProcesoPlantaRepository repo = new ProcesoPlantaRepository();

        List<ProcesoPlanta> entidad = repo.listAll();

        List<ResponseProcesoPlantaDTO> mappedList = entidad.stream()
                .map(e -> new ResponseProcesoPlantaDTO(
                        e.getIdProcesoPlanta(),
                        e.getPlantas().getColorPlanta(),
                        e.getProcesos().getNombreProceso()
                ))
                .collect(Collectors.toList());

        return mappedList;
    }

    public ResponseProcesoPlantaDTO find(ProcesoPlanta pp){
        return new ResponseProcesoPlantaDTO(
                pp.getIdProcesoPlanta(),
                pp.getPlantas().getColorPlanta(),
                pp.getProcesos().getNombreProceso()
        );
    }
}
