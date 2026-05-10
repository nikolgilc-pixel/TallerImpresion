package co.edu.uniquindio.poo.Model;

public abstract class Area {
    private String nombre;
    private int cantidadEmpleados;
    private String codigo;
    private String encargado;

    public Area (String nombre, int cantidadEmpleados, String codigo, String encargado){
        this.nombre= nombre;
        this.cantidadEmpleados=cantidadEmpleados;
        this.codigo=codigo;
        this.encargado=encargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    @Override
    public String toString() {
        return "Area{" +
                "nombre='" + nombre + '\'' +
                ", cantidadEmpleados=" + cantidadEmpleados +
                ", codigo='" + codigo + '\'' +
                ", encargado='" + encargado + '\'' +
                '}';
    }
}
