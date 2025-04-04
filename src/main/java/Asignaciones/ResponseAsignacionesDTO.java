package Asignaciones;

public class ResponseAsignacionesDTO{

    private Long id;
    private String Proceso;
    private String Maquina1;
    private String PlantaMq1;
    private String statusMq1;
    private String Maquina2;
    private String PlantaMq2;
    private String statusMq2;
    private String Tecnico;
    private String Turno;
    private String fechaInicio;
    private String fechaFin;

    public ResponseAsignacionesDTO(Long id,String proceso, String Maquina1, String PlantaMq1, Integer statusMq1, String Maquina2, String PlantaMq2, Integer statusMq2, String Tecnico, String Turno, Integer fechaInicio, Integer fechaFin) {
        this.id = id;
        this.Proceso = proceso;
        this.Maquina1 = Maquina1;
        this.PlantaMq1 = PlantaMq1;
        this.statusMq1 = convertirEstado(statusMq1);
        this.Maquina2 = Maquina2;
        this.PlantaMq2 = PlantaMq2;
        this.statusMq2 = convertirEstado(statusMq2);
        this.Tecnico = Tecnico;
        this.Turno = Turno;
        this.fechaInicio = convertirFecha(fechaInicio);
        this.fechaFin = convertirFecha(fechaFin);
    }

    private String convertirEstado(Integer status) {
        return (status != null && status == 1) ? "Activo" : "Inactivo"; // Lógica de conversión
    }

    private String convertirFecha(Integer fecha){
        // Descomponer el número
        int año = fecha / 10000; // Los primeros 4 dígitos corresponden al año
        int mes = (fecha / 100) % 100; // Los siguientes 2 dígitos corresponden al mes
        int dia = fecha % 100;

        return año+"/"+mes+"/"+dia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProceso() {
        return Proceso;
    }

    public void setProceso(String proceso) {
        Proceso = proceso;
    }

    public String getMaquina1() {
        return Maquina1;
    }

    public void setMaquina1(String maquina1) {
        Maquina1 = maquina1;
    }

    public String getPlantaMq1() {
        return PlantaMq1;
    }

    public void setPlantaMq1(String plantaMq1) {
        PlantaMq1 = plantaMq1;
    }

    public String getStatusMq1() {
        return statusMq1;
    }

    public void setStatusMq1(String statusMq1) {
        this.statusMq1 = statusMq1;
    }

    public String getMaquina2() {
        return Maquina2;
    }

    public void setMaquina2(String maquina2) {
        Maquina2 = maquina2;
    }

    public String getPlantaMq2() {
        return PlantaMq2;
    }

    public void setPlantaMq2(String plantaMq2) {
        PlantaMq2 = plantaMq2;
    }

    public String getStatusMq2() {
        return statusMq2;
    }

    public void setStatusMq2(String statusMq2) {
        this.statusMq2 = statusMq2;
    }

    public String getTecnico() {
        return Tecnico;
    }

    public void setTecnico(String tecnico) {
        Tecnico = tecnico;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String turno) {
        Turno = turno;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Integer fechaInicio) {
        this.fechaInicio = convertirFecha(fechaInicio);
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Integer fechaFin) {
        this.fechaFin = convertirFecha(fechaFin);
    }
}
