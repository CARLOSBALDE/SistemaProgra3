package Notepad;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author CARLOS BALDERRAMA
 */
public class Menu_Buscar extends javax.swing.JDialog {
     
    InterfazNotepad controlador = InterfazNotepad.getControlador();
    private static boolean Buscar=false,BuscarR=false,reemplazar=false,reemplazarTodo=false;

  
    public Menu_Buscar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(controlador);
        TEXTO.setText("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        BtnReemplazar = new javax.swing.JButton();
        TEXTO = new javax.swing.JTextField();
        BtnReemplazarTodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Introduce el texto ");

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnReemplazar.setText("Reemplazar");
        BtnReemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReemplazarActionPerformed(evt);
            }
        });

        BtnReemplazarTodo.setText("Reemplazar todo");
        BtnReemplazarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReemplazarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(BtnReemplazarTodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(BtnReemplazar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TEXTO, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TEXTO, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(BtnSalir)
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnReemplazar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnReemplazarTodo)
                        .addGap(11, 11, 11))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
      TEXTO.setText("");
       this.dispose();
       reemplazar=false;
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnReemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReemplazarActionPerformed
     reemplazar=true; reemplazarTodo=false; this.dispose(); try {
         controlador.Sobreescritura();
        } catch (InterruptedException ex) {
            Logger.getLogger(Menu_Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    
    }//GEN-LAST:event_BtnReemplazarActionPerformed

    private void BtnReemplazarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReemplazarTodoActionPerformed
        reemplazarTodo=true; reemplazar=false; this.dispose(); try {
            controlador.Sobreescritura();
        } catch (InterruptedException ex) {
            Logger.getLogger(Menu_Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
    }//GEN-LAST:event_BtnReemplazarTodoActionPerformed
    public  String getremplazo(){
        return TEXTO.getText();
    }
    public boolean[] Remplazado(){
        boolean [] a = new boolean[2];
        a[0] = reemplazar;
        a[1] = reemplazarTodo;
         return a;
    }
    public boolean ReemplazarTodo(){
        
        return reemplazarTodo;
    }

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
            java.util.logging.Logger.getLogger(Menu_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu_Buscar dialog = new Menu_Buscar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReemplazar;
    private javax.swing.JButton BtnReemplazarTodo;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTextField TEXTO;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
