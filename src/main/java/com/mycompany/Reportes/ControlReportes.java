package com.mycompany.Reportes;

import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.getReportesPok;
import static com.mycompany.JFrameMascotaVirtual.JFramePrincipal.setReportesPok;
import static com.mycompany.Reportes.Reportes.getReportes;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControlReportes {

    private static ReportePokemon[] reportes;

    public ControlReportes() {
    }

    public static ReportePokemon[] getReportess() {
        return reportes;
    }

    public static void setReportess(ReportePokemon[] reportes) {
        ControlReportes.reportes = reportes;
    }

    public void agregarRepoteInicial(String nombre, String accion, String fecha, String hora, int nivel) {
        ReportePokemon nuevoRep = new ReportePokemon();
        nuevoRep.setNombre(nombre);
        nuevoRep.setAccion(accion);
        nuevoRep.setFecha(fecha);
        nuevoRep.setHora(hora);
        nuevoRep.setNivel(nivel);
        ReportePokemon[] nuevoReportein = new ReportePokemon[1];
        nuevoReportein[0] = nuevoRep;
        setReportess(nuevoReportein);
        setReportesPok(nuevoReportein);
        for (int i = 0; i < nuevoReportein.length; i++) {
            System.out.println(nuevoReportein[i]);  
        }
    }

    public void agregarRepote(String nombre, String accion, String fecha, String hora, int nivel) {
        ReportePokemon nuevoRep = new ReportePokemon();
        nuevoRep.setNombre(nombre);
        nuevoRep.setAccion(accion);
        nuevoRep.setFecha(fecha);
        nuevoRep.setHora(hora);
        nuevoRep.setNivel(nivel);
        
        ReportePokemon[] nuevoReporte = new ReportePokemon[getReportesPok().length + 1];
        

            for (int i = 0; i < nuevoReporte.length; i++) {
                if (i == 0) {
                    nuevoReporte[i] = nuevoRep;
                } else {
                    nuevoReporte[i] = getReportesPok()[i-1];

                }
            }
            setReportess(nuevoReporte);
            setReportesPok(nuevoReporte);
       
        System.out.println(nuevoRep);

    }

    public void ObtenerReportesPredeterminados(JTable tabla) {

        for (int i = 0; i < getReportes().length; i++) {
            System.out.println(getReportes()[i]);

        }
        String[] datos = new String[5];
        for (int i = 0; i < getReportes().length; i++) {
            datos[0] = Integer.toString(getReportes()[i].getNivel());
            datos[1] = getReportes()[i].getNombre();
            datos[2] = getReportes()[i].getAccion();
            datos[3] = getReportes()[i].getHora();
            datos[4] = getReportes()[i].getFecha();
            DefaultTableModel modelo;
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(datos);
        }
    }
    public void ObtenerReportesEnfermedad(JTable tabla){
        String[] datos = new String[5];
        for (int i = 0; i < getReportes().length; i++) {
            if("Se enfermo".equals(getReportes()[i].getAccion()) || "Fue curada".equals(getReportes()[i].getAccion())){
            datos[0] = Integer.toString(getReportes()[i].getNivel());
            datos[1] = getReportes()[i].getNombre();
            datos[2] = getReportes()[i].getAccion();
            datos[3] = getReportes()[i].getHora();
            datos[4] = getReportes()[i].getFecha();
            DefaultTableModel modelo;
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(datos);
            }
        }
    }
     public void ObtenerReportesAlimento(JTable tabla){
         String[] datos = new String[5];
        for (int i = 0; i < getReportes().length; i++) {
            if("Peticion alimento".equals(getReportes()[i].getAccion()) || "Fue alimentada".equals(getReportes()[i].getAccion())){
            datos[0] = Integer.toString(getReportes()[i].getNivel());
            datos[1] = getReportes()[i].getNombre();
            datos[2] = getReportes()[i].getAccion();
            datos[3] = getReportes()[i].getHora();
            datos[4] = getReportes()[i].getFecha();
            DefaultTableModel modelo;
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(datos);
            }
        }
     }
     public void ObtenerReportesNace(JTable tabla){
         String[] datos = new String[5];
        for (int i = 0; i < getReportes().length; i++) {
            if("Nace".equals(getReportes()[i].getAccion())){
            datos[0] = Integer.toString(getReportes()[i].getNivel());
            datos[1] = getReportes()[i].getNombre();
            datos[2] = getReportes()[i].getAccion();
            datos[3] = getReportes()[i].getHora();
            datos[4] = getReportes()[i].getFecha();
            DefaultTableModel modelo;
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(datos);
            }
        }
     }
     public void ObtenerReportesMuere(JTable tabla){
         String[] datos = new String[5];
        for (int i = 0; i < getReportes().length; i++) {
            if("Murio".equals(getReportes()[i].getAccion())){
            datos[0] = Integer.toString(getReportes()[i].getNivel());
            datos[1] = getReportes()[i].getNombre();
            datos[2] = getReportes()[i].getAccion();
            datos[3] = getReportes()[i].getHora();
            datos[4] = getReportes()[i].getFecha();
            DefaultTableModel modelo;
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(datos);
            }
        }
     }
     public void ObtenerReportesPaseo(JTable tabla){
         String[] datos = new String[5];
        for (int i = 0; i < getReportes().length; i++) {
            if("Peticion paseo".equals(getReportes()[i].getAccion()) || "Salio de paseo".equals(getReportes()[i].getAccion())){
            datos[0] = Integer.toString(getReportes()[i].getNivel());
            datos[1] = getReportes()[i].getNombre();
            datos[2] = getReportes()[i].getAccion();
            datos[3] = getReportes()[i].getHora();
            datos[4] = getReportes()[i].getFecha();
            DefaultTableModel modelo;
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(datos);
            }
        }
     }
     public void ObtenerReportesLimpieza(JTable tabla){
         String[] datos = new String[5];
        for (int i = 0; i < getReportes().length; i++) {
            if("Peticion limpieza".equals(getReportes()[i].getAccion()) || "Fue limpiada".equals(getReportes()[i].getAccion())){
            datos[0] = Integer.toString(getReportes()[i].getNivel());
            datos[1] = getReportes()[i].getNombre();
            datos[2] = getReportes()[i].getAccion();
            datos[3] = getReportes()[i].getHora();
            datos[4] = getReportes()[i].getFecha();
            DefaultTableModel modelo;
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(datos);
            }
        }
     }
     public void ObtenerReportesNivel(JTable tabla){
         String[] datos = new String[5];
        for (int i = 0; i < getReportes().length; i++) {
            if("Subio nivel".equals(getReportes()[i].getAccion())){
            datos[0] = Integer.toString(getReportes()[i].getNivel());
            datos[1] = getReportes()[i].getNombre();
            datos[2] = getReportes()[i].getAccion();
            datos[3] = getReportes()[i].getHora();
            datos[4] = getReportes()[i].getFecha();
            DefaultTableModel modelo;
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(datos);
            }
        }
     }
}
