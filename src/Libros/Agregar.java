package Libros;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.io.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agregar extends javax.swing.JDialog {

    InterfazLibro IL = InterfazLibro.getControlador();
    
    public Agregar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       this.setLocationRelativeTo(IL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Txttitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Txteditorial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txtautor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Txtaño = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BtnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Titulo");

        Txttitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxttituloKeyTyped(evt);
            }
        });

        jLabel2.setText("Editorial");

        Txteditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxteditorialKeyTyped(evt);
            }
        });

        jLabel3.setText("Autor");

        Txtautor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtautorKeyTyped(evt);
            }
        });

        jLabel4.setText("Año");

        Txtaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtañoKeyTyped(evt);
            }
        });

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("AGREGAR LIBRO");

        BtnAtras.setText("Atras");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(Txteditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(Txtautor, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(Txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(BtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnAtras)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txteditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txtautor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnAtras))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        this.dispose();
        VaciarCampos();
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void VaciarCampos() {
        Txtautor.setText("");
        Txteditorial.setText("");
        Txtaño.setText("");
        Txttitulo.setText("");
    }
    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        if (ValidarVacios()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        } else {
            
          File f = new File("src\\Archivo\\Libros.txt");
            
            if(!f.exists()){
                try {
                    f.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                
            String datos = Txttitulo.getText()+";"+Txteditorial.getText()+";"+Txtautor.getText()+";"+Txtaño.getText()+";";
                try {
                    FileWriter FW = new FileWriter(f.getAbsoluteFile(),true);
                    BufferedWriter BW  = new BufferedWriter(FW);
                    BW.write(datos);
                    BW.newLine();
                    BW.close();
                    
                } catch (IOException ex) {
                    Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }

           InterfazLibro IL = InterfazLibro.getControlador();
           IL.ActualizarTablaDesdeOtraClase();
           VaciarCampos();
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void TxttituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxttituloKeyTyped
      
        int caracter = (int) evt.getKeyChar();
        
        if(caracter>=48 && caracter <=57){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
    }//GEN-LAST:event_TxttituloKeyTyped

    private void TxteditorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxteditorialKeyTyped
      int caracter = (int) evt.getKeyChar();
        
        if(caracter>=48 && caracter <=57){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_TxteditorialKeyTyped

    private void TxtautorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtautorKeyTyped
      int caracter = (int) evt.getKeyChar();
        
        if(caracter>=48 && caracter <=57){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_TxtautorKeyTyped

    private void TxtañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtañoKeyTyped
       
       int caracter = (int) evt.getKeyChar();
        
        if(caracter<48 || caracter >57){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
    }//GEN-LAST:event_TxtañoKeyTyped
    private boolean ValidarVacios() {
        if (Txtautor.getText().equals("") || Txtaño.getText().equals("") || Txteditorial.getText().equals("") || Txttitulo.getText().equals("")) {
            return true;
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar dialog = new Agregar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JTextField Txtautor;
    private javax.swing.JTextField Txtaño;
    private javax.swing.JTextField Txteditorial;
    private javax.swing.JTextField Txttitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
