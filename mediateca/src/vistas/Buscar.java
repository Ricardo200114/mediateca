/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.CdController;
import controladores.DvdController;
import controladores.LibroController;
import controladores.RevistaController;
import javax.swing.JOptionPane;
import modelos.Cd;
import modelos.DVD;
import modelos.Libro;
import modelos.Revista;

/**
 *
 * @author edalb
 */
public class Buscar extends javax.swing.JFrame {

    /**
     * Creates new form Buscar
     */
    public Buscar() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        codTxt = new javax.swing.JTextPane();
        consultarLibroBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        consultarRevistaBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rCodTxt = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        consultarCdBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cCodTxt = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        consultarDvdBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        dCodTxt = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BUSQUEDAD DE MATERIAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel3.setText("Código Material");

        jScrollPane1.setViewportView(codTxt);

        consultarLibroBtn.setText("CONSULTAR");
        consultarLibroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarLibroBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(consultarLibroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(consultarLibroBtn)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Libro", jPanel2);

        consultarRevistaBtn.setText("CONSULTAR");
        consultarRevistaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarRevistaBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Código Material");

        jScrollPane2.setViewportView(rCodTxt);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(consultarRevistaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(consultarRevistaBtn)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Revista", jPanel3);

        consultarCdBtn.setText("CONSULTAR");
        consultarCdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarCdBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Código Material");

        jScrollPane3.setViewportView(cCodTxt);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(consultarCdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(consultarCdBtn)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("CD", jPanel4);

        consultarDvdBtn.setText("CONSULTAR");
        consultarDvdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarDvdBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Código Material");

        jScrollPane4.setViewportView(dCodTxt);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(consultarDvdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(consultarDvdBtn)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("DVD", jPanel5);

        jButton1.setText("VOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        InicioMediateca f = new InicioMediateca();
        f.setVisible(true);
        this.dispose();
    }

    private void consultarLibroBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                  

        LibroController libroController = new LibroController();
        Libro libro = libroController.buscarLibroByCoId(codTxt.getText());

        if (!codTxt.getText().equals("")) {

            if (libro.getCodId() == null) {

                JOptionPane.showMessageDialog(null, "No se pudo encontrar registro con código: " + codTxt.getText());

            } else {

                JOptionPane.showMessageDialog(null,
                        "\n Código de Material: " + libro.getCodId()
                        + "\n Título: " + libro.getTitulo()
                        + "\n Autor: " + libro.getAutor()
                        + "\n No páginas: " + libro.getNoPaginas()
                        + "\n Editorial: " + libro.getEditorial()
                        + "\n No de ISBN: " + libro.getIsbn()
                        + "\n Fecha de publicación: " + libro.getFecha()
                        + "\n Unidades disponibles: " + libro.getUnidades()
                        + "\n Tipo: Escrito" 
                );

            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese codigo de identificacion de registro a consultar...");
        }
    }

    private void consultarRevistaBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                    

        RevistaController revistaController = new RevistaController();
        Revista revista = revistaController.buscarRevistaByCodId(rCodTxt.getText());

        if (!rCodTxt.getText().equals("")) {

            if (revista.getCodId() == null) {

                JOptionPane.showMessageDialog(null, "No se pudo encontrar registro con código: " + rCodTxt.getText());

            } else {

                JOptionPane.showMessageDialog(null,
                        "\n Código Material: " + revista.getCodId()
                        + "\n Título: " + revista.getTitulo()
                        + "\n Editorial: " + revista.getEditorial()
                        + "\n No de ISBN: " + revista.getPeriodicidad()
                        + "\n Fecha de publicación: " + revista.getFecha()
                        + "\n Unidades disponibles: " + revista.getUnidades()
                        + "\n Tipo: Escrito"
                );

            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese codigo de identificacion de registro a consultar...");
        }
    }

    private void consultarCdBtnActionPerformed(java.awt.event.ActionEvent evt) {                                               

        CdController cdController = new CdController();
        Cd cd = cdController.buscarByCoId(cCodTxt.getText());

        if (!cCodTxt.getText().equals("")) {

            if (cd.getCodId() == null) {

                JOptionPane.showMessageDialog(null, "No se pudo encontrar registro con código: " + cCodTxt.getText());

            } else {

                JOptionPane.showMessageDialog(null,
                        "\n Código Material: " + cd.getCodId()
                        + "\n Título: " + cd.getTitulo()
                        + "\n Artista: " + cd.getArtista()
                        + "\n Género: " + cd.getGenero()
                        + "\n Duración: " + cd.getDuracion()
                        + "\n Número de canciones: " + cd.getNoCanciones()
                        + "\n Unidades disponibles: " + cd.getUnidades()
                        + "\n Tipo: AudioVisual"
                );

            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese codigo de identificacion de registro a consultar...");
        }
    }

    private void consultarDvdBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
        DvdController dvdController = new DvdController();
        DVD dvd = dvdController.buscarByCoId(dCodTxt.getText());
        
        if (!dCodTxt.getText().equals("")) {

            if (dvd.getCodId() == null) {

                JOptionPane.showMessageDialog(null, "No se pudo encontrar registro con código: " + dCodTxt.getText());

            } else {

                JOptionPane.showMessageDialog(null,
                        "\n Código Materia: " + dvd.getCodId()
                        + "\n Título: " + dvd.getTitulo()
                        + "\n Artista: " + dvd.getDirector()
                        + "\n Duración: " + dvd.getDuracion()
                        + "\n Género: " + dvd.getGenero()
                        + "\n Tipo: AudioVisual"
                );
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese codigo de identificacion de registro a consultar...");
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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane cCodTxt;
    private javax.swing.JTextPane codTxt;
    private javax.swing.JButton consultarCdBtn;
    private javax.swing.JButton consultarDvdBtn;
    private javax.swing.JButton consultarLibroBtn;
    private javax.swing.JButton consultarRevistaBtn;
    private javax.swing.JTextPane dCodTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane rCodTxt;
    // End of variables declaration//GEN-END:variables
}
