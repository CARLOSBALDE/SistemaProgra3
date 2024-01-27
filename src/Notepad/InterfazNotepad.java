package Notepad;

import com.sun.webkit.Timer;
import java.awt.Color;
import static java.awt.PageAttributes.ColorType.COLOR;
import javax.swing.JFileChooser;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.scene.control.TextArea;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

import java.util.TimerTask;

public class InterfazNotepad extends javax.swing.JInternalFrame {

    private static InterfazNotepad controlador;
    private static JFileChooser DireccionArchivo = new JFileChooser();
    private static boolean GuardarComo = false, Abrir = false, isCut = false, isCopy = false, encontropalabra = false, MayusculasYMinusculas = false;
    private static String Sintitulo = "Sin titulo";
    private static FileNameExtensionFilter filtro = new FileNameExtensionFilter(".TXT", "txt");
    private static int seleccion = -400;
    private static File f = new File("");
    private static String copiar = "";
    private Matcher m = p.matcher("");
    private static Pattern p = Pattern.compile("(?i)" + "");
    private static BuscarDialog BD = BuscarDialog.getcontroladorbuscador();
    private static ArrayList<Integer> listpositions = new ArrayList<>();
    private static Highlighter h;
    private static Integer poscicion = -2, poscicion2 = -1;
    private static boolean Encontro = false, palabracompleta = false, MayusMinus = false;
    private static Menu_Buscar mb;
    private static int cont = 0;

    public static InterfazNotepad getControlador() {
        if (controlador == null) {
            controlador = new InterfazNotepad();
        }
        return controlador;
    }

    public InterfazNotepad() {
        initComponents();
        this.setTitle(" frmNotePad - Bloc de Notas - " + Sintitulo);
        System.out.println(this.getTitle().length());
        TxtArea.setLineWrap(true);
        TxtArea.select(2, 3);
        TxtArea.setText("Fragmento de un Escrito con unidad temática, que queda diferenciado del resto de fragmentos por un punto y aparte y generalmente también por llevar letra mayúscula inicial y un espacio en blanco en el margen izquierdo de alineación del texto principal de la primera línea.");

    }

    public static String getArea() {
        return TxtArea.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TxtArea = new javax.swing.JTextArea();
        Buscador = new javax.swing.JTextField();
        BtnReemplazar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        checkbox2 = new java.awt.Checkbox();
        checkbox3 = new java.awt.Checkbox();
        BtnSiguiente = new javax.swing.JButton();
        CuantosEncontrados = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        TxtArea.setColumns(20);
        TxtArea.setRows(5);
        jScrollPane1.setViewportView(TxtArea);

        Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorActionPerformed(evt);
            }
        });
        Buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscadorKeyTyped(evt);
            }
        });

        BtnReemplazar.setText("Reemplazar");
        BtnReemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReemplazarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        checkbox2.setLabel("Mayusculas y minusculas");
        checkbox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkbox2MouseClicked(evt);
            }
        });

        checkbox3.setLabel("Palabra completa");
        checkbox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkbox3MouseClicked(evt);
            }
        });

        BtnSiguiente.setText("Siguiente");
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        CuantosEncontrados.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Guardar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Guardar como...");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Cerrar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem6.setText("Cortar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Copiar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Pegar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jMenu2.add(Eliminar);

        jMenuItem10.setText("Seleccionar todo");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("Buscar");
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Buscar y reemplazar");
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BtnSiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnReemplazar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(checkbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CuantosEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnReemplazar)
                                .addComponent(BtnBuscar)
                                .addComponent(BtnSiguiente))
                            .addComponent(checkbox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(checkbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CuantosEncontrados, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );

        jScrollPane1.setEnabled(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.dispose();
        TxtArea.setText("");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Lectura();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void Escritura() throws IOException, FileNotFoundException {

        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        String[] lines = TxtArea.getText().split("\n");

        for (int i = 0; i < lines.length; i++) {

            bw.write(lines[i]);
            bw.newLine();
        }
        bw.close();

    }

    private void Lectura() {

        seleccion = DireccionArchivo.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            Abrir = true;
            GuardarComo = true;
            TxtArea.setText("");
            String text = "";
            f = DireccionArchivo.getSelectedFile();
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);

                while ((text = br.readLine()) != null) {
                    TxtArea.append(text + "\n");

                }
                br.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(InterfazNotepad.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InterfazNotepad.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        this.setTitle(this.getTitle().substring(0, 30) + f.getName());

    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TxtArea.setText("");
        this.setTitle(this.getTitle().substring(0, 30) + Sintitulo);
        GuardarComo = false;
        DireccionArchivo = new JFileChooser(f);
        Abrir = false;
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        GuardarComo();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public void GuardarComo() {

        seleccion = DireccionArchivo.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            f = DireccionArchivo.getSelectedFile();
            try {
                f.createNewFile();
                Escritura();
                this.setTitle(this.getTitle().substring(0, 30) + f.getName());
                GuardarComo = true;
                Abrir = true;
            } catch (IOException ex) {
                Logger.getLogger(InterfazNotepad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        if (GuardarComo == false || Abrir == false) {

            GuardarComo();

        } else {
            f = DireccionArchivo.getSelectedFile();
            f.delete();
            try {
                Escritura();
            } catch (IOException ex) {
                Logger.getLogger(InterfazNotepad.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        if (TxtArea.getSelectedText() != null) {
            copiar = TxtArea.getSelectedText();
            TxtArea.replaceSelection("");
            isCut = true;
            isCopy = false;
        }

// intento fallido pero que quiero guardar para intentarlo mas manual despues        
//        copiar = TxtArea.getSelectedText().replace(copiar, "");
//        
//        String [] filas = TxtArea.getText().split("\n");
//    
//        
//      
//        for (int i = 0; i < TxtArea.getRows(); i++) {
//            int longitud = filas[i].length();
//            
//            for (int j = 0; j < longitud; j++) {
//               if(j<indexInicio && j>indexFinal-1 ){
//                   TxtArea.append(String.valueOf(filas[i].charAt(j)));
//               } 
//              
//                TxtArea.append("\n");
//            }

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        TxtArea.replaceSelection("");
    }//GEN-LAST:event_EliminarActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if (TxtArea.getSelectedText() != null) {
            isCopy = true;
            copiar = TxtArea.getSelectedText();
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        TxtArea.requestFocus();
        TxtArea.selectAll();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

        if (isCut) {
            TxtArea.replaceSelection("");
            TxtArea.replaceSelection(copiar);
            copiar = "";

            isCut = false;
            isCopy = false;
        } else if (isCopy) {

            TxtArea.replaceSelection(copiar);

        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void BuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscadorKeyTyped
        int caracter = evt.getKeyChar();

        if (caracter > 48 && caracter < 57) {
            evt.consume();
        }

        poscicion = -2;
        Encontro = false;
        poscicion2 = -1;
    }//GEN-LAST:event_BuscadorKeyTyped

    private void BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorActionPerformed

    }//GEN-LAST:event_BuscadorActionPerformed

    private void BtnReemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReemplazarActionPerformed
//      buscarpalabra();

        if (Encontro) {
            mb = new Menu_Buscar(new JFrame(), true);

            mb.setVisible(true);

        }


    }//GEN-LAST:event_BtnReemplazarActionPerformed
    public void Sobreescritura() throws InterruptedException {

        boolean[] a = mb.Remplazado();
        String texto = mb.getremplazo();

        if (a[0]) {

            if (poscicion == listpositions.size()) {
                poscicion = poscicion - 2;

            }

            TxtArea.select(listpositions.get(poscicion), listpositions.get(poscicion + 1));
            TxtArea.replaceSelection(texto);

            if (listpositions.size() == 2) {
                listpositions = null;
                m.reset();
                poscicion = -2;
                poscicion2 = -1;
                listpositions = new ArrayList<>();

            } else {
                listpositions.remove(poscicion);
                listpositions.remove(poscicion + 1);
            }
            CuantosEncontrados.setForeground(Color.RED);
            CuantosEncontrados.setText("1");
            java.util.Timer t = new java.util.Timer();
            TimerTask timertask = new TimerTask() {
                @Override
                public void run() {
                    t.cancel();
                    BtnBuscar.doClick();

                }
            };

            t.schedule(timertask, 1000, 1);

        } else if (a[1]) {

            String anterior = String.valueOf(listpositions.size() / 2);
            TxtArea.setText(m.replaceAll(texto));
            listpositions = null;
            m.reset();
            poscicion = -2;
            poscicion2 = -1;
            listpositions = new ArrayList<>();

            CuantosEncontrados.setForeground(Color.RED);
            CuantosEncontrados.setText(anterior);
            java.util.Timer t = new java.util.Timer();
            TimerTask timertask = new TimerTask() {
                @Override
                public void run() {
                    t.cancel();
                    BtnBuscar.doClick();

                }
            };

            t.schedule(timertask, 1000, 1);

        }

    }

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        Encontro = false;
        listpositions = null;
        m.reset();
        poscicion = -2;
        poscicion2 = -1;
        listpositions = new ArrayList<>();

        h = TxtArea.getHighlighter();
        h.removeAllHighlights();

        VerificarExpresiones();
        if (Buscador.getText().length() >= 1) {

            while (m.find()) {
                if (palabracompleta) {
                    listpositions.add((m.start()+1));
                    listpositions.add((m.end()-1));
                    Encontro = true;
                } else {
                    listpositions.add(m.start());
                    listpositions.add(m.end());
                    Encontro = true;
                }

            }

            BtnSiguiente.doClick();

        } else {
            JOptionPane.showMessageDialog(null, "Inserte texto a buscar");
        }

    }//GEN-LAST:event_BtnBuscarActionPerformed

    public void VerificarExpresiones() {

        if (palabracompleta && MayusMinus) {
            p = Pattern.compile("([^A-Za-z0-9])" + "([/s]||[.,:-;])" + Buscador.getText() + "([^A-Za-z0-9])" + "([/s]||[.,:-;])");
            m = p.matcher(TxtArea.getText());
        } else if (MayusMinus) {
            p = Pattern.compile(Buscador.getText());
            m = p.matcher(TxtArea.getText());

        } else if (palabracompleta) {
            p = Pattern.compile("(?i)" + "([^A-Za-z0-9])" + "(/s||[.,:-;])" + Buscador.getText() + "([^A-Za-z0-9])" + "(/s||[.,:-;])");
            m = p.matcher(TxtArea.getText());
        } else {
            p = Pattern.compile("(?i)" + Buscador.getText());
            m = p.matcher(TxtArea.getText());
        }

    }

    private void checkbox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkbox2MouseClicked

        MayusMinus = !MayusMinus;
        listpositions = null;
        listpositions = new ArrayList<>();
        poscicion = -2;
        Encontro = false;
        poscicion2 = -1;
        m.reset();
    }//GEN-LAST:event_checkbox2MouseClicked

    private void checkbox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkbox3MouseClicked
        palabracompleta = !palabracompleta;
        listpositions = null;
        listpositions = new ArrayList<>();

        poscicion = -2;
        Encontro = false;
        poscicion2 = -1;
        m.reset();
    }//GEN-LAST:event_checkbox3MouseClicked

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed

        DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.GREEN);
        DefaultHighlighter.DefaultHighlightPainter highlightPainter2 = new DefaultHighlighter.DefaultHighlightPainter(Color.RED);
        h = TxtArea.getHighlighter();
        h.removeAllHighlights();

        poscicion2 = -2;
        if (poscicion == (listpositions.size() - 2)) {
            poscicion = -2;
        }
        if (Encontro) {
            poscicion += 2;
            poscicion2 += 2;
            try {

                h.addHighlight(listpositions.get(poscicion), listpositions.get(poscicion + 1), highlightPainter2);
                CuantosEncontrados.setText(poscicion / 2 + String.valueOf(listpositions.size() / 2));
                for (int i = 0; i <= (listpositions.size() / 2) - 1; i++) {
                    h.addHighlight(listpositions.get(poscicion2), listpositions.get(poscicion2 + 1), highlightPainter);
                    poscicion2 += 2;
                }

            } catch (BadLocationException ex) {
                Logger.getLogger(BuscarDialog.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        CuantosEncontrados.setForeground(Color.BLACK);
        CuantosEncontrados.setText(((poscicion / 2) + 1) + "-" + String.valueOf(listpositions.size() / 2));


    }//GEN-LAST:event_BtnSiguienteActionPerformed

    public String getTxtAREA() {
        return TxtArea.getText();
    }

    public void Eliminar() {
        this.remove(BD);
    }

    public void setAREAdelDialog() {
        TxtArea = BD.getTextArea();
    }

    public void buscarpalabra() {

        if (Buscador.getText().length() >= 1) {
            DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.GREEN);
            Highlighter h = TxtArea.getHighlighter();
            h.removeAllHighlights();
            String text = TxtArea.getText();
            String caracteres = Buscador.getText();

            if (MayusculasYMinusculas) {

            } else if (true) {

            }
            p = Pattern.compile("(?i)" + caracteres);
            m = p.matcher(text);
            while (m.find()) {
                try {
                    h.addHighlight(m.start(), m.end(), highlightPainter);
//                    indexInicio=m.start(); indexFinal = m.end(); encontropalabra=true;
                } catch (BadLocationException ex) {
                    Logger.getLogger(Color.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {
            JOptionPane.showMessageDialog(TxtArea, "la palabra a buscar no puede ser vacia");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnReemplazar;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JTextField Buscador;
    private javax.swing.JTextField CuantosEncontrados;
    private javax.swing.JMenuItem Eliminar;
    private static javax.swing.JTextArea TxtArea;
    private java.awt.Checkbox checkbox2;
    private java.awt.Checkbox checkbox3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
