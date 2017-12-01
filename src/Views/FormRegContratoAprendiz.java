/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.sql.ResultSet;
import java.util.Calendar;

/**
 *
 * @author Miryam Victoria
 */
public class FormRegContratoAprendiz extends javax.swing.JFrame {

    /**
     * Creates new form FormRegContratoAprendiz
     */
    public FormRegContratoAprendiz() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroDocumento = new javax.swing.JTextField();
        cbxARL = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSalarioBasico = new javax.swing.JTextField();
        cbxFondoSalud = new javax.swing.JComboBox<>();
        txtAtep = new javax.swing.JTextField();
        cbxZonaLaboral = new javax.swing.JComboBox<>();
        cbxTipoCuenta = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        cbxPeriodoPago = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cbxTipoducumento = new javax.swing.JComboBox<>();
        txtNoContrato = new javax.swing.JTextField();
        txtInstituciones = new javax.swing.JTextField();
        cbxTipoContacto = new javax.swing.JComboBox<>();
        cbxCiudad = new javax.swing.JComboBox<>();
        txtNit = new javax.swing.JTextField();
        cbxBancoCuenta = new javax.swing.JComboBox<>();
        txtNumeroCuenta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        DateIngreso = new datechooser.beans.DateChooserCombo();
        DateRetiro = new datechooser.beans.DateChooserCombo();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("DATOS DEL CONTRATO CONTRATISTA APRENDIZ SENA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("% ATEP");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 140, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ARL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));
        jPanel1.add(txtNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 150, 30));

        cbxARL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        jPanel1.add(cbxARL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 150, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("TIPO DE DOCUMENTO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("FECHA DE INGRESO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("INSTITUCIÓN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ZONA DE LABORES");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("SALARIO BASICO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("TIPO DE CUENTA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("PERIODO DE PAGO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        jPanel1.add(txtSalarioBasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 150, 30));

        cbxFondoSalud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        jPanel1.add(cbxFondoSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 150, 30));
        jPanel1.add(txtAtep, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 150, 30));

        cbxZonaLaboral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        jPanel1.add(cbxZonaLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 150, 30));

        cbxTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        jPanel1.add(cbxTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 150, 30));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 150, 30));

        cbxPeriodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        jPanel1.add(cbxPeriodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 150, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("No DE CONTRATO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("TIPO DE CONTRACTO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 140, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("# DE DOCUMENTO");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 140, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("FECHA DE RETIRO");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 140, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("NIT");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 140, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("CIUDAD");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 140, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("BANCO CUENTA");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 140, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("NUMERO DE CUENTA");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 140, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("FONDO DE SALUD");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 140, 20));

        cbxTipoducumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        cbxTipoducumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoducumentoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoducumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 150, 30));
        jPanel1.add(txtNoContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 150, 30));
        jPanel1.add(txtInstituciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 150, 30));

        cbxTipoContacto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        jPanel1.add(cbxTipoContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 150, 30));

        cbxCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        jPanel1.add(cbxCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 150, 30));
        jPanel1.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 150, 30));

        cbxBancoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        jPanel1.add(cbxBancoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 150, 30));
        jPanel1.add(txtNumeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 150, 30));

        jButton1.setText("BUSCAR");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 90, -1));

        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, -1, -1));

        jButton3.setText("ELIMINAR");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 90, -1));

        jButton4.setText("GUARDAR");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 90, -1));

        DateIngreso.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    jPanel1.add(DateIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 150, 30));

    DateRetiro.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
jPanel1.add(DateRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, 30));

jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 50, 70));

jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 60, 70));

jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 50, 70));

jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 30, 70));

getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 570));

pack();
}// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbxTipoducumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoducumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoducumentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormRegContratoAprendiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegContratoAprendiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegContratoAprendiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegContratoAprendiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegContratoAprendiz().setVisible(true);
            }
        });
    }

     void setGuardar() {
//        Ctrl objCtrl = new Ctrl();
//        int nodecontacto = Integer.parseInt(txtNoContrato.getText());
//        String tipo_documento = cbxTipoducumento.getSelectedItem().toString();
//        int año = dateFeIngreso.getSelectedDate().get(Calendar.YEAR);
//        int mes = dateFeIngreso.getSelectedDate().get(Calendar.MONTH) + 1;
//        int dia = dateFeIngreso.getSelectedDate().get(Calendar.DAY_OF_MONTH);
//        String fecha = año + "-" + mes + "-" + dia;
//        String institucion = txtInstituciones.getText();
//        String zona_laboral = cbxZonaLaboral.getSelectedItem().toString();
//        int salario_basico = Integer.parseInt(txtSalarioBasico.getText());
//        String tipo_cuenta= cbxTipoCuenta.getSelectedItem().toString();
//        String periodo_pago = cbxPeriodoPago.getSelectedItem().toString();
//        int arl = cbxARL.getSelectedItem().toString();
//        String tipo_contrato = cbxTipoContacto..getSelectedItem().toString();
//        int numero_documento = Integer.parseInt(txtNumeroDocumento.getText());
//        int año2 = dateRetiro.getSelectedDate().get(Calendar.YEAR);
//        int mes2 = dateRetiro.getSelectedDate().get(Calendar.MONTH) + 1;
//        int dia2 = dateRetiro.getSelectedDate().get(Calendar.DAY_OF_MONTH);
//        String fecha2 = año2 + "-" + mes2 + "-" + dia2;
//        int nit = Integer.parseInt(txtNit.getText());
//        String ciudad= cbxCiudad.getSelectedItem().toString();
//        String banco_cuenta= cbxBancoCuenta.getSelectedItem().toString();
//        int numero_cuenta = Integer.parseInt(txtNumeroCuenta.getText());
//        String fonde_salud= cbxFondoSalud.getSelectedItem().toString();
//        int atep = Integer.parseInt(txtAtep.getText());
//        Ctrl.guardar();

    }
    
    void actualizar() {
        int no_contacto = Integer.parseInt(txtNoContrato.getText());
        String tipo_documento = cbxTipoducumento.getSelectedItem().toString();
//        int año = dateFeIngreso.getSelectedDate().get(Calendar.YEAR);
//        int mes = dateFeIngreso.getSelectedDate().get(Calendar.MONTH) + 1;
//        int dia = dateFeIngreso.getSelectedDate().get(Calendar.DAY_OF_MONTH);
//        String fecha = año + "-" + mes + "-" + dia;
        String institucion = txtInstituciones.getText();
        int salario_basico = Integer.parseInt(txtSalarioBasico.getText());
        int numero_documento = Integer.parseInt(txtNumeroDocumento.getText());
//        int año2 = dateRetiro.getSelectedDate().get(Calendar.YEAR);
//        int mes2 = dateRetiro.getSelectedDate().get(Calendar.MONTH) + 1;
//        int dia2 = dateRetiro.getSelectedDate().get(Calendar.DAY_OF_MONTH);
//        String fecha2 = año2 + "-" + mes2 + "-" + dia2;
        int nit = Integer.parseInt(txtNit.getText());
        int numero_cuenta = Integer.parseInt(txtNumeroCuenta.getText());
        int atep = Integer.parseInt(txtAtep.getText());
    }
        
    
    
        public void cargarDatos() {
//        Ctrl objectrl = new Ctrl();
//        String no_contacto = txtNoContrato.getText();
//        ResultSet datos = objectrl.cargarDatos(no_contacto);
//
//        try {
//            while () {
//               
//            }
//        } catch (Exception e) {
//        }
            
        
    }    
       void elimina(){
//         Ctrl objctrl = new Ctrl();
        String no_contacto = txtNoContrato.getText();
//        objctrl.elimnar(no_contacto);
      } 
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo DateIngreso;
    private datechooser.beans.DateChooserCombo DateRetiro;
    private javax.swing.JComboBox<String> cbxARL;
    private javax.swing.JComboBox<String> cbxBancoCuenta;
    private javax.swing.JComboBox<String> cbxCiudad;
    private javax.swing.JComboBox<String> cbxFondoSalud;
    private javax.swing.JComboBox<String> cbxPeriodoPago;
    private javax.swing.JComboBox<String> cbxTipoContacto;
    private javax.swing.JComboBox<String> cbxTipoCuenta;
    private javax.swing.JComboBox<String> cbxTipoducumento;
    private javax.swing.JComboBox<String> cbxZonaLaboral;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAtep;
    private javax.swing.JTextField txtInstituciones;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNoContrato;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextField txtNumeroDocumento;
    private javax.swing.JTextField txtSalarioBasico;
    // End of variables declaration//GEN-END:variables
}
