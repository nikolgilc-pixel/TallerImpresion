package co.edu.uniquindio.poo.Model;

import java.time.LocalDateTime;

public class SolicitudImpresion {
    private String documento;
    private LocalDateTime hora;
    private Area areaOrigen;

    public SolicitudImpresion(String documento, LocalDateTime hora, Area areaOrigen) {
        this.documento = documento;
        this.hora = hora;
        this.areaOrigen = areaOrigen;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDateTime getLocalDateTime() {
        return hora;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.hora = localDateTime;
    }

    public Area getAreaOrigen() {
        return areaOrigen;
    }

    public void setAreaOrigen(Area areaOrigen) {
        this.areaOrigen = areaOrigen;
    }

    @Override
    public String toString() {
        return "SolicitudImpresion{" +
                "documento='" + documento + '\'' +
                ", localDateTime=" + hora +
                ", areaOrigen=" + areaOrigen +
                '}';
    }
}
