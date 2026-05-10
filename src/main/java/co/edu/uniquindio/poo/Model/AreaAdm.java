package co.edu.uniquindio.poo.Model;

import java.util.ArrayList;

public class AreaAdm extends Area{
    private double presupuesto;
    private String responsableRRHH;
    private ArrayList<SolicitudImpresion> listaSolicitudes;

    public AreaAdm(String nombre, int cantidadEmpleados, String codigo, String encargado, double presupuesto, String responsableRRHH) {
        super(nombre, cantidadEmpleados, codigo, encargado);
        this.presupuesto = presupuesto;
        this.responsableRRHH = responsableRRHH;
        this.listaSolicitudes= new ArrayList<>();
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getResponsableRRHH() {
        return responsableRRHH;
    }

    public void setResponsableRRHH(String responsableRRHH) {
        this.responsableRRHH = responsableRRHH;
    }

    public ArrayList<SolicitudImpresion> getListaSolicitudes() {
        return listaSolicitudes;
    }

    public void setListaSolicitudes(ArrayList<SolicitudImpresion> listaSolicitudes) {
        this.listaSolicitudes = listaSolicitudes;
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
