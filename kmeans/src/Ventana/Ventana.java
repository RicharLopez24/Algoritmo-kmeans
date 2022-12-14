/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import K_means.K_means;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author carol
 */
public class Ventana extends javax.swing.JFrame {

    //guardo distancias
    ArrayList<Float> distancias = new ArrayList<>();
    //color de lso atractores
    
    //sumara los puntos de la misma clase
    ArrayList<Integer> clasesX = new ArrayList<>();
    ArrayList<Integer> clasesY = new ArrayList<>();
    
 
    //numero de atratores y puntos
    int atractores,contaCentor=1;
    int Np;
    
    K_means algoritmo = new K_means();
    
  
    /**
     * Creates new form K_means
     */
    public Ventana() {
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

        jPanel1 = new javax.swing.JPanel();
        btngenerar = new javax.swing.JButton();
        btnClases = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        txtCantPuntos = new javax.swing.JTextField();
        txtAtractores = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCalCentroide = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        JPpuntos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btngenerar.setText("Aplicar Puntos");
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btngenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        btnClases.setText("Clasificar");
        btnClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasesActionPerformed(evt);
            }
        });
        jPanel1.add(btnClases, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 105, -1));

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));
        jPanel1.add(txtCantPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, -1));
        jPanel1.add(txtAtractores, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 90, -1));

        jLabel1.setText("Puntos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setText("atractores");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnCalCentroide.setText("calcular centroides");
        btnCalCentroide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalCentroideActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalCentroide, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 530));

        JPpuntos.setBackground(new java.awt.Color(255, 255, 255));
        JPpuntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPpuntosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout JPpuntosLayout = new javax.swing.GroupLayout(JPpuntos);
        JPpuntos.setLayout(JPpuntosLayout);
        JPpuntosLayout.setHorizontalGroup(
            JPpuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        JPpuntosLayout.setVerticalGroup(
            JPpuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(JPpuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 880, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
      
        txtCantPuntos.setText("");
        txtAtractores.setText("");        
        Np = 0;
        atractores = 0;
        contaCentor=1;                
        algoritmo.limpiar();
        //colorPuntos.clear();
        repaint();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
        // TODO add your handling code here:
        Np = Integer.parseInt(txtCantPuntos.getText());
        atractores = Integer.parseInt(txtAtractores.getText());
        algoritmo.puntosCor(Np);                       
        pintarPuntos();
    }//GEN-LAST:event_btngenerarActionPerformed

    private void JPpuntosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPpuntosMousePressed
        // TODO add your handling code here:
        
        //System.out.println("atractores "+atractores);
        if(atractores >= contaCentor){
            Graphics g = JPpuntos.getGraphics();
            switch(contaCentor){
                case 1:                        
                        g.setColor(Color.MAGENTA);//establecemos el color
                        
                        break;
                    case 2:
                        g.setColor(Color.BLUE);//establecemos el color
                        break;
                    case 3:
                        g.setColor(Color.YELLOW);//establecemos el color
                        break;
                    case 4:
                        g.setColor(Color.GREEN);//establecemos el color
                        break;
                    case 5:
                        g.setColor(Color.RED);//establecemos el color
                        break;
                    case 6:
                        g.setColor(Color.GRAY);//establecemos el color
                        break;
                    case 7:
                        g.setColor(Color.PINK);//establecemos el color
                        break;
                    case 8:
                        g.setColor(Color.CYAN);//establecemos el color
                        break;
            }
            algoritmo.getCorAtratX().add(evt.getX());            
            algoritmo.getCorAtratY().add(evt.getY());
            algoritmo.getColorAtractor().add(g.getColor());
            g.fillOval(evt.getX(), evt.getY(), 10, 10);
            contaCentor++;
        }
        
       // System.out.println("colores= "+colorAtractor);
    }//GEN-LAST:event_JPpuntosMousePressed

    private void btnClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasesActionPerformed
        // TODO add your handling code here:
        
        float minimo = 0;
        int indexMin = 0;
        Color caux;
        
        System.out.println("cordenadas centros "+algoritmo.getCorAtratX()+" "+algoritmo.getCorAtratY());
        Graphics g = JPpuntos.getGraphics();
        for (int i = 0; i < Np; i++) {
            
            for (int j = 0; j < atractores; j++) {
                distancias.add(algoritmo.calcularDis(algoritmo.getCorPunX().get(i), algoritmo.getCorPunY().get(i), algoritmo.getCorAtratX().get(j), algoritmo.getCorAtratY().get(j)));
              //  System.out.println("distancias "+i+" ; "+distancias);
                
            }
            minimo = Collections.min(distancias);
            //System.out.println("valor minimo "+minimo);
            indexMin = distancias.indexOf(minimo);
            //System.out.println("indice valor "+indexMin);
            caux = algoritmo.getColorAtractor().get(indexMin);
           // System.out.println("color del atractor "+caux);
            
            //colorPuntos.add(caux);
            algoritmo.getClasesColor().add(caux);
            g.setColor(caux);
            g.fillOval(algoritmo.getCorPunX().get(i), algoritmo.getCorPunY().get(i), 5, 5);
          
            
            
            distancias.clear();
        }
        
      
    }//GEN-LAST:event_btnClasesActionPerformed

    private void btnCalCentroideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalCentroideActionPerformed
        // TODO add your handling code here:
       // System.out.println("cordenadas antes "+corAtratX+"."+corAtratY);
        ArrayList<Integer> AtratX = new ArrayList<>();
        ArrayList<Integer> AtratY = new ArrayList<>();
        int cont=0;
        int Contadores[] = new int[atractores];       
        Graphics g = JPpuntos.getGraphics();        
        
        for (int i = 0; i < atractores; i++) {
            Contadores[i]=0;
            AtratX.add(0);
            AtratY.add(0);
        }
        
        for (int i = 0; i < Np; i++) {
            for (int j = 0; j < atractores; j++) {
                if(algoritmo.getClasesColor().get(i) == algoritmo.getColorAtractor().get(j)){
                    cont = AtratX.get(j) + algoritmo.getCorPunX().get(i);
                    AtratX.set(j, cont);
                    cont = 0;
                    cont = AtratY.get(j) + algoritmo.getCorPunY().get(i);
                    AtratY.set(j, cont);
                    
                    Contadores[j] =  Contadores[j] +1;
                   
                }              
            }                       
            
        }    
        
        

        for (int k = 0; k < atractores; k++) {
           AtratX.set(k,AtratX.get(k) / Contadores[k]);
           AtratY.set(k,AtratY.get(k) / Contadores[k]);
           //g.setColor(colorAtractor.get(k));
           g.setColor(Color.black);
           g.fillOval(AtratX.get(k), AtratY.get(k), 15, 15);
           
        }
        
        for (int k = 0; k < atractores; k++) {
           algoritmo.getCorAtratX().set(k, AtratX.get(k));
           algoritmo.getCorAtratY().set(k, AtratY.get(k));
           
        }
        algoritmo.getClasesColor().clear();
        
        System.out.println("cordenadas despues "+algoritmo.getCorAtratX()+"."+algoritmo.getCorAtratY());
        
    }//GEN-LAST:event_btnCalCentroideActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    public void pintarPuntos(){
       Graphics g = JPpuntos.getGraphics();
       g.setColor(Color.black);
        for (int i = 0; i < Np; i++) {
            g.fillOval(algoritmo.getCorPunX().get(i), algoritmo.getCorPunY().get(i), 5, 5);
        }
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPpuntos;
    private javax.swing.JButton btnCalCentroide;
    private javax.swing.JButton btnClases;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btngenerar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAtractores;
    private javax.swing.JTextField txtCantPuntos;
    // End of variables declaration//GEN-END:variables
}
