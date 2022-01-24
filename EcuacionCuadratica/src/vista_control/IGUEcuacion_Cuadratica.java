/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista_control;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.EcuacionCuadratica;
import modelo.Serializador;
import modelo.excepciones.AIgualACeroException;
import modelo.excepciones.RaicesNoRealesException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;


/**
 *
 * @author ADRIANA
 */
public class IGUEcuacion_Cuadratica extends javax.swing.JFrame {

    /**
     * Creates new form IGUEcuacion_Cuadratica
     */
    public IGUEcuacion_Cuadratica() {
        initComponents();
        serializador = new Serializador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblResultX1 = new javax.swing.JLabel();
        lblResultX2 = new javax.swing.JLabel();
        pnlEcuacion = new javax.swing.JPanel();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        lblXalCuadrado = new javax.swing.JLabel();
        lblX = new javax.swing.JLabel();
        lblIgualCero = new javax.swing.JLabel();
        btnResolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        mnubarMenuPrincipal = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuAbrir = new javax.swing.JMenuItem();
        mnuGuardar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        mnuEcuacion = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAcercaDe = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        jLabel1.setText("X1=");

        jLabel2.setText("X2=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultX2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultX1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblResultX1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultX2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pnlEcuacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Ecuacion:"));

        txtA.setBorder(javax.swing.BorderFactory.createTitledBorder("A:"));
        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });

        txtB.setBorder(javax.swing.BorderFactory.createTitledBorder("B:"));

        txtC.setBorder(javax.swing.BorderFactory.createTitledBorder("C:"));

        lblXalCuadrado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblXalCuadrado.setText("x^2 ");

        lblX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblX.setText("x");

        lblIgualCero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIgualCero.setText("= 0");

        btnResolver.setText("Resolver");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEcuacionLayout = new javax.swing.GroupLayout(pnlEcuacion);
        pnlEcuacion.setLayout(pnlEcuacionLayout);
        pnlEcuacionLayout.setHorizontalGroup(
            pnlEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEcuacionLayout.createSequentialGroup()
                .addGroup(pnlEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEcuacionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblXalCuadrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblX)
                        .addGap(18, 18, 18)
                        .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEcuacionLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnResolver)
                        .addGap(0, 142, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
            .addGroup(pnlEcuacionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIgualCero)
                .addGap(109, 109, 109))
        );
        pnlEcuacionLayout.setVerticalGroup(
            pnlEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEcuacionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblXalCuadrado)
                    .addComponent(lblX)
                    .addComponent(lblIgualCero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(pnlEcuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnResolver))
                .addGap(28, 28, 28))
        );

        mnuArchivo.setText("Archivo");

        mnuAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnuAbrir.setText("Abrir...");
        mnuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAbrirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuAbrir);

        mnuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        mnuGuardar.setText("Guardar...");
        mnuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGuardarActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuGuardar);

        mnuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        mnuSalir.setText("Salir");
        mnuArchivo.add(mnuSalir);

        mnubarMenuPrincipal.add(mnuArchivo);

        mnuEcuacion.setText("Ecuacion");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Grafica");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnuEcuacion.add(jMenuItem5);

        mnubarMenuPrincipal.add(mnuEcuacion);

        mnuAyuda.setText("Ayuda");

        mnuAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuAcercaDe.setText("AcercaDe");
        mnuAyuda.add(mnuAcercaDe);

        mnubarMenuPrincipal.add(mnuAyuda);

        setJMenuBar(mnubarMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEcuacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAbrirActionPerformed
        ecuacion = null;
         String nombreDelArchivo= JOptionPane.showInputDialog(this, "Escriba el nombre del archivo", "Nombre del archivo", WIDTH);
         //ecuacion = serializador.abrirObjeto(nombreDelArchivo);
         txtA.setText(String.valueOf(ecuacion.getA()));
         txtB.setText(String.valueOf(ecuacion.getB()));
         txtC.setText(String.valueOf(ecuacion.getC()));
         lblResultX1.setText(String.valueOf(ecuacion.getX1()));
         lblResultX2.setText(String.valueOf(ecuacion.getX2()));
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuAbrirActionPerformed

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        lblResultX1.setText("");
        lblResultX2.setText("");
        if(!txtA.getText().equals("") && !txtB.getText().equals("") && !txtC.getText().equals("")){
            try {
                double a, b, c;
                a= Double.parseDouble(txtA.getText());
                b=Double.parseDouble(txtB.getText());
                c=Double.parseDouble(txtC.getText());
                ecuacion= new EcuacionCuadratica(a,b,c);
                ecuacion.resolver();
            } catch (AIgualACeroException ex) {
                txtA.setToolTipText("Este valor debe ser distinto a cero");
            } catch (RaicesNoRealesException ex) {
                pnlEcuacion.setToolTipText("por favor vuelva a escribir los coeficientes de la ecuacion");
            }
            lblResultX1.setText(String.valueOf(ecuacion.getX1()));
            lblResultX2.setText(String.valueOf(ecuacion.getX2()));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResolverActionPerformed

    private void mnuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGuardarActionPerformed
        if(ecuacion != null){
            String nombreDelArchivo= JOptionPane.showInputDialog(this, "Escriba el nombre del archivo", "Nombre del archivo", JOptionPane.QUESTION_MESSAGE);
            serializador.guardarObjeto(ecuacion, nombreDelArchivo);
            JOptionPane.showMessageDialog(this, "La ecuacion ha sido guardada correctamente");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuGuardarActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(IGUEcuacion_Cuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IGUEcuacion_Cuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IGUEcuacion_Cuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IGUEcuacion_Cuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IGUEcuacion_Cuadratica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnResolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIgualCero;
    private javax.swing.JLabel lblResultX1;
    private javax.swing.JLabel lblResultX2;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel lblXalCuadrado;
    private javax.swing.JMenuItem mnuAbrir;
    private javax.swing.JMenuItem mnuAcercaDe;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuEcuacion;
    private javax.swing.JMenuItem mnuGuardar;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuBar mnubarMenuPrincipal;
    private javax.swing.JPanel pnlEcuacion;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    // End of variables declaration//GEN-END:variables
    EcuacionCuadratica ecuacion = null;
    Serializador serializador = null;
}
