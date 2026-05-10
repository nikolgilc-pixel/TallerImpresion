package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;

public class AreaComercial extends Area{
    private int nVentas;
    private int metaVentas;
    private ArrayList<SolicitudImpresion> listaSolicitudes;

    public AreaComercial(String nombre, int cantidadEmpleados, String codigo, String encargado, int metaVentas, int nVentas) {
        super(nombre, cantidadEmpleados, codigo, encargado);
        this.metaVentas = metaVentas;
        this.nVentas = nVentas;
        this.listaSolicitudes= new ArrayList<>();
    }

    public int getnVentas() {
        return nVentas;
    }

    public void setnVentas(int nVentas) {
        this.nVentas = nVentas;
    }

    public ArrayList<SolicitudImpresion> getListaSolicitudes() {
        return listaSolicitudes;
    }

    public void setListaSolicitudes(ArrayList<SolicitudImpresion> listaSolicitudes) {
        this.listaSolicitudes = listaSolicitudes;
    }

    public int getMetaVentas() {
        return metaVentas;
    }

    public void setMetaVentas(int metaVentas) {
        this.metaVentas = metaVentas;
    }

    @Override
    public String toString() {
        return "AreaComercial{" +
                "nVentas=" + nVentas +
                ", metaVentas=" + metaVentas +
                ", listaSolicitudes=" + listaSolicitudes +
                '}';
    }
    public SolicitudImpresion crearSolicitud(String documento) {
        SolicitudImpresion s = new SolicitudImpresion(
                documento,
                java.time.LocalDateTime.now(),
                this
        );
        listaSolicitudes.add(s);
        return s;
    }
}
