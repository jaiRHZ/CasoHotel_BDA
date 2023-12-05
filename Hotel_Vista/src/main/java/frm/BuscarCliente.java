/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package frm;

import javax.swing.table.DefaultTableModel;
import dominio.Usuario;
import factory.FabricaNegocio;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ListSelectionModel;


/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class BuscarCliente extends javax.swing.JDialog {
    FabricaNegocio fabricaNegocio;
    List<Usuario> usuarios = new LinkedList<>();
    public Usuario usuario;

    /**
     * Creates new form buscarCliente
     */
    public BuscarCliente() {
        initComponents();
        fabricaNegocio = new FabricaNegocio();
         this.tblClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.usuarios = fabricaNegocio.crearUsuarioNegocio().consultarTodoUsuario();
        this.cargarTablaDefecto();
    }
    
     public void cargarTablaDefecto() {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblClientes.getModel();
        //Limpia tabla anterior
        modeloTabla.setRowCount(0);
        usuarios.forEach(persona -> {
            Object[] fila = {
                usuario.getNombres(),
                usuario.getApellidoPaterno(),
                usuario.getApellidoMaterno(),
                usuario.getTelefono(),
                usuario.getRfc()
            };
            modeloTabla.addRow(fila);
        });
    }
    
    public void cargarTablaBuscador(String tipo) {
        this.usuarios = fabricaNegocio.crearUsuarioNegocio().consultarTodoUsuario();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblClientes.getModel();
        //Limpia tabla anterior
        modeloTabla.setRowCount(0);
        usuarios.forEach(persona -> {
            Object[] fila = {
                usuario.getNombres(),
                usuario.getApellidoPaterno(),
                usuario.getApellidoMaterno(),
                usuario.getTelefono(),
                usuario.getRfc()
            };
            if (tipo.equals("Nombre")) {
                String nombre = usuario.getNombres() + " " + usuario.getApellidoPaterno() + " " + usuario.getApellidoMaterno();
                String textoBuscar = txtBuscarCliente.getText();
                if (textoBuscar != null && nombre.toLowerCase().contains(textoBuscar.toLowerCase())) {
                    modeloTabla.addRow(fila);
                }

            }

        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Cliente");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");

        txtBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarCliente.setText("Buscar");
        txtBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarClienteActionPerformed(evt);
            }
        });

        tblClientes.setBackground(new java.awt.Color(255, 255, 255));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Cliente"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(16, 16, 16))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuarios.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45)))
                .addComponent(btnCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarClienteActionPerformed
        // TODO add your handling code here:
        this.cargarTablaBuscador(this.txtBuscarCliente.getText());
    }//GEN-LAST:event_txtBuscarClienteActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBuscarCliente;
    // End of variables declaration//GEN-END:variables
}
