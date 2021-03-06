/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import almacen.Almacen;
import bridge.prototype.Escenario;
import composite.proxy.Piloto;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import registro.RegistroPruebasSimulacion;
import simulador.Simulador;

/**
 *
 * @author Cristian Enríquez
 */
public class UISimulacion extends javax.swing.JFrame {

    Piloto piloto = new Piloto();
    
    /**
     * Creates new form UISimulacion
     */
    public UISimulacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        piloto = Almacen.getPilotoByNempleado(UIPilots.npiloto);
        
        jLabelNombrePiloto.setText(piloto.getNombre());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNombrePiloto = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxEscenarios = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneResultadoSimulacion = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return.png"))); // NOI18N
        returnButton.setBorder(null);
        returnButton.setBorderPainted(false);
        returnButton.setContentAreaFilled(false);
        returnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        returnButton.setFocusPainted(false);
        returnButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return-p.png"))); // NOI18N
        returnButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return-o.png"))); // NOI18N
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Hacer Simulación"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("Piloto:   ");
        jPanel3.add(jLabel1);
        jPanel3.add(jLabelNombrePiloto);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 40));

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setText("Escenario:  ");
        jPanel4.add(jLabel2);

        jComboBoxEscenarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escenario 1", "Escenario 2", "Escenario 3", "Escenario 4", "Escenario 5", "Escenario 6" }));
        jPanel4.add(jComboBoxEscenarios);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 40));

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jButton1.setText("Realizar Simulacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 280, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 320, 200));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados:"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setViewportView(jTextPaneResultadoSimulacion);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 320));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 300, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 700, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        SeleccionarUsuario seleccionarUsuario = new SeleccionarUsuario();
        seleccionarUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnButtonActionPerformed

    
    /**
     * Evento que genera la simulacion de realizar una prueba de simulacion
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Primero obtenemos el escenario seleccionado
        int escenario = getEscenarioSeleccionado(jComboBoxEscenarios.getSelectedItem().toString());

        RegistroPruebasSimulacion rps = Simulador.getRegistro(escenario, piloto);
        
        Almacen.registrarPruebaSimulacion(rps);
        
        //Se muestra el resultado
        jTextPaneResultadoSimulacion.setContentType("text/html");
        
        String resultado = "";
        
        resultado = resultado + "Calificaicon obtenida en las condicones Meteorologicas: "+ rps.getCalificacionMeteorologica()+ "<br/>";
        resultado = resultado + "Calificaicon obtenida en las condicones Orograficas: "+ rps.getCalificacionOrografica()+ "<br/>";
        resultado = resultado + "Calificaicon obtenida en las condicones de Visibilidad: "+ rps.getCalificacionVisibilidad()+ "<br/>";
        
        jTextPaneResultadoSimulacion.setText("<html><body style='width:100%;'>"+resultado+"</body></html>");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private int getEscenarioSeleccionado(String nombre){
        int e;

        switch(nombre){
            case "Escenario 1":
                    e = 1;
                    break;
  
            case "Escenario 2":
                 e = 2;
                break;
  
            case "Escenario 3":
                 e = 3;
                break;   
  
            case "Escenario 4":
                 e = 4;
                break;      
  
            case "Escenario 5":
                 e = 5;
                break;  
  
            case "Escenario 6":
                 e = 6;
                break;  
            default:
                e = 1;
                break;
            }

        return e;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxEscenarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNombrePiloto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPaneResultadoSimulacion;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
