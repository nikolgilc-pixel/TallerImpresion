package co.edu.uniquindio.poo.Model;

import javax.swing.*;

public class ImCartucho implements Iimpresora{
    private String estado= "Disponible";

    @Override
    public void imprimir (SolicitudImpresion solicitudImpresion){
        estado="Ocupada";
        JOptionPane.showMessageDialog(null,
                "Imprimiendo (Cartucho): " + solicitudImpresion.getDocumento());
        estado="Disponible";

    }
    @Override
    public String verEstado(){
        return estado;
    }

}
