
package Libros;

import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class Filtros   extends javax.swing.JDialog {
    
    private int columna=-1;
    InterfazLibro IL = InterfazLibro.getControlador();
    
    
    public Filtros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(IL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txtaño = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Txtautor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txteditorial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Txttitulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Txtaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtañoKeyTyped(evt);
            }
        });

        jLabel4.setText("Año");

        Txtautor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtautorKeyTyped(evt);
            }
        });

        jLabel3.setText("Autor");

        Txteditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxteditorialKeyTyped(evt);
            }
        });

        jLabel2.setText("Editorial");

        jLabel1.setText("Titulo");

        Txttitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxttituloActionPerformed(evt);
            }
        });
        Txttitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxttituloKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Buscar por:");

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBuscar)
                    .addComponent(jButton2))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        VaciarCampos();
        IL.ActualizarTablaDesdeOtraClase();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TxtañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtañoKeyTyped
         
       Txtautor.setText("");
       Txteditorial.setText("");
       Txttitulo.setText("");
       columna=3; 
        
       int caracter = (int) evt.getKeyChar();
        
        if(caracter<48 || caracter >57){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_TxtañoKeyTyped

    private void TxttituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxttituloKeyTyped
    
       Txtautor.setText("");
       Txteditorial.setText("");
       Txtaño.setText("");
       columna=0;
       
        int caracter = (int) evt.getKeyChar();
        
        if(caracter>=48 && caracter <=57){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_TxttituloKeyTyped

    private void TxteditorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxteditorialKeyTyped
      
       Txtautor.setText("");
       Txttitulo.setText("");
       Txtaño.setText("");
       columna=1;
       
        int caracter = (int) evt.getKeyChar();
        
        if(caracter>=48 && caracter <=57){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_TxteditorialKeyTyped

    private void TxtautorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtautorKeyTyped
      
       Txteditorial.setText("");
       Txttitulo.setText("");
       Txtaño.setText("");
       columna=2; 
        int caracter = (int) evt.getKeyChar();
        
        if(caracter>=48 && caracter <=57){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_TxtautorKeyTyped

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        
        IL.ActualizarTablaDesdeOtraClase();
        String comparativo="";
        
        switch(columna){
            case 0: comparativo=Txttitulo.getText();          FiltrarTabla(comparativo);      break;
            case 1: comparativo=Txteditorial.getText();       FiltrarTabla(comparativo);      break;
            case 2: comparativo=Txtautor.getText();           FiltrarTabla(comparativo);      break;
            case 3: comparativo=Txtaño.getText();             FiltrarTabla(comparativo);      break;
            default : JOptionPane.showMessageDialog(null, "Selecciona una opcion"); break;
    }
      
       
  
        
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void TxttituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxttituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxttituloActionPerformed

    private void FiltrarTabla(String t){
     
        int longitud = t.length();
        int contador = 0;
        String cadena="";
        while(contador<IL.modelo.getRowCount()){
            
            cadena = IL.modelo.getValueAt(contador, columna).toString().substring(0, longitud);
            
            if(t.equalsIgnoreCase(cadena)==false){
  
               IL.modelo.removeRow(contador); contador=-1;
            }
            
            contador++;
        }
        
    }
    
      private void VaciarCampos() {
        Txtautor.setText("");
        Txteditorial.setText("");
        Txtaño.setText("");
        Txttitulo.setText("");
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
            java.util.logging.Logger.getLogger(Filtros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Filtros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Filtros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Filtros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Filtros dialog = new Filtros(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JTextField Txtautor;
    private javax.swing.JTextField Txtaño;
    private javax.swing.JTextField Txteditorial;
    private javax.swing.JTextField Txttitulo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
