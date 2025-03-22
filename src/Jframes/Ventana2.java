/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframes;

/**
 *
 * @author Luis, Zadkiel Avendano
 */
import EstructurasDeDatos.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Clases.*;
import java.io.IOException;

public class Ventana2 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana1
     */
    private Arbol arbol;
    private Nodo actual;
    public static Ventana1 v1;

    public Ventana2() {
        initComponents();

        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setResizable(false); // Impide cambiar la dimension de la ventana
        setTitle("Clave Dicotómica");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Crear el árbol y la interfaz
        try {
            Arbol arbol = CargadorJSON.cargarArbol("arboles_templados.json");
            arbol.mostrarArbol();

            this.arbol = arbol;
            if (arbol.getRaiz() == null) {
                throw new IllegalStateException("El árbol no tiene una raíz válida.");
            }
            this.actual = arbol.getRaiz();
            PreguntasTexto.setText("¿" + actual.pregunta + "?");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo JSON: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        PanelInicio.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInicio = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BotonBuscarArbol = new javax.swing.JButton();
        BotonBuscarHash = new javax.swing.JButton();
        BuscarNombrePlanta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tiempo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InformacionEspecie = new javax.swing.JTextArea();
        PanelBusqueda = new javax.swing.JPanel();
        BotonSi = new javax.swing.JButton();
        BotonNo = new javax.swing.JButton();
        PreguntasTexto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuOpciones = new javax.swing.JMenu();
        MenuInicio = new javax.swing.JMenuItem();
        MenuCargarArchivo = new javax.swing.JMenuItem();
        MenuMostrarArbol = new javax.swing.JMenuItem();
        MenuReiniciar = new javax.swing.JMenuItem();
        MenuBuscar = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        MenuIntegrantes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelInicio.setBackground(new java.awt.Color(246, 229, 229));
        PanelInicio.setForeground(new java.awt.Color(0, 0, 0));
        PanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 0));
        jLabel4.setText("Información de la especie:");
        PanelInicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        BotonBuscarArbol.setBackground(new java.awt.Color(102, 51, 0));
        BotonBuscarArbol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonBuscarArbol.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscarArbol.setText("Árbol");
        BotonBuscarArbol.setFocusPainted(false);
        BotonBuscarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarArbolActionPerformed(evt);
            }
        });
        PanelInicio.add(BotonBuscarArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 90, -1));

        BotonBuscarHash.setBackground(new java.awt.Color(102, 51, 0));
        BotonBuscarHash.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonBuscarHash.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscarHash.setText("Hash");
        BotonBuscarHash.setFocusPainted(false);
        BotonBuscarHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarHashActionPerformed(evt);
            }
        });
        PanelInicio.add(BotonBuscarHash, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 90, -1));

        BuscarNombrePlanta.setBackground(new java.awt.Color(173, 205, 173));
        BuscarNombrePlanta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BuscarNombrePlanta.setForeground(new java.awt.Color(0, 0, 0));
        PanelInicio.add(BuscarNombrePlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 0));
        jLabel6.setText("Buscar por nombre de la especie:");
        PanelInicio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("Tiempo para encontrar la información: ");
        PanelInicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        Tiempo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tiempo.setForeground(new java.awt.Color(51, 102, 0));
        Tiempo.setText("15");
        PanelInicio.add(Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 260, -1));

        InformacionEspecie.setBackground(new java.awt.Color(173, 205, 173));
        InformacionEspecie.setColumns(20);
        InformacionEspecie.setForeground(new java.awt.Color(0, 0, 0));
        InformacionEspecie.setRows(5);
        InformacionEspecie.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InformacionEspecie.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        InformacionEspecie.setEnabled(false);
        jScrollPane1.setViewportView(InformacionEspecie);

        PanelInicio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 340, 140));

        getContentPane().add(PanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 320));

        PanelBusqueda.setBackground(new java.awt.Color(246, 229, 229));
        PanelBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSi.setBackground(new java.awt.Color(102, 51, 0));
        BotonSi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonSi.setForeground(new java.awt.Color(255, 255, 255));
        BotonSi.setText("SI");
        BotonSi.setFocusPainted(false);
        BotonSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiActionPerformed(evt);
            }
        });
        PanelBusqueda.add(BotonSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 80, 40));

        BotonNo.setBackground(new java.awt.Color(102, 51, 0));
        BotonNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonNo.setForeground(new java.awt.Color(255, 255, 255));
        BotonNo.setText("NO");
        BotonNo.setFocusPainted(false);
        BotonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNoActionPerformed(evt);
            }
        });
        PanelBusqueda.add(BotonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 80, 40));

        PreguntasTexto.setBackground(new java.awt.Color(173, 205, 173));
        PreguntasTexto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PreguntasTexto.setForeground(new java.awt.Color(0, 0, 0));
        PreguntasTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PreguntasTexto.setFocusable(false);
        PanelBusqueda.add(PreguntasTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 480, 120));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 0));
        jLabel8.setText("Clave Dicotómica");
        jLabel8.setToolTipText("");
        PanelBusqueda.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        getContentPane().add(PanelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 320));

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 102));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        MenuOpciones.setBackground(new java.awt.Color(0, 102, 102));
        MenuOpciones.setForeground(new java.awt.Color(255, 255, 255));
        MenuOpciones.setText("Opciones");
        MenuOpciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        MenuInicio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuInicio.setText("Inicio");
        MenuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuInicioActionPerformed(evt);
            }
        });
        MenuOpciones.add(MenuInicio);

        MenuCargarArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuCargarArchivo.setText("Cargar Archivo");
        MenuCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCargarArchivoActionPerformed(evt);
            }
        });
        MenuOpciones.add(MenuCargarArchivo);

        MenuMostrarArbol.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuMostrarArbol.setText("Mostrar Arbol");
        MenuMostrarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMostrarArbolActionPerformed(evt);
            }
        });
        MenuOpciones.add(MenuMostrarArbol);

        MenuReiniciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuReiniciar.setText("Reiniciar");
        MenuReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReiniciarActionPerformed(evt);
            }
        });
        MenuOpciones.add(MenuReiniciar);

        MenuBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuBuscar.setText("Buscar");
        MenuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBuscarActionPerformed(evt);
            }
        });
        MenuOpciones.add(MenuBuscar);

        jMenuBar1.add(MenuOpciones);

        MenuAyuda.setBackground(new java.awt.Color(0, 102, 102));
        MenuAyuda.setForeground(new java.awt.Color(255, 255, 255));
        MenuAyuda.setText("Ayuda");
        MenuAyuda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        MenuIntegrantes.setText("Integrantes");
        MenuIntegrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIntegrantesActionPerformed(evt);
            }
        });
        MenuAyuda.add(MenuIntegrantes);

        jMenuBar1.add(MenuAyuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguientePregunta(boolean respuesta) {
        // Verificar si actual es null
        if (actual == null) {
            JOptionPane.showMessageDialog(null, "Error: No se ha cargado correctamente el árbol.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar si ya se ha encontrado la especie
        if (actual.especie != null) {
            JOptionPane.showMessageDialog(null, "Ya se ha encontrado la especie: "
                    + actual.especie + "\nNo se pueden realizar más preguntas.", "Error", JOptionPane.ERROR_MESSAGE);

            return; // Salir del método sin hacer nada más
        }

        // Mover al siguiente nodo según la respuesta
        if (respuesta) {
            actual = actual.si;
        } else {
            actual = actual.no;
        }

        // Verificar si el nuevo nodo es null
        if (actual == null) {

            JOptionPane.showMessageDialog(null, "Error: No hay más preguntas disponibles.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar si el nuevo nodo es una hoja (especie)
        if (actual.especie != null) {
            PreguntasTexto.setText("La especie es: " + actual.especie);
           JOptionPane.showMessageDialog(null, "Ya se encontro la especie: " + actual.especie, "Especie encontrada con exito!", JOptionPane.INFORMATION_MESSAGE);
           
           // Deshabilita los botones de preguntas
           this.BotonSi.setEnabled(false);
           this.BotonNo.setEnabled(false);

        } else {
            // Actualizar la pregunta en la interfaz
            PreguntasTexto.setText("¿" + actual.pregunta + "?");
        }
    }

    private void cargarNuevaClave() {
        try {
            JFileChooser fileChooser = new JFileChooser();
            int resultado = fileChooser.showOpenDialog(this);

            if (resultado == JFileChooser.APPROVE_OPTION) {
                File archivo = fileChooser.getSelectedFile();
                try {
                    arbol = CargadorJSON.cargarArbol(archivo.getAbsolutePath());
                    actual = arbol.getRaiz();
                    PreguntasTexto.setText("¿" + actual.pregunta + "?");
                    JOptionPane.showMessageDialog(null, "Nueva clave dicotómica cargada correctamente.");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error al cargar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    private void reiniciarBusqueda() {
        // Verifica si es necesario reiniciar la busqueda
        if (actual == arbol.getRaiz()) {
            JOptionPane.showMessageDialog(null, "Ya te encuentras en la primera pregunta de la busqueda.", "Atencion", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Volver a la raíz del árbol
        actual = arbol.getRaiz();
        PreguntasTexto.setText("¿" + actual.pregunta + "?");
        JOptionPane.showMessageDialog(null, "Búsqueda reiniciada. Comienza desde la primera pregunta.");
        
        // Habilita los botones de las preguntas
        this.BotonSi.setEnabled(true);
        this.BotonNo.setEnabled(true);
    }
    private void BotonBuscarHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarHashActionPerformed


    }//GEN-LAST:event_BotonBuscarHashActionPerformed

    private void BotonBuscarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarArbolActionPerformed

        // Busca la especie midiendo el tiempo con System.nanoTime()
        long inicio = System.nanoTime();
        String pasos = arbol.buscarEspecie(BuscarNombrePlanta.getText());
        long fin = System.nanoTime();
        
        long tiempo = (fin - inicio) / 1000;

        // Establece los datos encontrados en la interfaz
        Tiempo.setText(Long.toString(tiempo) + " microsegundos.");
        InformacionEspecie.setText(pasos);
        
        // Verifica si encontro la especie para mostrar un mensaje de error
        if ("Especie no encontrada".equals(pasos)) {
            JOptionPane.showMessageDialog(null, "Error: Esa planta no se encuentra.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonBuscarArbolActionPerformed

    private void BotonSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiActionPerformed
        siguientePregunta(true);
    }//GEN-LAST:event_BotonSiActionPerformed

    private void BotonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNoActionPerformed
        siguientePregunta(false);
    }//GEN-LAST:event_BotonNoActionPerformed

    private void MenuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBuscarActionPerformed
        PanelInicio.setVisible(true);
        PanelBusqueda.setVisible(false);
    }//GEN-LAST:event_MenuBuscarActionPerformed

    private void MenuCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCargarArchivoActionPerformed
        cargarNuevaClave();
        arbol.mostrarArbol();
    }//GEN-LAST:event_MenuCargarArchivoActionPerformed

    private void MenuMostrarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMostrarArbolActionPerformed
        VisualizadorArbol visualizador = new VisualizadorArbol();
        visualizador.mostrarArbol(arbol.getRaiz());
    }//GEN-LAST:event_MenuMostrarArbolActionPerformed

    private void MenuReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReiniciarActionPerformed
        reiniciarBusqueda();
    }//GEN-LAST:event_MenuReiniciarActionPerformed

    private void MenuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInicioActionPerformed
        PanelInicio.setVisible(false);
        PanelBusqueda.setVisible(true);
    }//GEN-LAST:event_MenuInicioActionPerformed

    private void MenuIntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuIntegrantesActionPerformed
       // Muestra los integrantes del grupo
       JOptionPane.showMessageDialog(null, "Integrantes del grupo:\nLuis Guerra y Zadkiel Avendano", "Integrantes", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_MenuIntegrantesActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscarArbol;
    private javax.swing.JButton BotonBuscarHash;
    private javax.swing.JButton BotonNo;
    private javax.swing.JButton BotonSi;
    private javax.swing.JTextField BuscarNombrePlanta;
    private javax.swing.JTextArea InformacionEspecie;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenuItem MenuBuscar;
    private javax.swing.JMenuItem MenuCargarArchivo;
    private javax.swing.JMenuItem MenuInicio;
    private javax.swing.JMenuItem MenuIntegrantes;
    private javax.swing.JMenuItem MenuMostrarArbol;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JMenuItem MenuReiniciar;
    private javax.swing.JPanel PanelBusqueda;
    private javax.swing.JPanel PanelInicio;
    private javax.swing.JTextField PreguntasTexto;
    private javax.swing.JLabel Tiempo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
