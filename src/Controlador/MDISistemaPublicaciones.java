package Controlador;

import Vista.*;

public class MDISistemaPublicaciones extends javax.swing.JFrame {

    private JInternalFrameAutores Autores;
    private JInternalFrameRevista revistas;

    public MDISistemaPublicaciones() {
        initComponents();
        setTitle("Publicaciones");//Agrega el titulo al MDI
        Autores = new JInternalFrameAutores();
     
        desktopPane.add(Autores);

        revistas = new JInternalFrameRevista();
        desktopPane.add(revistas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        VerAutoresMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemRevista = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setForeground(new java.awt.Color(0, 51, 204));

        editMenu.setMnemonic('e');
        editMenu.setText("Autor");

        VerAutoresMenuItem.setMnemonic('t');
        VerAutoresMenuItem.setText("Ver Autores");
        VerAutoresMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerAutoresMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(VerAutoresMenuItem);

        menuBar.add(editMenu);

        jMenu1.setText("Revista");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemRevista.setText("Ver Revista");
        jMenuItemRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRevistaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemRevista);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerAutoresMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerAutoresMenuItemActionPerformed
        // TODO add your handling code here:
        Autores.obtenerDatos();
        Autores.setVisible(true);
    }//GEN-LAST:event_VerAutoresMenuItemActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItemRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRevistaActionPerformed
             revistas.obtenerDatos();
        revistas.setVisible(true);
    }//GEN-LAST:event_jMenuItemRevistaActionPerformed

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
            java.util.logging.Logger.getLogger(MDISistemaPublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDISistemaPublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDISistemaPublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDISistemaPublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDISistemaPublicaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem VerAutoresMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItemRevista;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
