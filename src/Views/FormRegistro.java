/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author ADMIN
 */
public class FormRegistro extends javax.swing.JFrame {

    /**
     * Creates new form FormRegistro
     */
    public FormRegistro() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        cbxtipodocumento = new javax.swing.JComboBox<>();
        txtnumerodocumento = new javax.swing.JTextField();
        cbxestadocivil = new javax.swing.JComboBox<>();
        cbxciudad2 = new javax.swing.JComboBox<>();
        cbxdepartamento2 = new javax.swing.JComboBox<>();
        cbxRH = new javax.swing.JComboBox<>();
        cbxfdepartamento2 = new javax.swing.JComboBox<>();
        cbxciudad1 = new javax.swing.JComboBox<>();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        btguardar = new javax.swing.JButton();
        btbuscar = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jSeparator3 = new javax.swing.JSeparator();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("                                                                       DATOS DEL EMPLEADO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 990, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("RH");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("CORREO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("NOMBRE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("APELLIDOS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("EDAD");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("DEPARTAMENTO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("DEPARTAMENTO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("CIUDAD");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("CIUDAD");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("TIPO DE DOCUMENTO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("TELEFONO");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("DIRECCION");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("FECHA DE EXPEDICION");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("ESTADO CIVIL");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("FECHA DE NACIMIENTO");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("NUMERO DE DOCUMENTO");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, 30));

        txtapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidosActionPerformed(evt);
            }
        });
        jPanel1.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 190, -1));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 190, -1));

        cbxtipodocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxtipodocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "CEDULA", "TARJETA DE IDENTIDAD", "CEDULA EXTRANGERA" }));
        jPanel1.add(cbxtipodocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 190, -1));
        jPanel1.add(txtnumerodocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 190, -1));

        cbxestadocivil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxestadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "SOLTERO/A", "COMPROMETIDO/A", "CASADO/A", "DIVORCIADO/A", "VIUDO/A", " ", " " }));
        jPanel1.add(cbxestadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 190, -1));

        cbxciudad2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxciudad2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE..." }));
        jPanel1.add(cbxciudad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 190, -1));

        cbxdepartamento2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxdepartamento2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE..." }));
        jPanel1.add(cbxdepartamento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 190, 30));

        cbxRH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxRH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "O +", "A  -", "A +", "B  -", "B  -", "AB +", "AB -" }));
        jPanel1.add(cbxRH, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 190, -1));

        cbxfdepartamento2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxfdepartamento2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE..." }));
        jPanel1.add(cbxfdepartamento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 190, -1));

        cbxciudad1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxciudad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE..." }));
        jPanel1.add(cbxciudad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 190, -1));

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 190, -1));

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 540, 190, -1));

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 190, -1));
        jPanel1.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 190, -1));

        btguardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btguardar.setText("GUARDAR");
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, -1, -1));

        btbuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btbuscar.setText("BUSCAR");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 670, 130, 30));

        btmodificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btmodificar.setText("MODIFICAR");
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(btmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 670, -1, -1));

        bteliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bteliminar.setText("ELIMINAR");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        jPanel1.add(bteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 670, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, 210));
        jPanel1.add(dateChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 190, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, 220));
        jPanel1.add(dateChooserCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 190, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 0, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 990, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtapellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtapellidosActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btguardarActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btbuscarActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btmodificarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bteliminarActionPerformed

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
            java.util.logging.Logger.getLogger(FormRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegistro().setVisible(true);
            }
        });
        
       
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btmodificar;
    private javax.swing.JComboBox<String> cbxRH;
    private javax.swing.JComboBox<String> cbxciudad1;
    private javax.swing.JComboBox<String> cbxciudad2;
    private javax.swing.JComboBox<String> cbxdepartamento2;
    private javax.swing.JComboBox<String> cbxestadocivil;
    private javax.swing.JComboBox<String> cbxfdepartamento2;
    private javax.swing.JComboBox<String> cbxtipodocumento;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumerodocumento;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
