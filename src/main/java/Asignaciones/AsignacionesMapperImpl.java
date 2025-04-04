package Asignaciones;

import Assets.PaginatedResponse;
import Maquina.Maquina;
import Tecnico.Tecnico;
import Turno.Turno;
import jakarta.enterprise.context.RequestScoped;

import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class AsignacionesMapperImpl {

    public Asignaciones create(AsignacionesDTO dto) {
        Asignaciones asignaciones = new Asignaciones();
        Maquina mq1 = new Maquina();
        Maquina mq2 = new Maquina();
        Tecnico tec = new Tecnico();
        Turno turno = new Turno();
        mq1.setIdMaquina(dto.idMaquina1());
        mq2.setIdMaquina(dto.idMaquina2());
        tec.setDNI(dto.DNITecnico());
        turno.setIdTurno(dto.idTurno());
        asignaciones.setMaquina1(mq1);
        asignaciones.setMaquina2(mq2);
        asignaciones.setTecnico(tec);
        asignaciones.setTurno(turno);
        asignaciones.setFechaInicio(dto.fechaInicio());
        asignaciones.setFechaFin(dto.fechaFin());
        return asignaciones;
    }

    public void update(AsignacionesDTO dto, Asignaciones asignaciones) {
        Maquina mq1 = new Maquina();
        Maquina mq2 = new Maquina();
        Tecnico tec = new Tecnico();
        Turno turno = new Turno();
        mq1.setIdMaquina(dto.idMaquina1());
        mq2.setIdMaquina(dto.idMaquina2());
        tec.setDNI(dto.DNITecnico());
        turno.setIdTurno(dto.idTurno());
        asignaciones.setMaquina1(mq1);
        asignaciones.setMaquina2(mq2);
        asignaciones.setTecnico(tec);
        asignaciones.setTurno(turno);
        asignaciones.setFechaInicio(dto.fechaInicio());
        asignaciones.setFechaFin(dto.fechaFin());
    }

    public PaginatedResponse<ResponseAsignacionesDTO> listPaginated(int page) {
        AsignacionesRepository asignaciones = new AsignacionesRepository();
        // Crear la consulta base
        List<Asignaciones> entidades = asignaciones.listAll();// Consulta la lista completa

        // Mapear manualmente los resultados al DTO
        List<ResponseAsignacionesDTO> mappedList = entidades.stream()
                .map(entidad -> new ResponseAsignacionesDTO(
                        entidad.getIdAsignacion(),
                        entidad.getMaquina1().getProcesoPlanta().getProcesos().getNombreProceso(),
                        entidad.getMaquina1().getModeloMaquina(),
                        entidad.getMaquina1().getProcesoPlanta().getPlantas().getColorPlanta(),
                        entidad.getMaquina1().getStatus(),
                        entidad.getMaquina2().getModeloMaquina(),
                        entidad.getMaquina2().getProcesoPlanta().getPlantas().getColorPlanta(),
                        entidad.getMaquina2().getStatus(),
                        entidad.getTecnico().getNombreTecnico()+" "+entidad.getTecnico().getApellidoTecnico(),
                        entidad.getTurno().getNombreTurno(),
                        entidad.getFechaInicio(),
                        entidad.getFechaFin()

                ))
                .collect(Collectors.toList());

        // Implementar paginación manual
        int totalPages = (int) Math.ceil((double) mappedList.size() / 15 ); // Total de páginas
        int fromIndex = Math.min((page - 1) * 15, mappedList.size());
        int toIndex = Math.min(page * 15, mappedList.size());

        // Sublista con los elementos de la página actual
        List<ResponseAsignacionesDTO> paginatedList = mappedList.subList(fromIndex, toIndex);

        // Retornar una respuesta paginada
        return new PaginatedResponse<>(page, totalPages, paginatedList);
    }

    public List<ResponseAsignacionesDTO> getAll() {
        AsignacionesRepository asignaciones = new AsignacionesRepository();
        // Crear la consulta base
        List<Asignaciones> entidades = asignaciones.listAll();// Consulta la lista completa

        // Mapear manualmente los resultados al DTO
        List<ResponseAsignacionesDTO> mappedList = entidades.stream()
                .map(entidad -> new ResponseAsignacionesDTO(
                        entidad.getIdAsignacion(),
                        entidad.getMaquina1().getProcesoPlanta().getProcesos().getNombreProceso(),
                        entidad.getMaquina1().getModeloMaquina(),
                        entidad.getMaquina1().getProcesoPlanta().getPlantas().getColorPlanta(),
                        entidad.getMaquina1().getStatus(),
                        entidad.getMaquina2().getModeloMaquina(),
                        entidad.getMaquina2().getProcesoPlanta().getPlantas().getColorPlanta(),
                        entidad.getMaquina2().getStatus(),
                        entidad.getTecnico().getNombreTecnico()+" "+entidad.getTecnico().getApellidoTecnico(),
                        entidad.getTurno().getNombreTurno(),
                        entidad.getFechaInicio(),
                        entidad.getFechaFin()

                ))
                .collect(Collectors.toList());
        return mappedList;
    }

    public AsignacionesDTO get(Asignaciones asignacion) {
        return new AsignacionesDTO(
                asignacion.getMaquina1().getIdMaquina(),
                asignacion.getMaquina2().getIdMaquina(),
                asignacion.getTecnico().getDNI(),
                asignacion.getTurno().getIdTurno(),
                asignacion.getFechaInicio(),
                asignacion.getFechaFin()
        );
    }
}
