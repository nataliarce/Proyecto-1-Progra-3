/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.presentation.prestamos;

import java.util.Observable;
import javax.swing.JOptionPane;
import payroll.Application;
import payroll.logic.Prestamo;

/**
 *
 * Autores:
 *         Natalia Arce Rodriguez
 *         Michelle Delgado Meneses
 * 
 */
public class View extends javax.swing.JFrame implements java.util.Observer {

    //**************  MVC ***********
    Controller controller;
    Model model;
    
    public void setController(Controller controller){
        this.controller=controller;
    }

    public Controller getController() {
        return controller;
    }
    
    public void setModel(Model model){
        this.model=model;
        model.addObserver(this);
    }

    public Model getModel() {
        return model;
    }
    
    @Override
    public void update(Observable o, Object arg) 
    {
        clienteFld.setText(model.getCliente().getNombre());
        idFld.setText(model.getCliente().getCedula());
        prestamosTbl.setModel(new PrestamosTableModel(model.getPrestamos()));
        //pagosTbl.setModel(new PagosTableModel(model.getPagos()));
//        Prestamo prestamo = model.getPrestamo();
//        idPrestamoFld.setText(prestamo.getId());
//        String calcularCuota = String.valueOf(model.getPrestamo().calcularCuota());
//        String monto = String.valueOf(model.getPrestamo().getMonto());
//        montoFld.setText(monto);
//        String plazo = String.valueOf(model.getPrestamo().getPlazo());
//        plazoFld.setText(plazo);
//        String tasa = String.valueOf(model.getPrestamo().getTasaInteres());
//        tasaInteresFld.setText(tasa);
        
        //pdfidPrestamo.setText(prestamo.getId());
//         Cliente cliente = model.getCliente();
//         cedula.setText(cliente.getCedula());
//         nombre.setText(cliente.getNombre());    
//         provincia.setText(cliente.getProvincia().getNombre());
//         cantonCB.setSelectedItem(cantonCB.getSelectedItem());
//         cantonCB.setSelectedItem(cliente.getCanton());

    }
    
//************** END MVC ***********
    /**
     * Creates new form View
     */
    public View() {
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

        regresarBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelMonto = new javax.swing.JLabel();
        labelPlazo = new javax.swing.JLabel();
        labelTasa = new javax.swing.JLabel();
        montoFld = new javax.swing.JTextField();
        plazoFld = new javax.swing.JTextField();
        tasaInteresFld = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        prestamosTbl = new javax.swing.JTable();
        guardarPrestamo = new javax.swing.JToggleButton();
        labelPrestamo = new javax.swing.JLabel();
        idPrestamoFld = new javax.swing.JTextField();
        aux = new javax.swing.JButton();
        pdfBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        clienteFld = new javax.swing.JTextField();
        labelid = new javax.swing.JLabel();
        idFld = new javax.swing.JTextField();
        pagosBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        regresarBtn.setText("Regresar");
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 204));

        labelMonto.setText("Monto");

        labelPlazo.setText("Plazo");

        labelTasa.setText("Tasa Interes");

        prestamosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        prestamosTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prestamosTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(prestamosTbl);

        guardarPrestamo.setText("Guardar Prestamo");
        guardarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPrestamoActionPerformed(evt);
            }
        });

        labelPrestamo.setText("ID");

        aux.setText("Listar");
        aux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auxActionPerformed(evt);
            }
        });

        pdfBuscar.setText("Consultar");
        pdfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTasa)
                            .addComponent(labelPlazo)
                            .addComponent(labelMonto)
                            .addComponent(labelPrestamo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(plazoFld)
                                    .addComponent(tasaInteresFld))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(montoFld, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idPrestamoFld, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guardarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pdfBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPrestamo)
                            .addComponent(idPrestamoFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMonto)
                            .addComponent(montoFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPlazo)
                            .addComponent(plazoFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(guardarPrestamo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aux)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTasa)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tasaInteresFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pdfBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        labelNombre.setText("Cliente");

        clienteFld.setEditable(false);
        clienteFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteFldActionPerformed(evt);
            }
        });

        labelid.setText("ID Cliente");

        idFld.setEditable(false);
        idFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombre)
                    .addComponent(labelid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clienteFld, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(idFld))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clienteFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelid)
                    .addComponent(idFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pagosBtn.setText("Pagos");
        pagosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagosBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresarBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(pagosBtn)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pagosBtn)
                        .addGap(223, 223, 223)))
                .addComponent(regresarBtn)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        // TODO add your handling code here:
        controller.hide();
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void clienteFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteFldActionPerformed
        //esto no es necesario
    }//GEN-LAST:event_clienteFldActionPerformed

    private void guardarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPrestamoActionPerformed
        // TODO add your handling code here:
        if (labelPrestamo.getText().isEmpty() || montoFld.getText().isEmpty() || plazoFld.getText().isEmpty() || tasaInteresFld.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Se deben rellenar todos los espacios para agregar un prestamo");
        }
        else 
        {
            int numMonto = Integer.parseInt(montoFld.getText());
            int numPlazo = Integer.parseInt(plazoFld.getText());
            int numTasa = Integer.parseInt(tasaInteresFld.getText());
            controller.agregarPrestamo(new Prestamo(idPrestamoFld.getText(),numMonto,numPlazo,numTasa),idFld.getText());
            JOptionPane.showMessageDialog(this, "Prestamo agregado");
            controller.prestamoSearch(idFld.getText());
            
        }
    }//GEN-LAST:event_guardarPrestamoActionPerformed

    private void auxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auxActionPerformed
        // TODO add your handling code here:
        controller.prestamoSearch(idFld.getText());
    }//GEN-LAST:event_auxActionPerformed

    private void idFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFldActionPerformed
        // TODO add your handling code here:
        //no se necesita
    }//GEN-LAST:event_idFldActionPerformed

    private void pdfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfBuscarActionPerformed
        // TODO add your handling code here:
        controller.consultarPrestamo(idFld.getText(), idPrestamoFld.getText());
        Prestamo prestamo = model.getPrestamo();   
        if (!prestamo.equals(new Prestamo()))
        {
        idPrestamoFld.setText(prestamo.getId());
        String monto = String.valueOf(model.getPrestamo().getMonto());
        montoFld.setText(monto);
        String plazo = String.valueOf(model.getPrestamo().getPlazo());
        plazoFld.setText(plazo);
        String tasa = String.valueOf(model.getPrestamo().getTasaInteres());
        tasaInteresFld.setText(tasa);
        prestamo.getPagos();
        }
        else 
        {
            pagosBtn.setEnabled(false);
        }
    }//GEN-LAST:event_pdfBuscarActionPerformed

    private void prestamosTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamosTblMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2)
        {
            controller.seleccionarPrestamo(prestamosTbl.getSelectedRow());
        }
    }//GEN-LAST:event_prestamosTblMouseClicked

    private void pagosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagosBtnActionPerformed
        // TODO add your handling code here:
        if (idPrestamoFld.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Tiene que seleccionar un prestamo para poder realizar los pagos correspondientes");
        }
        else 
        {
            controller.mostrarPagos();
        }
        
    }//GEN-LAST:event_pagosBtnActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aux;
    private javax.swing.JTextField clienteFld;
    private javax.swing.JToggleButton guardarPrestamo;
    private javax.swing.JTextField idFld;
    private javax.swing.JTextField idPrestamoFld;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMonto;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPlazo;
    private javax.swing.JLabel labelPrestamo;
    private javax.swing.JLabel labelTasa;
    private javax.swing.JLabel labelid;
    private javax.swing.JTextField montoFld;
    private javax.swing.JButton pagosBtn;
    private javax.swing.JButton pdfBuscar;
    private javax.swing.JTextField plazoFld;
    private javax.swing.JTable prestamosTbl;
    private javax.swing.JButton regresarBtn;
    private javax.swing.JTextField tasaInteresFld;
    // End of variables declaration//GEN-END:variables
}
