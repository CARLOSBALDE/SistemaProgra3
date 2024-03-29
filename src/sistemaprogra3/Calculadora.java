/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaprogra3;

import java.util.regex.Pattern;

/**
 *
 * @author aula2
 */
public class Calculadora extends javax.swing.JInternalFrame  {

    private static Calculadora controlador = null;
    String operador=""; 
    boolean ConvertirValor=true;
    
    public static Calculadora getCalculadora(){
        
        if(controlador==null){
            controlador = new Calculadora();
        }
        return controlador;
    }
    public Calculadora() {
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

        TxtInputNumeros = new javax.swing.JTextField();
        BtnCE = new javax.swing.JButton();
        BtnC = new javax.swing.JButton();
        BtnDividir = new javax.swing.JButton();
        BtnBorrar = new javax.swing.JButton();
        BtnMultiplicacion = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        BtnSumar = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        BtnResta = new javax.swing.JButton();
        BtnMasEntreMenos = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        BtnPunto = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();

        setClosable(true);
        setTitle("Calculadora");

        TxtInputNumeros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtInputNumeros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtInputNumerosKeyTyped(evt);
            }
        });

        BtnCE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnCE.setText("CE");
        BtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCEActionPerformed(evt);
            }
        });

        BtnC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnC.setText("C");
        BtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCActionPerformed(evt);
            }
        });

        BtnDividir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnDividir.setText("/");
        BtnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDividirActionPerformed(evt);
            }
        });

        BtnBorrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnBorrar.setText("<-");
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });

        BtnMultiplicacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnMultiplicacion.setText("*");
        BtnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplicacionActionPerformed(evt);
            }
        });

        Btn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn9.setText("9");
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        Btn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn8.setText("8");
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn7.setText("7");
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn3.setText("3");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        BtnSumar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnSumar.setText("+");
        BtnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumarActionPerformed(evt);
            }
        });

        Btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn2.setText("2");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn1.setText("1");
        Btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn1MouseClicked(evt);
            }
        });

        Btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn4.setText("4");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn5.setText("5");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn6.setText("6");
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        BtnResta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnResta.setText("-");
        BtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRestaActionPerformed(evt);
            }
        });

        BtnMasEntreMenos.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        BtnMasEntreMenos.setText("+/-");
        BtnMasEntreMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMasEntreMenosActionPerformed(evt);
            }
        });

        Btn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn0.setText("0");
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });

        BtnPunto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnPunto.setText(".");
        BtnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPuntoActionPerformed(evt);
            }
        });

        BtnIgual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnIgual.setText("=");
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtInputNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnMasEntreMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtInputNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMasEntreMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDividirActionPerformed
ConvertirValor=false;   
        
        if(TxtInputNumeros.getText().contains("/")){
            return;
        }
        operador="/";
   
        TxtInputNumeros.setText(TxtInputNumeros.getText() +"/");
       TxtInputNumeros.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDividirActionPerformed

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
       TxtInputNumeros.setText(TxtInputNumeros.getText() +"0");
       TxtInputNumeros.requestFocus();
    }//GEN-LAST:event_Btn0ActionPerformed

    private void TxtInputNumerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtInputNumerosKeyTyped
       
        
    }//GEN-LAST:event_TxtInputNumerosKeyTyped

    private void Btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn1MouseClicked
       
       TxtInputNumeros.setText(TxtInputNumeros.getText() +"1");
       TxtInputNumeros.requestFocus();
        
        
    }//GEN-LAST:event_Btn1MouseClicked

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
      TxtInputNumeros.setText(TxtInputNumeros.getText() +"2");
       TxtInputNumeros.requestFocus();
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
 TxtInputNumeros.setText(TxtInputNumeros.getText() +"3");
       TxtInputNumeros.requestFocus();     
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
         TxtInputNumeros.setText(TxtInputNumeros.getText() +"4");
       TxtInputNumeros.requestFocus();
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        TxtInputNumeros.setText(TxtInputNumeros.getText() +"5");
       TxtInputNumeros.requestFocus();
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
       TxtInputNumeros.setText(TxtInputNumeros.getText() +"6");
       TxtInputNumeros.requestFocus();
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
         TxtInputNumeros.setText(TxtInputNumeros.getText() +"7");
       TxtInputNumeros.requestFocus();
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
         TxtInputNumeros.setText(TxtInputNumeros.getText() +"8");
       TxtInputNumeros.requestFocus();
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        TxtInputNumeros.setText(TxtInputNumeros.getText() +"9");
       TxtInputNumeros.requestFocus();
    }//GEN-LAST:event_Btn9ActionPerformed

    private void BtnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPuntoActionPerformed
       
        
        if(TxtInputNumeros.getText().contains(".")){
            return;
        }
        
        TxtInputNumeros.setText(TxtInputNumeros.getText() +".");
       TxtInputNumeros.requestFocus();
    }//GEN-LAST:event_BtnPuntoActionPerformed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
      if(TxtInputNumeros.getText().length()==0){
          return;
      }
      
      TxtInputNumeros.setText(TxtInputNumeros.getText().substring(0,TxtInputNumeros.getText().length()-1));
      
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void BtnMasEntreMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMasEntreMenosActionPerformed
 String text = TxtInputNumeros.getText();
        
        if(ConvertirValor){
      if(text.contains("-")){
           TxtInputNumeros.setText(text.substring(1, text.length()));
       }else{
           TxtInputNumeros.setText("-"+text);
       }
}     
 
    }//GEN-LAST:event_BtnMasEntreMenosActionPerformed

    private void BtnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumarActionPerformed
ConvertirValor=false;     String text =TxtInputNumeros.getText();   
        
        if(text.contains("+") ){
            return;
        }
         operador="+";
       
        TxtInputNumeros.setText(TxtInputNumeros.getText() +"+");
       TxtInputNumeros.requestFocus();       
      
       
    }//GEN-LAST:event_BtnSumarActionPerformed

    private void BtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRestaActionPerformed
ConvertirValor=false;    
    
        if(TxtInputNumeros.getText().contains("-") ){
            return;
        }
         operador="-";
        TxtInputNumeros.setText(TxtInputNumeros.getText() +"-");
       TxtInputNumeros.requestFocus();
    }//GEN-LAST:event_BtnRestaActionPerformed

    private void BtnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiplicacionActionPerformed
ConvertirValor=false;    
        
        if(TxtInputNumeros.getText().contains("*")){
            return;
        }
         operador="*";
         
        TxtInputNumeros.setText(TxtInputNumeros.getText() +"*");
       TxtInputNumeros.requestFocus();
    }//GEN-LAST:event_BtnMultiplicacionActionPerformed

    private void BtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCActionPerformed
      TxtInputNumeros.setText("");
    }//GEN-LAST:event_BtnCActionPerformed

    private void BtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCEActionPerformed
    String text = TxtInputNumeros.getText(); int poscicion=text.length()+1;
        
    
            for (int i = 0; i < text.length(); i++) {
                if((int)text.charAt(i)>=42 &&(int)text.charAt(i)<=47 && (int)text.charAt(i)!=46){
                    poscicion = i; TxtInputNumeros.setText(text.substring(0, poscicion+1)); break;
                }
              else   if(poscicion==text.length()+1){
                        TxtInputNumeros.setText("");
                }
            }
     
          
         
      
        
     
    }//GEN-LAST:event_BtnCEActionPerformed

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
ConvertirValor=true;  String text = TxtInputNumeros.getText();

       String P  = Pattern.quote(String.valueOf(operador));
       String [] ar = text.split(String.valueOf(P));
        
          double n1 = Double.parseDouble( ar[0]);
          double n2 = Double.parseDouble( ar[1]);
          
          switch(operador){
              case "+": TxtInputNumeros.setText(String.valueOf(n1+n2)); break;
              case "-": TxtInputNumeros.setText(String.valueOf(n1-n2));break;
              case "/": TxtInputNumeros.setText(String.valueOf(n1/n2));break;
              case "*": TxtInputNumeros.setText(String.valueOf(n1*n2));break;
              
          }
          
    }//GEN-LAST:event_BtnIgualActionPerformed
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnC;
    private javax.swing.JButton BtnCE;
    private javax.swing.JButton BtnDividir;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnMasEntreMenos;
    private javax.swing.JButton BtnMultiplicacion;
    private javax.swing.JButton BtnPunto;
    private javax.swing.JButton BtnResta;
    private javax.swing.JButton BtnSumar;
    private javax.swing.JTextField TxtInputNumeros;
    // End of variables declaration//GEN-END:variables
}
