
package Notepad_Arbol;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;


public class Interfaz_Notepad_Arbol extends javax.swing.JInternalFrame {

    private static Interfaz_Notepad_Arbol controlador;
    private static JFileChooser DireccionArchivo = new JFileChooser();
    private static boolean GuardarComo = false, Abrir = false,ArchivoSeleccionado=false,NuevoArchivo=false;
    private static String Sintitulo = "Sin titulo";
    private static FileNameExtensionFilter filtro = new FileNameExtensionFilter(".TXT", "txt");
    private static int seleccion = -400;
    private static File f = new File("src\\Notepad_Arbol");
    private static File ruta = new File(""); 
    private static DefaultTreeModel modelo;
    private static DefaultMutableTreeNode root = new DefaultMutableTreeNode(f.getName());
    private static DefaultMutableTreeNode NombreArchivo= new DefaultMutableTreeNode();
    public static Interfaz_Notepad_Arbol getControlador(){
        
        if(controlador==null){
            controlador = new Interfaz_Notepad_Arbol();
        }
        return controlador;
    }
    
    
    public Interfaz_Notepad_Arbol() {
        initComponents();
        modelo =  new DefaultTreeModel(root);
        Arbol.setModel(modelo);
        ActualizarArbol();
        DireccionArchivo.setFileFilter(filtro);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TxtArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Arbol = new javax.swing.JTree();
        BtnGuardar = new javax.swing.JButton();
        BtnAbrir = new javax.swing.JButton();
        BtnNuevo = new javax.swing.JButton();
        BtnGuardarComo = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        TxtArea.setColumns(20);
        TxtArea.setRows(5);
        TxtArea.setLineWrap(true);
        jScrollPane1.setViewportView(TxtArea);

        Arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArbolMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Arbol);

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnAbrir.setText("Abrir");
        BtnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirActionPerformed(evt);
            }
        });

        BtnNuevo.setText("Nuevo");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        BtnGuardarComo.setText("GuardarComo");
        BtnGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarComoActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Precione abrir primero para utilizar el arbol, ya que se puede usar el programa con o sin el");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnGuardarComo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnAbrir)
                                .addGap(18, 18, 18)
                                .addComponent(BtnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1)
                        .addContainerGap(113, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAbrir)
                    .addComponent(BtnNuevo)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnGuardarComo))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void crear (DefaultMutableTreeNode nodo,File Carpeta){
        
        File [] archivos = Carpeta.listFiles();
        
        if(archivos!=null){
            int contador=0;
            for(File f: archivos){
                 DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(f.getName());
                 modelo.insertNodeInto(hijo, nodo, contador);
                 contador++;
                 if(f.isDirectory()){{
                     crear(hijo,f);
                 }
            }
           
            
        }
        }
        
    } 
    
    private void ActualizarArbol(){
         ruta = f.getParentFile();
        
        root = new DefaultMutableTreeNode(ruta.getName());
        modelo = new DefaultTreeModel(root);
        Arbol.setModel(modelo);
        crear(root,ruta);
        
    }
     
    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
       if (GuardarComo == false || Abrir == false) {
       
            GuardarComo();
            
        } else if(NuevoArchivo) {
            f.delete();
            try {
                Escritura();
            } catch (IOException ex) {
             
            }

        }else{
              f = DireccionArchivo.getSelectedFile();
            f.delete();
            try {
                Escritura();
            } catch (IOException ex) {
             
            }
        }
       
       
       
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
     
           String nombre="";
           nombre = JOptionPane.showInputDialog("Insertar nombre del nuevo txt");
           
           if(nombre!=null){
                 f = new File(ruta.getAbsolutePath()+"/"+nombre+".txt");
          try {
              f.createNewFile();
              Abrir=true;
              GuardarComo=true;
              TxtArea.setText("");
          } catch (IOException ex) {
              Logger.getLogger(Interfaz_Notepad_Arbol.class.getName()).log(Level.SEVERE, null, ex);
          }
          ActualizarArbol();
          
   
      
      DireccionArchivo = new JFileChooser(f);
   
   
       
      NuevoArchivo=true;
           }
  
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarComoActionPerformed
      GuardarComo();
    }//GEN-LAST:event_BtnGuardarComoActionPerformed

    private void BtnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbrirActionPerformed
      NuevoArchivo=false;    Lectura();
    }//GEN-LAST:event_BtnAbrirActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
       
        if(ArchivoSeleccionado){
             f = new File(ruta.getAbsolutePath()+"/"+NombreArchivo);
             f.delete();
             
             ActualizarArbol();
        }else{
            f.delete();
            
            TxtArea.setText("");
            DireccionArchivo = new JFileChooser();
            Abrir=false;
            GuardarComo=false;
            ActualizarArbol();
        }
        
       TxtArea.setText("");
       DireccionArchivo = new JFileChooser(f);
       GuardarComo = false;
       DireccionArchivo = new JFileChooser(f);
       Abrir = false;
       NuevoArchivo=false;
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void ArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArbolMouseClicked
         
       ArchivoSeleccionado = true;
         NombreArchivo = (DefaultMutableTreeNode)Arbol.getSelectionPath().getLastPathComponent();
    }//GEN-LAST:event_ArbolMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
     
    }//GEN-LAST:event_formMouseClicked
    public  void GuardarComo() {
        
        seleccion = DireccionArchivo.showSaveDialog(this);
        
        if (seleccion == JFileChooser.APPROVE_OPTION) {
             
            f = new File(DireccionArchivo.getSelectedFile().toString()+".txt");
            try {
                f.createNewFile();
                Escritura();
                GuardarComo = true;
                Abrir =true;
            } catch (IOException ex) {
               
            }
        }
           ActualizarArbol();
           NuevoArchivo=false;
    }
 private void Escritura() throws IOException, FileNotFoundException {

        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        
        String [] lines = TxtArea.getText().split("\n");
        
        for (int i = 0; i < lines.length; i++) {
            
            bw.write(lines[i]);
            bw.newLine();
        }
      bw.close();

    }
  private void Lectura() {

      if(ArchivoSeleccionado){
        f = new File(ruta.getAbsolutePath()+"/"+NombreArchivo);
      }else{
         seleccion = DireccionArchivo.showOpenDialog(this);
          f = DireccionArchivo.getSelectedFile();  
          System.out.println(f.getAbsolutePath());
      }
        

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            Abrir = true;
            GuardarComo=true;
            TxtArea.setText("");
            String text = "";
            
            
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                while ((text = br.readLine()) != null) {
                     TxtArea.append(text+"\n");
                     
                }
                br.close();
            } catch (FileNotFoundException ex) {
             
            } catch (IOException ex) {
           
            }
             ActualizarArbol();
        }
       

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree Arbol;
    private javax.swing.JButton BtnAbrir;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnGuardarComo;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JTextArea TxtArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
