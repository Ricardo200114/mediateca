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
public class Modificar extends javax.swing.JFrame {
    
    String codMaterial = "";
    int op = 0;

    public void setOp(int op) {
        this.op = op;
    }        

    public void setCodMaterial(String codMaterial) {
        this.codMaterial = codMaterial;
        
        System.out.println("op"+op);
        System.out.println("cod"+ codMaterial);
        
        switch(op){
            case 1:
                Libro libro;
                LibroController libroController = new LibroController();
                codTxt.setText(codMaterial);
                libro = libroController.buscarLibroByCoId(codMaterial);
                panel_mod.setSelectedIndex(0);

                if (libro.getCodId() != null) {

                    tituloTxt.setText(libro.getTitulo());
                    autorTxt.setText(libro.getAutor());
                    paginasTxt.setText(String.valueOf(libro.getNoPaginas()));
                    editorialTxt.setText(libro.getEditorial());
                    isbnTxt.setText(libro.getIsbn());
                    fechaTxt.setText(libro.getFecha());
                    unidadesTxt.setText(String.valueOf(libro.getUnidades()));

                } else {
                    JOptionPane.showMessageDialog(null, "Registro con código " + codTxt.getText().toUpperCase() + " no existe en la base de datos...");
                }
                
                break;
            case 2:
                Revista revista;
                RevistaController revistaController = new RevistaController();
                rCodTxt.setText(codMaterial);
                revista = revistaController.buscarRevistaByCodId(rCodTxt.getText());
                panel_mod.setSelectedIndex(1);

                if (revista.getCodId() != null) {

                    rTituloTxt.setText(revista.getTitulo());
                    rEditorialTxt.setText(revista.getEditorial());
                    rPeriodicidadTxt.setText(revista.getPeriodicidad());
                    rFechaTxt.setText(revista.getFecha());
                    rUnidadesTxt.setText(String.valueOf(revista.getUnidades()));

                } else {
                    JOptionPane.showMessageDialog(null, "Registro con código " + rCodTxt.getText().toUpperCase() + " no existe en la base de datos...");
                }
                break;
            case 3:
                Cd cd;
                CdController cdController = new CdController();
                cCodTxt.setText(codMaterial);
                cd = cdController.buscarByCoId(cCodTxt.getText());
                panel_mod.setSelectedIndex(2);

                if (cd.getCodId() != null) {

                    cTituloTxt.setText(cd.getTitulo());
                    cArtistaTxt.setText(cd.getArtista());
                    cGeneroTxt.setText(cd.getGenero());
                    cDuracionTxt.setText(cd.getDuracion());
                    cNoCancionTxt.setText(String.valueOf(cd.getNoCanciones()));
                    cUnidadesTxt.setText(String.valueOf(cd.getUnidades()));

                } else {
                    JOptionPane.showMessageDialog(null, "Registro con código " + cCodTxt.getText().toUpperCase() + " no existe en la base de datos...");
                }
                break;
            case 4:
                DVD dvd;
                DvdController dvdController = new DvdController();
                dCodTxt.setText(codMaterial);
                dvd = dvdController.buscarByCoId(dCodTxt.getText());
                panel_mod.setSelectedIndex(3);

                if (dvd.getCodId() != null) {

                    dTituloTxt.setText(dvd.getTitulo());
                    dDirectorTxt.setText(dvd.getDirector());
                    dDuracionTxt.setText(dvd.getDuracion());
                    dGeneroTxt.setText(dvd.getGenero());

                } else {
                    JOptionPane.showMessageDialog(null, "Registro con código " + dCodTxt.getText().toUpperCase() + " no existe en la base de datos...");
                }
                break;
            default:
                    System.out.println("vistas.Modificar.setCodMaterial()");
                break;
        }
    }
    
    public void retornar(){
        InicioMediateca f = new InicioMediateca();
        f.setVisible(true);
        this.dispose();
    }
    /**
     * Creates new form modificar
     */
    public Modificar() {
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
        panel_mod = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        codTxt = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tituloTxt = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        autorTxt = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        paginasTxt = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        editorialTxt = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        isbnTxt = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        fechaTxt = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        unidadesTxt = new javax.swing.JTextPane();
        modificarLibroBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        modificarRevistaBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        rCodTxt = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        rTituloTxt = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        rEditorialTxt = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        rPeriodicidadTxt = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        rFechaTxt = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        rUnidadesTxt = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        modificarCdBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        cCodTxt = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        cTituloTxt = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        cArtistaTxt = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        cGeneroTxt = new javax.swing.JTextPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        cDuracionTxt = new javax.swing.JTextPane();
        jScrollPane20 = new javax.swing.JScrollPane();
        cNoCancionTxt = new javax.swing.JTextPane();
        jScrollPane21 = new javax.swing.JScrollPane();
        cUnidadesTxt = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        modificarDvdBtn = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        dCodTxt = new javax.swing.JTextPane();
        jScrollPane23 = new javax.swing.JScrollPane();
        dTituloTxt = new javax.swing.JTextPane();
        jScrollPane24 = new javax.swing.JScrollPane();
        dDirectorTxt = new javax.swing.JTextPane();
        jScrollPane25 = new javax.swing.JScrollPane();
        dDuracionTxt = new javax.swing.JTextPane();
        jScrollPane26 = new javax.swing.JScrollPane();
        dGeneroTxt = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FORMULARIO DE MODIFICACION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jLabel3.setText("Código Material");

        jLabel4.setText("Título");

        jLabel5.setText("Autor");

        jLabel6.setText("Número de páginas");

        jLabel7.setText("Editorial");

        jLabel8.setText("ISBN");

        jLabel9.setText("Año de publicación");

        jLabel10.setText("Unidades a ingresar");

        codTxt.setEditable(false);
        jScrollPane1.setViewportView(codTxt);

        jScrollPane2.setViewportView(tituloTxt);

        jScrollPane3.setViewportView(autorTxt);

        jScrollPane4.setViewportView(paginasTxt);

        jScrollPane5.setViewportView(editorialTxt);

        jScrollPane6.setViewportView(isbnTxt);

        jScrollPane7.setViewportView(fechaTxt);

        jScrollPane8.setViewportView(unidadesTxt);

        modificarLibroBtn.setBackground(new java.awt.Color(255, 204, 51));
        modificarLibroBtn.setText("MODIFICAR");
        modificarLibroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarLibroBtnActionPerformed(evt);
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane2)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(modificarLibroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel6))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(jLabel7))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(modificarLibroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_mod.addTab("Libros", jPanel2);

        modificarRevistaBtn.setBackground(new java.awt.Color(255, 204, 0));
        modificarRevistaBtn.setText("MODIFICAR");
        modificarRevistaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarRevistaBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Código Material");

        jLabel11.setText("Título");

        jLabel12.setText("Editorial");

        jLabel13.setText("Periodicidad");

        jLabel14.setText("Fecha de publicación");

        jLabel15.setText("Unidades a ingresar");

        rCodTxt.setEditable(false);
        jScrollPane9.setViewportView(rCodTxt);

        jScrollPane10.setViewportView(rTituloTxt);

        jScrollPane11.setViewportView(rEditorialTxt);

        jScrollPane12.setViewportView(rPeriodicidadTxt);

        jScrollPane13.setViewportView(rFechaTxt);

        jScrollPane14.setViewportView(rUnidadesTxt);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13))
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                    .addComponent(jScrollPane11)
                                    .addComponent(jScrollPane12)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(modificarRevistaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel11))
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(jLabel12))
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel14))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(modificarRevistaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_mod.addTab("Revistas", jPanel3);

        modificarCdBtn.setBackground(new java.awt.Color(255, 204, 0));
        modificarCdBtn.setText("MODIFICAR");
        modificarCdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarCdBtnActionPerformed(evt);
            }
        });

        jLabel16.setText("Código Material");

        jLabel17.setText("Título");

        jLabel18.setText("Artista");

        jLabel19.setText("Género");

        jLabel20.setText("Duración");

        jLabel21.setText("Número de canciones");

        jLabel22.setText("Unidades a ingresar");

        cCodTxt.setEditable(false);
        jScrollPane15.setViewportView(cCodTxt);

        jScrollPane16.setViewportView(cTituloTxt);

        jScrollPane17.setViewportView(cArtistaTxt);

        jScrollPane18.setViewportView(cGeneroTxt);

        jScrollPane19.setViewportView(cDuracionTxt);

        jScrollPane20.setViewportView(cNoCancionTxt);

        jScrollPane21.setViewportView(cUnidadesTxt);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(modificarCdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane16))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane17))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane18))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane19))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane20))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane21)))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel16)
                                                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel17))
                                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel18))
                                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addComponent(jLabel19))
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel21))
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(modificarCdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_mod.addTab("CDs", jPanel4);

        modificarDvdBtn.setBackground(new java.awt.Color(255, 204, 0));
        modificarDvdBtn.setText("MODIFICAR");
        modificarDvdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDvdBtnActionPerformed(evt);
            }
        });

        jLabel23.setText("Código Material");

        jLabel24.setText("Título");

        jLabel25.setText("Director");

        jLabel26.setText("Duración");

        jLabel27.setText("Género");

        dCodTxt.setEditable(false);
        jScrollPane22.setViewportView(dCodTxt);

        jScrollPane23.setViewportView(dTituloTxt);

        jScrollPane24.setViewportView(dDirectorTxt);

        jScrollPane25.setViewportView(dDuracionTxt);

        jScrollPane26.setViewportView(dGeneroTxt);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane24))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane25))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(modificarDvdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel23)
                                            .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel24))
                                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addComponent(jLabel25))
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel26))
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(modificarDvdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_mod.addTab("DVDs", jPanel5);

        jButton1.setBackground(new java.awt.Color(102, 51, 255));
        jButton1.setText("CANCELAR");
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
            .addComponent(panel_mod)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_mod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InicioMediateca f = new InicioMediateca();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    private void modificarLibroBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                  

        LibroController libroController = new LibroController();

        if (codTxt.getText().isEmpty() || tituloTxt.getText().isEmpty() || autorTxt.getText().isEmpty()
                || paginasTxt.getText().isEmpty() || editorialTxt.getText().isEmpty() || isbnTxt.getText().isEmpty()
                || fechaTxt.getText().isEmpty() || unidadesTxt.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Error! No se puede registrar campos vacíos...");

        } else {

            Libro libro = libroController.buscarLibroByCoId(codTxt.getText()); //primero consulta a la base de datos

            String titulo = tituloTxt.getText();
            String autor = autorTxt.getText();
            int noPagina = Integer.parseInt(paginasTxt.getText());
            String editorial = editorialTxt.getText();
            String isbn = isbnTxt.getText();
            String fecha = fechaTxt.getText();
            int unidades = Integer.parseInt(unidadesTxt.getText());

            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setNoPaginas(noPagina);
            libro.setEditorial(editorial);
            libro.setIsbn(isbn);
            libro.setFecha(fecha);
            libro.setUnidades(unidades);

            if (libroController.modificar(libro) == 1) {

                JOptionPane.showMessageDialog(null, "Registro ha sido modificado con exito...");

                codTxt.setText("");
                tituloTxt.setText("");
                autorTxt.setText("");
                paginasTxt.setText("");
                editorialTxt.setText("");
                isbnTxt.setText("");
                fechaTxt.setText("");
                unidadesTxt.setText("");

            } else {

                JOptionPane.showMessageDialog(null, "Error! No se pudo modificar registro...");
            }
            retornar();
        }
    }


    private void modificarRevistaBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        
        RevistaController revistaController = new RevistaController();
        
        if (rCodTxt.getText().isEmpty() || rTituloTxt.getText().isEmpty() || rEditorialTxt.getText().isEmpty()
                || rPeriodicidadTxt.getText().isEmpty() || rFechaTxt.getText().isEmpty() || rUnidadesTxt.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Error! No se puede registrar campos vacíos...");
            
        } else {
            
            Revista revista = revistaController.buscarRevistaByCodId(rCodTxt.getText());
            
            String titulo = rTituloTxt.getText();
            String editorial = rEditorialTxt.getText();
            String periodicidad = rPeriodicidadTxt.getText();
            String fecha = rFechaTxt.getText();
            int unidades = Integer.parseInt(rUnidadesTxt.getText());
            
            revista.setTitulo(titulo);
            revista.setEditorial(editorial);
            revista.setPeriodicidad(periodicidad);
            revista.setFecha(fecha);
            revista.setUnidades(unidades);
            
            if (revistaController.modificar(revista) == 1) {
                
                JOptionPane.showMessageDialog(null, "Registro ha sido modificado con exito...");

                rCodTxt.setText("");
                rTituloTxt.setText("");
                rEditorialTxt.setText("");
                rPeriodicidadTxt.setText("");
                rFechaTxt.setText("");
                rUnidadesTxt.setText("");
                
            } else {
                JOptionPane.showMessageDialog(null, "Error! No se pudo modificar registro...");
            }
            retornar();
        } 
    }

    
    private void modificarCdBtnActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
        CdController cdController = new CdController(); 
        
        if (cCodTxt.getText().isEmpty() || cTituloTxt.getText().isEmpty() 
                || cArtistaTxt.getText().isEmpty() || cGeneroTxt.getText().isEmpty()
                || cDuracionTxt.getText().isEmpty() || cNoCancionTxt.getText().isEmpty() || cUnidadesTxt.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Error! No se puede registrar campos vacíos...");
            
        } else {
            
            Cd cd = cdController.buscarByCoId(cCodTxt.getText());
             
            String titulo = cTituloTxt.getText();
            String artista = cArtistaTxt.getText();
            String genero = cGeneroTxt.getText();
            String duracion = cDuracionTxt.getText();
            int noCancion = Integer.parseInt(cNoCancionTxt.getText());
            int unidades = Integer.parseInt(cUnidadesTxt.getText());
            
            cd.setTitulo(titulo);
            cd.setArtista(artista);
            cd.setGenero(genero);
            cd.setDuracion(duracion);
            cd.setNoCanciones(noCancion);
            cd.setUnidades(unidades);
            
            if (cdController.modificar(cd) == 1) {
                
                JOptionPane.showMessageDialog(null, "Registro ha sido modificado con exito...");

                cCodTxt.setText("");
                cTituloTxt.setText("");
                cArtistaTxt.setText("");
                cGeneroTxt.setText("");
                cDuracionTxt.setText("");
                cNoCancionTxt.setText("");
                cUnidadesTxt.setText("");
                
            } else {
                JOptionPane.showMessageDialog(null, "Error! No se pudo modificar registro...");
            }
            retornar();
        }
    }


    private void modificarDvdBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
        DvdController dvdController = new DvdController(); 
        
        if (dCodTxt.getText().isEmpty() || dTituloTxt.getText().isEmpty() 
                || dDirectorTxt.getText().isEmpty() || dGeneroTxt.getText().isEmpty()
                || dDuracionTxt.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Error! No se puede registrar campos vacíos...");
            
        } else {
            
            DVD dvd = dvdController.buscarByCoId(dCodTxt.getText());
             
            String titulo = dTituloTxt.getText();
            String director = dDirectorTxt.getText();
            String duracion = dDuracionTxt.getText();
            String genero = dGeneroTxt.getText();
            
            dvd.setTitulo(titulo);
            dvd.setDirector(director);
            dvd.setDuracion(duracion);
            dvd.setGenero(genero);
            
            
            if (dvdController.modificar(dvd) == 1) {
                
                JOptionPane.showMessageDialog(null, "Registro ha sido modificado con exito...");

                dCodTxt.setText("");
                dTituloTxt.setText("");
                dDirectorTxt.setText("");
                dDuracionTxt.setText("");
                dGeneroTxt.setText("");
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Error! No se pudo modificar registro...");
            }
            
            retornar();
        }
    }

    private void consultarDvdBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
        
        
        if (dCodTxt.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Error! Favor ingrese código de identificación de registro a consultar...");
            
        } else {
            DVD dvd;
            DvdController dvdController = new DvdController();
            dvd = dvdController.buscarByCoId(dCodTxt.getText());
            
            if (dvd.getCodId() != null) {
                
                dTituloTxt.setText(dvd.getTitulo());
                dDirectorTxt.setText(dvd.getDirector());
                dDuracionTxt.setText(dvd.getDuracion());
                dGeneroTxt.setText(dvd.getGenero());
                
            } else {
                JOptionPane.showMessageDialog(null, "Registro con código " + dCodTxt.getText().toUpperCase() + " no existe en la base de datos...");
            }
            
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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane autorTxt;
    private javax.swing.JTextPane cArtistaTxt;
    private javax.swing.JTextPane cCodTxt;
    private javax.swing.JTextPane cDuracionTxt;
    private javax.swing.JTextPane cGeneroTxt;
    private javax.swing.JTextPane cNoCancionTxt;
    private javax.swing.JTextPane cTituloTxt;
    private javax.swing.JTextPane cUnidadesTxt;
    private javax.swing.JTextPane codTxt;
    private javax.swing.JTextPane dCodTxt;
    private javax.swing.JTextPane dDirectorTxt;
    private javax.swing.JTextPane dDuracionTxt;
    private javax.swing.JTextPane dGeneroTxt;
    private javax.swing.JTextPane dTituloTxt;
    private javax.swing.JTextPane editorialTxt;
    private javax.swing.JTextPane fechaTxt;
    private javax.swing.JTextPane isbnTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton modificarCdBtn;
    private javax.swing.JButton modificarDvdBtn;
    private javax.swing.JButton modificarLibroBtn;
    private javax.swing.JButton modificarRevistaBtn;
    private javax.swing.JTextPane paginasTxt;
    private javax.swing.JTabbedPane panel_mod;
    private javax.swing.JTextPane rCodTxt;
    private javax.swing.JTextPane rEditorialTxt;
    private javax.swing.JTextPane rFechaTxt;
    private javax.swing.JTextPane rPeriodicidadTxt;
    private javax.swing.JTextPane rTituloTxt;
    private javax.swing.JTextPane rUnidadesTxt;
    private javax.swing.JTextPane tituloTxt;
    private javax.swing.JTextPane unidadesTxt;
    // End of variables declaration//GEN-END:variables
}
