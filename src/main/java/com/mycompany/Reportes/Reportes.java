package com.mycompany.Reportes;

import static com.mycompany.Reportes.ControlReportes.setReportess;
import javax.swing.table.DefaultTableModel;

public class Reportes extends javax.swing.JFrame {

    private static ReportePokemon[] reportes;

    private ControlReportes control;
    DefaultTableModel modelo;

    public Reportes() {
        initComponents();
        this.setLocationRelativeTo(this);
        setReportess(getReportes());
        control = new ControlReportes();
        control.ObtenerReportesPredeterminados(tblReportes);
        for (int i = 0; i < getReportes().length; i++) {
            System.out.println(getReportes()[i]);
        }

    }

    public static ReportePokemon[] getReportes() {
        return reportes;
    }

    public static void setReportes(ReportePokemon[] reportes) {
        Reportes.reportes = reportes;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tblReportes = new javax.swing.JTable();
        bntEnfermedad = new javax.swing.JButton();
        btnAlimento = new javax.swing.JButton();
        btnPaseo = new javax.swing.JButton();
        btnMuerte = new javax.swing.JButton();
        btnNacimiento = new javax.swing.JButton();
        btnLimpieza = new javax.swing.JButton();
        btnNivel = new javax.swing.JButton();
        btnMayor = new javax.swing.JButton();
        btnDefecto = new javax.swing.JButton();
        btnMenor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nivel", "Pokemon", "Acción", "Hora", "Fecha"
            }
        ));
        jScrollPane3.setViewportView(tblReportes);

        bntEnfermedad.setText("Enfermedad");
        bntEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEnfermedadActionPerformed(evt);
            }
        });

        btnAlimento.setText("Alimento");
        btnAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlimentoActionPerformed(evt);
            }
        });

        btnPaseo.setText("Paseo");
        btnPaseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaseoActionPerformed(evt);
            }
        });

        btnMuerte.setText("Muerte");
        btnMuerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuerteActionPerformed(evt);
            }
        });

        btnNacimiento.setText("Nacimiento");
        btnNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNacimientoActionPerformed(evt);
            }
        });

        btnLimpieza.setText("Limpieza");
        btnLimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiezaActionPerformed(evt);
            }
        });

        btnNivel.setText("Nivel");
        btnNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNivelActionPerformed(evt);
            }
        });

        btnMayor.setText("Mayor a Menor");

        btnDefecto.setText("Defecto");
        btnDefecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefectoActionPerformed(evt);
            }
        });

        btnMenor.setText("Menor a Mayor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDefecto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntEnfermedad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPaseo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNacimiento)
                    .addComponent(btnMuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpieza)
                    .addComponent(btnNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMayor)
                    .addComponent(btnMenor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNacimiento)
                    .addComponent(btnDefecto)
                    .addComponent(btnAlimento)
                    .addComponent(btnLimpieza)
                    .addComponent(btnMayor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenor)
                    .addComponent(bntEnfermedad)
                    .addComponent(btnPaseo)
                    .addComponent(btnMuerte)
                    .addComponent(btnNivel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEnfermedadActionPerformed
        modelo = (DefaultTableModel) tblReportes.getModel();
        modelo.getDataVector().removeAllElements();

        control.ObtenerReportesEnfermedad(tblReportes);
    }//GEN-LAST:event_bntEnfermedadActionPerformed

    private void btnDefectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefectoActionPerformed

        for (int i = 0; i < getReportes().length; i++) {
            System.out.println(getReportes()[i]);
        }
        modelo = (DefaultTableModel) tblReportes.getModel();
        modelo.getDataVector().removeAllElements();

        control.ObtenerReportesPredeterminados(tblReportes);
    }//GEN-LAST:event_btnDefectoActionPerformed

    private void btnAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlimentoActionPerformed
        modelo = (DefaultTableModel) tblReportes.getModel();
        modelo.getDataVector().removeAllElements();

        control.ObtenerReportesAlimento(tblReportes);
    }//GEN-LAST:event_btnAlimentoActionPerformed

    private void btnPaseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaseoActionPerformed
        modelo = (DefaultTableModel) tblReportes.getModel();
        modelo.getDataVector().removeAllElements();

        control.ObtenerReportesPaseo(tblReportes);
    }//GEN-LAST:event_btnPaseoActionPerformed

    private void btnNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNacimientoActionPerformed
        modelo = (DefaultTableModel) tblReportes.getModel();
        modelo.getDataVector().removeAllElements();

        control.ObtenerReportesNace(tblReportes);
    }//GEN-LAST:event_btnNacimientoActionPerformed

    private void btnMuerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuerteActionPerformed
        modelo = (DefaultTableModel) tblReportes.getModel();
        modelo.getDataVector().removeAllElements();

        control.ObtenerReportesMuere(tblReportes);
    }//GEN-LAST:event_btnMuerteActionPerformed

    private void btnLimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiezaActionPerformed
        modelo = (DefaultTableModel) tblReportes.getModel();
        modelo.getDataVector().removeAllElements();

        control.ObtenerReportesLimpieza(tblReportes);
    }//GEN-LAST:event_btnLimpiezaActionPerformed

    private void btnNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNivelActionPerformed
        modelo = (DefaultTableModel) tblReportes.getModel();
        modelo.getDataVector().removeAllElements();

        control.ObtenerReportesNivel(tblReportes);
    }//GEN-LAST:event_btnNivelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEnfermedad;
    private javax.swing.JButton btnAlimento;
    private javax.swing.JButton btnDefecto;
    private javax.swing.JButton btnLimpieza;
    private javax.swing.JButton btnMayor;
    private javax.swing.JButton btnMenor;
    private javax.swing.JButton btnMuerte;
    private javax.swing.JButton btnNacimiento;
    private javax.swing.JButton btnNivel;
    private javax.swing.JButton btnPaseo;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblReportes;
    // End of variables declaration//GEN-END:variables
}
