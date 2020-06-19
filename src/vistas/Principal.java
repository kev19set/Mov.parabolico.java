/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author USAUARIO
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "src/imagenes/fisica2.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(imgmov, "src/imagenes/proyectil.gif");
        rsscalelabel.RSScaleLabel.setScaleLabel(ecuaciones, "src/imagenes/ecuaciones.gif");
    }


    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnsiguiente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        teoria1 = new javax.swing.JLabel();
        QUEES = new javax.swing.JLabel();
        quesespic = new javax.swing.JLabel();
        imgmov = new javax.swing.JLabel();
        teoria2 = new javax.swing.JLabel();
        teoria3 = new javax.swing.JLabel();
        QUEES1 = new javax.swing.JLabel();
        ecuaciones = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsiguiente.setBackground(new java.awt.Color(204, 204, 204));
        btnsiguiente.setForeground(new java.awt.Color(0, 0, 0));
        btnsiguiente.setText("SIGUIENTE");
        btnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnsiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 800, 160, 60));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabel2.setText("MOVIMIENTO PARABOLICO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 630, 110));

        teoria1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        teoria1.setText("*Un MRUA vertical con velocidad inicial voy hacia arriba.");
        teoria1.setToolTipText("");
        jPanel1.add(teoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 570, 30));

        QUEES.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        QUEES.setForeground(new java.awt.Color(0, 0, 0));
        QUEES.setText("SE COMPONE DE ....");
        jPanel1.add(QUEES, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 330, 100));
        jPanel1.add(quesespic, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 100, 80));
        jPanel1.add(imgmov, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 120, 330, 200));

        teoria2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        teoria2.setText("Movimiento realizado por cualquier objeto cuya trayectoria describe una parábola");
        teoria2.setToolTipText("");
        jPanel1.add(teoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 820, 30));

        teoria3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        teoria3.setText("*Un MRU horizontal de velocidad vx constante.");
        teoria3.setToolTipText("");
        jPanel1.add(teoria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 470, 30));

        QUEES1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        QUEES1.setForeground(new java.awt.Color(0, 0, 0));
        QUEES1.setText("¿QUE ES ?");
        jPanel1.add(QUEES1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 170, 100));
        jPanel1.add(ecuaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 830, 230));

        jButton1.setText("INICIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 780, 130, 50));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 900));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteActionPerformed
    Insert p= new Insert();
    p.setVisible(true);
    dispose();
    }//GEN-LAST:event_btnsiguienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Login p=new Login();
     p.setVisible(true);
    dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QUEES;
    private javax.swing.JLabel QUEES1;
    private javax.swing.JButton btnsiguiente;
    private javax.swing.JLabel ecuaciones;
    private javax.swing.JLabel imgmov;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel quesespic;
    private javax.swing.JLabel teoria1;
    private javax.swing.JLabel teoria2;
    private javax.swing.JLabel teoria3;
    // End of variables declaration//GEN-END:variables
}
