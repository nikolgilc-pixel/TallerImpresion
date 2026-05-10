package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;

public class AreaImpresion extends Area{
    private Iimpresora impresoraActiva;
    private ArrayList<SolicitudImpresion> colaSolicitud;
    private ArrayList<Iimpresora> listaImpresoras;

    public AreaImpresion(String nombre, int cantidadEmpleados, String codigo, String encargado) {
        super(nombre, cantidadEmpleados, codigo, encargado);
        this.colaSolicitud= new ArrayList<>();
        this.listaImpresoras= new ArrayList<>();
    }
    public void recibirSolicitud(SolicitudImpresion s) {
        colaSolicitud.add(s);
    }

    public void procesarSolicitud() {
        if (!colaSolicitud.isEmpty() && impresoraActiva != null) {
            SolicitudImpresion s = colaSolicitud.remove(0);
            impresoraActiva.imprimir(s);
        }
    }

    public void agregarImpresora(Iimpresora imp) {
        listaImpresoras.add(imp);
    }

    public void cambiarImpresora(Iimpresora imp) {
        this.impresoraActiva = imp;
    }
}



