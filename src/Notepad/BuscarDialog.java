
package Notepad;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.util.regex.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

public class BuscarDialog extends javax.swing.JDialog {
   
  private static BuscarDialog controladorbuscador;
  private static   boolean Encontro=false,palabracompleta=false,MayusMinus=false;    
  Integer poscicion=-2,poscicion2=-1;
     InterfazNotepad controlador = InterfazNotepad.getControlador();
     int  [] arrayMatcher = new   int[2];
     Pattern p;
     Matcher m;
     JTextArea Areamanipulable = new JTextArea();
     ArrayList<Integer> listpositions = new ArrayList<>();
     Highlighter  h;
     String copia="";
    public BuscarDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       area2.setText(controlador.getTxtAREA());
       area2.setLineWrap(true);
    }
     
    public static BuscarDialog getcontroladorbuscador(){
         if(controladorbuscador==null){
             controladorbuscador = new BuscarDialog(new JFrame(),true);
         }
        return controladorbuscador;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PalabraBuscar = new javax.swing.JTextField();
        TextoReemplazar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BtnReemplazar = new javax.swing.JButton();
        BtnbuscarSiguiente = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnReemplazarTodo = new javax.swing.JButton();
        c = new java.awt.Checkbox();
        CBonlyCompletedWord = new java.awt.Checkbox();
        Encontrados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscador ");

        jLabel1.setText("Buscar:");

        PalabraBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PalabraBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PalabraBuscarKeyTyped(evt);
            }
        });

        jLabel3.setText("<html><center>BtnReemplazar por");

        BtnReemplazar.setText("Reemplazar");
        BtnReemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReemplazarActionPerformed(evt);
            }
        });

        BtnbuscarSiguiente.setText("Buscar Siguiente");
        BtnbuscarSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnbuscarSiguienteActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnReemplazarTodo.setText("Reemplazar todo");
        BtnReemplazarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReemplazarTodoActionPerformed(evt);
            }
        });

        c.setLabel("Coincidir mayusculas y minusculas");
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
        });

        CBonlyCompletedWord.setLabel("Solo palabras completas");
        CBonlyCompletedWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBonlyCompletedWordMouseClicked(evt);
            }
        });

        jLabel2.setText("Encontrados");

        area2.setColumns(20);
        area2.setRows(5);
        jScrollPane1.setViewportView(area2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoReemplazar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnReemplazarTodo)
                            .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(PalabraBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Encontrados, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel3)
                            .addComponent(CBonlyCompletedWord, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnReemplazar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnbuscarSiguiente))
                        .addGap(61, 61, 61))))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Encontrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PalabraBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnbuscarSiguiente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnReemplazar)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoReemplazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnReemplazarTodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnCancelar)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBonlyCompletedWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        Encontrados.setEditable(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
     this.dispose();
     controlador.Eliminar();
    }//GEN-LAST:event_BtnCancelarActionPerformed
    
    public static boolean getpalabracompleta(){
        return palabracompleta;
    }
    
    public static boolean gettextoexacto(){
        return MayusMinus;
    }
    
    private void BtnbuscarSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnbuscarSiguienteActionPerformed
            DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.GREEN);     
            DefaultHighlighter.DefaultHighlightPainter highlightPainter2 = new DefaultHighlighter.DefaultHighlightPainter(Color.RED);     
                   h  = area2.getHighlighter();
                   h.removeAllHighlights();
  
    VerificarExpresiones();
     boolean i =false;
     if(PalabraBuscar.getText().length()>=1){
           
          
           while(m.find()){
               
                listpositions.add(m.start());
                listpositions.add(m.end());
                Encontro=true;
     
           }
           
           if(Encontro){
         poscicion+=2; 
         poscicion2++;
                try {
                  h.addHighlight(listpositions.get(poscicion), listpositions.get(poscicion+1), highlightPainter2); 
                  poscicion2 =  poscicion+2;
                    for (int j = 0; j < listpositions.size()/2; j++) {
                       
                              h.addHighlight(listpositions.get(poscicion2), listpositions.get(poscicion2+1), highlightPainter);
                          poscicion2+=2;
                     if(poscicion2==listpositions.size()){
                         break;
                     }
                    }
                } catch (BadLocationException ex) {
                    Logger.getLogger(BuscarDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
         
     }
      
             
     }else{
         JOptionPane.showMessageDialog(null, "Inserte texto a buscar");
     }
     
     
     int cuantos = (listpositions.size()/2);
      Encontrados.setText(" - "+cuantos);
      
    }//GEN-LAST:event_BtnbuscarSiguienteActionPerformed
    
   
    public JTextArea getTextArea(){
        return Areamanipulable; 
    }
     
     public ArrayList<Integer> getPosiciones(){
        return listpositions; 
     }
     
  
     
    public void VerificarExpresiones(){
        
        if(palabracompleta && MayusMinus){
               p = Pattern.compile("(?i)"+" "+"["+PalabraBuscar.getText()+"]"+" ");
               m = p.matcher(area2.getText());
        }else if(MayusMinus){
               p = Pattern.compile("(?i)"+PalabraBuscar.getText());
               m = p.matcher(area2.getText());
              
        }else if (palabracompleta){
               p = Pattern.compile("(?i)"+" "+PalabraBuscar.getText()+" ");
               m = p.matcher(area2.getText());
        }else{
               p = Pattern.compile("(?i)"+PalabraBuscar.getText());
               m = p.matcher(area2.getText());
        }
        
    }
    private void CBonlyCompletedWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBonlyCompletedWordMouseClicked
        palabracompleta = !palabracompleta;
        MayusMinus=false;
     poscicion=-2; 
     poscicion2=-1;
     h.removeAllHighlights();
     listpositions.removeAll(listpositions);
    }//GEN-LAST:event_CBonlyCompletedWordMouseClicked

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
    MayusMinus = !MayusMinus;
    palabracompleta=false;
    poscicion=-2;
    poscicion2=-1;
    h.removeAllHighlights();
    listpositions.removeAll(listpositions);
    }//GEN-LAST:event_cMouseClicked

    private void BtnReemplazarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReemplazarTodoActionPerformed
//        poscicion=0;
//      if(TextoReemplazar.getText().length()>=1){
//          for (int i = 0; i < listpositions.size()/2; i++) {
//              area2.replaceRange(TextoReemplazar.getText(), listpositions.get(poscicion), listpositions.get(poscicion+1)); 
//              poscicion++;
//          }
//         
//      }  
      poscicion2=-2;   
     if(listpositions.size()!=0){
         for (int i = 0; i < listpositions.size()/2; i++) {
              area2.replaceRange(TextoReemplazar.getText(), listpositions.get(poscicion2), listpositions.get(poscicion2+1));
              poscicion+=2;
               if(poscicion2==listpositions.size()){
                         break;
                     }
         }
       
     }
     listpositions.removeAll(listpositions);
     poscicion=-2;
     Encontro=false;
     poscicion2=-1;   
    
        
    }//GEN-LAST:event_BtnReemplazarTodoActionPerformed

    private void PalabraBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PalabraBuscarKeyTyped
      
     poscicion=-2;
     Encontro=false;
     poscicion2=-1;   
        
    }//GEN-LAST:event_PalabraBuscarKeyTyped

    private void PalabraBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PalabraBuscarKeyReleased

    }//GEN-LAST:event_PalabraBuscarKeyReleased

    private void BtnReemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReemplazarActionPerformed
       
    area2.replaceRange(TextoReemplazar.getText(), listpositions.get(poscicion), listpositions.get(poscicion+1));  
    int remover = poscicion*2;
    remover--;
    listpositions.remove(remover);
    remover++;
    listpositions.remove(remover); 
       
         System.out.println(listpositions.size());
    h.removeAllHighlights();
     
     poscicion=-2;
     Encontro=false;
     poscicion2=-1; 
    }//GEN-LAST:event_BtnReemplazarActionPerformed


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
            java.util.logging.Logger.getLogger(BuscarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarDialog dialog = new BuscarDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnReemplazar;
    private javax.swing.JButton BtnReemplazarTodo;
    private javax.swing.JButton BtnbuscarSiguiente;
    private java.awt.Checkbox CBonlyCompletedWord;
    private javax.swing.JTextField Encontrados;
    private javax.swing.JTextField PalabraBuscar;
    private javax.swing.JTextField TextoReemplazar;
    private javax.swing.JTextArea area2;
    private java.awt.Checkbox c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
