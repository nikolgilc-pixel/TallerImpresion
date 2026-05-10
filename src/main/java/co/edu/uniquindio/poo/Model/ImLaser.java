package co.edu.uniquindio.poo.Model;

import javax.swing.*;

public class ImLaser implements Iimpresora{
    private String estado= "Disponible";

    @Override
    public void imprimir (SolicitudImpresion solicitudImpresion){
        estado="Ocupada";
        JOptionPane.showMessageDialog(null,
                "Imprimiendo (Laser): " + solicitudImpresion.getDocumento());
        estado="Disponible";

    }
    @Override
    public String verEstado(){
        return estado;
    }
}
