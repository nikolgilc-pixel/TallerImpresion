package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Area>listaAreas;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaAreas= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Area> getListaAreas() {
        return listaAreas;
    }

    public void setListaAreas(ArrayList<Area> listaAreas) {
        this.listaAreas = listaAreas;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", listaAreas=" + listaAreas +
                '}';
    }
    public String registrarArea(Area area){
        String resultado = "";

        Area areaEncontrada = buscarArea(area.getCodigo());

        if(areaEncontrada != null){
            resultado = "El área ya existe";
        } else {
            listaAreas.add(area);
            resultado = "Área registrada correctamente";
        }

        return resultado;
    }
    private Area buscarArea(String codigo){
        for(Area a : listaAreas){
            if(a.getCodigo().equals(codigo)){
                return a;
            }
        }
        return null;
    }
    public String eliminarArea(String codigo){
        String resultado = "";

        Area area = buscarArea(codigo);

        if(area != null){
            listaAreas.remove(area);
            resultado = "Área eliminada";
        } else {
            resultado = "El área no existe";
        }

        return resultado;
    }
    public String actualizarArea(String codigo, String nombre, int cantidadEmpleados, String encargado){
        String resultado = "";

        Area area = buscarArea(codigo);

        if(area != null){
            area.setNombre(nombre);
            area.setCantidadEmpleados(cantidadEmpleados);
            area.setEncargado(encargado);

            resultado = "Área actualizada";
        } else {
            resultado = "El área no existe";
        }

        return resultado;
    }
}
