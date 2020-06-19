
package vistas;


import clases.arregloF;
import clases.Fisica;
import grafica.GrafParabola;

import grafica.funcionparabola;
import static java.lang.Math.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Animacion extends javax.swing.JFrame {

    /**
     * Creates new form Animacion
     */
    public Animacion() {
       
        initComponents();
       this.setLocationRelativeTo(null);
      txtaltura.setEnabled(false);
       txtangulo.setEnabled(false);
       txtvo1.setEnabled(false);
     
   
    }
    public static double[] f(double[]x){
        
                
        double[] y =new double[x.length];
        for(int i=0;i<x.length;i++){
            ;
            y[i]=pow(x[i],2);
        }
        return y ;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btniniciar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        slideralt = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        sliderang = new javax.swing.JSlider();
        slidervo1 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtaltura = new javax.swing.JTextField();
        txtvo1 = new javax.swing.JTextField();
        txtangulo = new javax.swing.JTextField();
        definicion = new javax.swing.JTextField();
        btnTabular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txts = new javax.swing.JTextArea();
        grafpanel = grafica.makepanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 51));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1500, 900));

        jPanel2.setBackground(new java.awt.Color(102, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btniniciar.setText("INICIAR");
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });

        jButton2.setText("REESTART");

        jButton3.setText("PREV PAGINA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("SALIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REPRESENTACION GRAFICA");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        slideralt.setBackground(new java.awt.Color(0, 0, 0));
        slideralt.setMajorTickSpacing(20);
        slideralt.setPaintLabels(true);
        slideralt.setValue(20);
        slideralt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(204, 204, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(51, 51, 255)));
        slideralt.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slideraltStateChanged(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ALTURA");

        sliderang.setMajorTickSpacing(10);
        sliderang.setMaximum(90);
        sliderang.setPaintLabels(true);
        sliderang.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderangStateChanged(evt);
            }
        });

        slidervo1.setMajorTickSpacing(20);
        slidervo1.setPaintLabels(true);
        slidervo1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slidervo1StateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Velocidiad Inicial");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Angulo");

        btnTabular.setText("TABULAR");
        btnTabular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtvo1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slideralt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderang, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slidervo1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(definicion)
                    .addComponent(btniniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTabular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slideralt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slidervo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txtvo1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(definicion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btniniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTabular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        txts.setColumns(20);
        txts.setRows(5);
        jScrollPane1.setViewportView(txts);

        javax.swing.GroupLayout grafpanelLayout = new javax.swing.GroupLayout(grafpanel);
        grafpanel.setLayout(grafpanelLayout);
        grafpanelLayout.setHorizontalGroup(
            grafpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        grafpanelLayout.setVerticalGroup(
            grafpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(grafpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 403, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(396, 396, 396))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(grafpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Mostrar Valor de slider
    private void slideraltStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slideraltStateChanged
      txtaltura.setText(""+slideralt.getValue());
    }//GEN-LAST:event_slideraltStateChanged

    private void slidervo1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slidervo1StateChanged
    txtvo1.setText(""+slidervo1.getValue());
    }//GEN-LAST:event_slidervo1StateChanged

    private void sliderangStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderangStateChanged
    txtangulo.setText(""+sliderang.getValue());
    }//GEN-LAST:event_sliderangStateChanged

    //calcular grafica 
    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
     Double altura=Double.parseDouble(txtaltura.getText());
     Double vini=Double.parseDouble(txtvo1.getText());
     Double angulo=Double.parseDouble(txtangulo.getText());
     Fisica p=new Fisica(altura, vini, angulo);
     
     double anguloRadianes = Math.toRadians(angulo);
     double var1=Math.tan(anguloRadianes);
     double var2=(9.81/(2*(vini*vini)*(Math.cos(anguloRadianes)*Math.cos(anguloRadianes))));
     double var3=altura;
     definicion.setText("("+var1+"*"+"x"+")"+"-"+"("+var2+"*"+"x^2"+")"+"+"+var3);
     
      try {
     String def=definicion.getText();
     double x0=0;
     double xn=Double.parseDouble(p.mru());
     double d=0.01;
     funcionparabola f=new funcionparabola(def);
     double[] x=f.rango(x0, xn, d);
     double[]y;
       
            y = f.evaluart(x);
              grafica.crearGraf(def, x, y);
        } catch (Exception ex) {
            Logger.getLogger(Animacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_btniniciarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     Insert p=new Insert();
     p.setVisible(true);
     dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      try{
        int dialogbutton =JOptionPane.YES_NO_OPTION;
     int result = JOptionPane.showConfirmDialog(null, "Desea Cerrar la aplicacion?","EXIT",dialogbutton);
     if(result==0){
         System.exit(0);
     }} catch(Exception e){
         JOptionPane.showMessageDialog(this, e);
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnTabularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabularActionPerformed
         txts.setText("Segundo\tPosicion\tVelocidad H\tVelocidad Vertical\n");
         
         Double altura=Double.parseDouble(txtaltura.getText());
     Double vini=Double.parseDouble(txtvo1.getText());
     Double angulo=Double.parseDouble(txtangulo.getText());
     Fisica p=new Fisica(altura, vini, angulo);
     double pos=Double.parseDouble(p.mru());
     double inst=0;
     for(double i=0;i<Double.parseDouble(p.cuadratica());i+=0.01){
        arregloF xs= new arregloF(altura, vini , angulo, inst);
         txts.append(String.format("%.2f", i)+"\t"+Double.parseDouble(xs.pos())+"\t"+Double.parseDouble(xs.vhorizontal())+"\t"+Double.parseDouble(xs.vvertical())+"\n");
        i=i+0.01;
       inst=i+0.01;
    }
    }//GEN-LAST:event_btnTabularActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTabular;
    private javax.swing.JButton btniniciar;
    private javax.swing.JTextField definicion;
    private javax.swing.JPanel grafpanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider slideralt;
    private javax.swing.JSlider sliderang;
    private javax.swing.JSlider slidervo1;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextField txtangulo;
    private javax.swing.JTextArea txts;
    private javax.swing.JTextField txtvo1;
    // End of variables declaration//GEN-END:variables
    GrafParabola grafica=new GrafParabola("Ecuacion Parabola","x","y");
}
