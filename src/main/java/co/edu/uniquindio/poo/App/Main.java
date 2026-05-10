package co.edu.uniquindio.poo.App;

import co.edu.uniquindio.poo.Model.*;

import javax.swing.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Mi Empresa");

        // Crear áreas
        AreaAdm adm = new AreaAdm("Administrativa", 5, "A1", "Laura", 5000000, "Carlos");
        AreaComercial com = new AreaComercial("Comercial", 4, "C1", "Ana", 100, 50);
        AreaImpresion imp = new AreaImpresion("Impresión", 2, "I1", "Pedro");

        empresa.getListaAreas().add(adm);
        empresa.getListaAreas().add(com);
        empresa.getListaAreas().add(imp);

        // Crear impresoras
        Iimpresora laser = new ImLaser();
        Iimpresora cartucho = new ImCartucho();
        Iimpresora imp3D = new Im3D();

        imp.agregarImpresora(laser);
        imp.agregarImpresora(cartucho);
        imp.agregarImpresora(imp3D);

        imp.cambiarImpresora(laser);

        boolean salir = false;

        while (!salir) {

            String opcion = JOptionPane.showInputDialog(
                    "    MENÚ    \n" +
                            "1. Crear solicitud (Administrativa)\n" +
                            "2. Crear solicitud (Comercial)\n" +
                            "3. Procesar impresión\n" +
                            "4. Cambiar impresora\n" +
                            "5. Salir"
            );

            if (opcion == null) break;

            switch (opcion) {

                case "1":
                    String doc1 = JOptionPane.showInputDialog("Ingrese documento:");
                    SolicitudImpresion s1 = new SolicitudImpresion(doc1, LocalDateTime.now(), adm);
                    adm.getListaSolicitudes().add(s1);
                    imp.recibirSolicitud(s1);
                    JOptionPane.showMessageDialog(null, "Solicitud enviada desde Administrativa");
                    break;

                case "2":
                    String doc2 = JOptionPane.showInputDialog("Ingrese documento:");
                    SolicitudImpresion s2 = new SolicitudImpresion(doc2, LocalDateTime.now(), com);
                    com.getListaSolicitudes().add(s2);
                    imp.recibirSolicitud(s2);
                    JOptionPane.showMessageDialog(null, "Solicitud enviada desde Comercial");
                    break;

                case "3":
                    imp.procesarSolicitud();
                    break;

                case "4":
                    String opImp = JOptionPane.showInputDialog(
                            "Seleccione impresora:\n1. Láser\n2. Cartucho\n3. 3D"
                    );

                    if (opImp == null) break;

                    switch (opImp) {
                        case "1":
                            imp.cambiarImpresora(laser);
                            break;
                        case "2":
                            imp.cambiarImpresora(cartucho);
                            break;
                        case "3":
                            imp.cambiarImpresora(imp3D);
                            break;
                    }

                    JOptionPane.showMessageDialog(null, "Impresora cambiada");
                    break;

                case "5":
                    salir = true;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }
    }
}

