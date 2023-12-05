/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form pantallaPrincipal
     */
    public PantallaPrincipal() {
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuRegistrar = new javax.swing.JMenu();
        menuRegistrarUsuario = new javax.swing.JMenuItem();
        menuRegistrarAgencia = new javax.swing.JMenuItem();
        menuReservacion = new javax.swing.JMenu();
        menuReservarReservacion = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        menuConsultasCliente = new javax.swing.JMenuItem();
        menuConsultasReservacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hotel.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        menuRegistrar.setBackground(new java.awt.Color(0, 109, 182));
        menuRegistrar.setText("Registrar");

        menuRegistrarUsuario.setText("Usuario");
        menuRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarUsuarioActionPerformed(evt);
            }
        });
        menuRegistrar.add(menuRegistrarUsuario);

        menuRegistrarAgencia.setText("Agencia de Viajes");
        menuRegistrarAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarAgenciaActionPerformed(evt);
            }
        });
        menuRegistrar.add(menuRegistrarAgencia);

        jMenuBar1.add(menuRegistrar);

        menuReservacion.setBorder(null);
        menuReservacion.setText("Reservar");

        menuReservarReservacion.setText("Nueva Reservación");
        menuReservarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReservarReservacionActionPerformed(evt);
            }
        });
        menuReservacion.add(menuReservarReservacion);

        jMenuBar1.add(menuReservacion);

        menuConsultas.setText("Consultar");

        menuConsultasCliente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        menuConsultasCliente.setText("Cliente");
        menuConsultasCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasClienteActionPerformed(evt);
            }
        });
        menuConsultas.add(menuConsultasCliente);

        menuConsultasReservacion.setText("Consultar Reservacion");
        menuConsultasReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasReservacionActionPerformed(evt);
            }
        });
        menuConsultas.add(menuConsultasReservacion);

        jMenuBar1.add(menuConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuReservarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReservarReservacionActionPerformed
        // TODO add your handling code here:
        Reservacion reservacion = new Reservacion();
        
        reservacion.setVisible(true);

    }//GEN-LAST:event_menuReservarReservacionActionPerformed

    private void menuRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarUsuarioActionPerformed
        // TODO add your handling code here:
        RegistrarUsuario ru = new RegistrarUsuario();
        
        ru.setVisible(true);
    }//GEN-LAST:event_menuRegistrarUsuarioActionPerformed

    private void menuRegistrarAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarAgenciaActionPerformed
        // TODO add your handling code here:
        RegistrarAgencia ra = new RegistrarAgencia();
        
        ra.setVisible(true);
    }//GEN-LAST:event_menuRegistrarAgenciaActionPerformed

    private void menuConsultasClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasClienteActionPerformed
        // TODO add your handling code here:
        BuscarCliente bc = new BuscarCliente();
        
        bc.setVisible(true);
    }//GEN-LAST:event_menuConsultasClienteActionPerformed

    private void menuConsultasReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasReservacionActionPerformed
        // TODO add your handling code here:
        ConsultarReservacion cr = new ConsultarReservacion();
        
        cr.setVisible(true);
    }//GEN-LAST:event_menuConsultasReservacionActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenuItem menuConsultasCliente;
    private javax.swing.JMenuItem menuConsultasReservacion;
    private javax.swing.JMenu menuRegistrar;
    private javax.swing.JMenuItem menuRegistrarAgencia;
    private javax.swing.JMenuItem menuRegistrarUsuario;
    private javax.swing.JMenu menuReservacion;
    private javax.swing.JMenuItem menuReservarReservacion;
    // End of variables declaration//GEN-END:variables
}
