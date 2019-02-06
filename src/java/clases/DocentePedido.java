package clases;

/**
 *
 * @author renzo
 */
public class DocentePedido {

    private int idDocentePedido;
    /*Pedido*/
    private String fecha;
    private String nombre;
    private String apellido;
    private String empresa;
    private String telefono;
    private String estudio;
    private String proyecto;
    private String controlcalidad;
    private String ensayos;
    private String observaciones;

    public DocentePedido(int idDocentePedido, String fecha, String nombre, String apellido, String empresa, String telefono, String estudio, String proyecto, String controlcalidad, String ensayos, String observaciones) {
        this.idDocentePedido = idDocentePedido;
        this.fecha = fecha;
        this.nombre = nombre;
        this.apellido = apellido;
        this.empresa = empresa;
        this.telefono = telefono;
        this.estudio = estudio;
        this.proyecto = proyecto;
        this.controlcalidad = controlcalidad;
        this.ensayos = ensayos;
        this.observaciones = observaciones;
    }

    public DocentePedido() {
    }

    public int getIdDocentePedido() {
        return idDocentePedido;
    }

    public void setIdDocentePedido(int idDocentePedido) {
        this.idDocentePedido = idDocentePedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getControlcalidad() {
        return controlcalidad;
    }

    public void setControlcalidad(String controlcalidad) {
        this.controlcalidad = controlcalidad;
    }

    public String getEnsayos() {
        return ensayos;
    }

    public void setEnsayos(String ensayos) {
        this.ensayos = ensayos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    

}
