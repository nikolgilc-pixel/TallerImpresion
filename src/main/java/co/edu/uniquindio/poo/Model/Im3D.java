package co.edu.uniquindio.poo.Model;

import javax.swing.*;

public class Im3D implements Iimpresora{
    private String estado= "Disponible";

    @Override
    public void imprimir (SolicitudImpresion solicitudImpresion){
        estado="Ocupada";
        JOptionPane.showMessageDialog(null,
                "Imprimiendo (3D): " + solicitudImpresion.getDocumento());
        estado="Disponible";

    }
    @Override
    public String verEstado(){
        return estado;
    }
}
