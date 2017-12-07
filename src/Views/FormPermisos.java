/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.CtrlPermisosVacaciones;
import datechooser.beans.DateChooserCombo;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author BAUTISTA TTRIANA
 */
public class FormPermisos extends javax.swing.JFrame {

    /**
     * Creates new form FormPermisos
     */
    public FormPermisos() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("INTERFACE-PERMISOS");
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnomem = new javax.swing.JTextField();
        txtcelem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnumdoc = new javax.swing.JTextField();
        txtdireem = new javax.swing.JTextField();
        txtcorrem = new javax.swing.JTextField();
        bteliminar = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        btbuscar = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdetpermi = new javax.swing.JTextArea();
        dtfechadesde = new datechooser.beans.DateChooserCombo();
        dtfechahasta = new datechooser.beans.DateChooserCombo();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("                      PERMISOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 350, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("DETALLE DEL PERMISO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("# DE DOCUMENTO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CELULAR DEL EMPLEADO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("HORA/FECHA HASTA:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        txtnomem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtnomem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 170, -1));

        txtcelem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtcelem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("NOMBRE DE EMPLEADO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("DIRECCION EMPLEADO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("CORREO EMPLEADO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("HORA/FECHA DESDE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 170, -1));

        txtnumdoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtnumdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 170, -1));

        txtdireem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtdireem, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 170, -1));

        txtcorrem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtcorrem, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 170, -1));

        bteliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bteliminar.setText("ELIMINAR");
        jPanel1.add(bteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 100, -1));

        btguardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btguardar.setText("GUARDAR");
        jPanel1.add(btguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 110, -1));

        btbuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btbuscar.setText("BUSCAR");
        jPanel1.add(btbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 120, -1));

        btmodificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btmodificar.setText("MODIFICAR");
        jPanel1.add(btmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 110, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 700, 10));

        txtdetpermi.setColumns(20);
        txtdetpermi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdetpermi.setRows(5);
        jScrollPane1.setViewportView(txtdetpermi);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 520, 90));

        dtfechadesde.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
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
    jPanel1.add(dtfechadesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 170, -1));

    dtfechahasta.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
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
jPanel1.add(dtfechahasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 170, -1));

jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 60, 40));

jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 70, 40));

jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 60, 40));

jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 50, 40));

getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 470));

pack();
}// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FormPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPermisos().setVisible(true);
            }
        });
    }
void guardar(){
    CtrlPermisosVacaciones objCtrl = new CtrlPermisosVacaciones();
        int id =Integer.parseInt(txtid.getText());
        String dateDesde = getDate(dtfechadesde);
        String datehasta = getDate(dtfechahasta);
        int numdocu = Integer.parseInt(txtnumdoc.getText());
        String detped= txtdetpermi.getText();
        objCtrl.actualizar(dateDesde, detped, datehasta, id, numdocu, "2");
}
String getDate(DateChooserCombo dateChooser){
    SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
    Calendar dateS = dateChooser.getSelectedDate();
    String date = format1.format(dateS.getTime());
    return date;
}
void actualizar(){
     CtrlPermisosVacaciones objCtrl = new CtrlPermisosVacaciones();
        String id = txtid.getText();
        String dateDesde = getDate(dtfechadesde);
        String datehasta = getDate(dtfechadesde);
        int numdocu = Integer.parseInt(txtnumdoc.getText());
        String detper= txtdetpermi.getText();
        objCtrl.actualizar(dateDesde, detper, datehasta, id, numdocu, "2");
}
void cargarDatos() {
        CtrlPermisosVacaciones objctrl = new CtrlPermisosVacaciones();
       int id = Integer.parseInt(txtid.getText());
        ResultSet datos = objctrl.cargarDatosEmpleado(id);
        String numdocu="",  tipodoc="", nombreem="", celemp="", dateDesde="", datehasta="", direcemp="",  correoem="", detped="";
    
        try {
            while (datos.next()) {
                
                numdocu= datos.getString(1);
                nombreem = datos.getString(2);
                celemp = datos.getString(3);
                dateDesde = datos.getString(4);
                datehasta = datos.getString(5);
                direcemp = datos.getString(6);
                correoem = datos.getString(7);
                detped = datos.getString(8);
                
            }
        } catch (Exception e) {
        }
        txtnumdoc.setText(numdocu);
        txtnomem.setText(nombreem);
        txtcelem.setText(celemp);
        dtfechadesde.setText(dateDesde);
        dtfechahasta.setText(datehasta);
        txtdireem.setText(direcemp);
        txtcorrem.setText(correoem);
        txtdetpermi.setText(detped);
        
    }
        void eliminar() {
        CtrlPermisosVacaciones objctrl = new CtrlPermisosVacaciones();
        int id = Integer.parseInt(txtid.getText());
        objctrl.eliminar(id);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btmodificar;
    private datechooser.beans.DateChooserCombo dtfechadesde;
    private datechooser.beans.DateChooserCombo dtfechahasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtcelem;
    private javax.swing.JTextField txtcorrem;
    private javax.swing.JTextArea txtdetpermi;
    private javax.swing.JTextField txtdireem;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnomem;
    private javax.swing.JTextField txtnumdoc;
    // End of variables declaration//GEN-END:variables
}
