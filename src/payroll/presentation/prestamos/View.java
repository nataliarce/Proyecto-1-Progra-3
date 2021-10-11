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
        pagosTbl.setModel(new PagosTableModel(model.getPagos()));
        Prestamo prestamo = model.getPrestamo();
        pdfidPrestamo.setText(prestamo.getId());
        

        
        
                
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
        monto = new javax.swing.JTextField();
        plazo = new javax.swing.JTextField();
        tasaInteres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        prestamosTbl = new javax.swing.JTable();
        guardarPrestamo = new javax.swing.JToggleButton();
        labelPrestamo = new javax.swing.JLabel();
        idPrestamo = new javax.swing.JTextField();
        aux = new javax.swing.JButton();
        pdfBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelPago = new javax.swing.JLabel();
        pago = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        pagosTbl = new javax.swing.JTable();
        pagoCuota = new javax.swing.JToggleButton();
        labelFecha = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idBuscarPrestamo = new javax.swing.JTextField();
        listarPago = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        clienteFld = new javax.swing.JTextField();
        labelid = new javax.swing.JLabel();
        idFld = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        PdfBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pdfidPrestamo = new javax.swing.JTextField();

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
                                    .addComponent(plazo)
                                    .addComponent(tasaInteres))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(idPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMonto)
                            .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPlazo)
                            .addComponent(plazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(guardarPrestamo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aux)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTasa)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tasaInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pdfBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        labelPago.setText("Monto a Pagar");

        pagosTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(pagosTbl);

        pagoCuota.setText("Pagar Cuota");
        pagoCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoCuotaActionPerformed(evt);
            }
        });

        labelFecha.setText("Fecha");

        jLabel1.setText("ID Prestamo");

        listarPago.setText("Listar");
        listarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPago)
                            .addComponent(labelFecha)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idBuscarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(pago)
                            .addComponent(fecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pagoCuota)
                            .addComponent(listarPago)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idBuscarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPago)
                            .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pagoCuota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listarPago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));

        PdfBtn.setText("CREACION PDF");
        PdfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PdfBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Prestamo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PdfBtn)
                    .addComponent(pdfidPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(pdfidPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(PdfBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regresarBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(regresarBtn)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        // TODO add your handling code here:
        controller.hide();
        Application.PRINCIPAL.show();
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void clienteFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteFldActionPerformed
        //esto no es necesario
    }//GEN-LAST:event_clienteFldActionPerformed

    private void guardarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPrestamoActionPerformed
        // TODO add your handling code here:
        if (labelPrestamo.getText().isEmpty() || monto.getText().isEmpty() || plazo.getText().isEmpty() || tasaInteres.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Se deben rellenar todos los espacios para agregar un prestamo");
        }
        else 
        {
            int numMonto = Integer.parseInt(monto.getText());
            int numPlazo = Integer.parseInt(plazo.getText());
            int numTasa = Integer.parseInt(tasaInteres.getText());
            controller.agregarPrestamo(new Prestamo(idPrestamo.getText(),numMonto,numPlazo,numTasa),idFld.getText());
            JOptionPane.showMessageDialog(this, "Prestamo agregado");
            controller.prestamoSearch(idFld.getText());
        }
    }//GEN-LAST:event_guardarPrestamoActionPerformed

    private void auxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auxActionPerformed
        // TODO add your handling code here:
        controller.prestamoSearch(idFld.getText());
    }//GEN-LAST:event_auxActionPerformed

    private void pagoCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoCuotaActionPerformed
        // TODO add your handling code here:
        if (fecha.getText().isEmpty() || pago.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(this, "Se deben rellenar todos los espacios para agregar un pago");           
        }
        else 
        {
            
            int numPago = Integer.parseInt(pago.getText());
            controller.agregarPago(fecha.getText(),numPago, idFld.getText(), idBuscarPrestamo.getText());
            JOptionPane.showMessageDialog(this, "Se realizo el pago exitosamente");
            controller.consultarPago(idFld.getText(), idPrestamo.getText(), fecha.getText());
        }
    }//GEN-LAST:event_pagoCuotaActionPerformed

    private void PdfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PdfBtnActionPerformed
        // TODO add your handling code here:
        if (pdfidPrestamo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Seleccione un prestamo del table model para poder realizar la creacion del pdf");
        }
        controller.mostrarReportes();
    }//GEN-LAST:event_PdfBtnActionPerformed

    private void idFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFldActionPerformed
        // TODO add your handling code here:
        //no se necesita
    }//GEN-LAST:event_idFldActionPerformed

    private void pdfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfBuscarActionPerformed
        // TODO add your handling code here:
        controller.consultarPrestamo(idFld.getText(), idPrestamo.getText());
    }//GEN-LAST:event_pdfBuscarActionPerformed

    private void prestamosTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamosTblMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2)
        {
            controller.seleccionarPrestamo(prestamosTbl.getSelectedRow());
        }
    }//GEN-LAST:event_prestamosTblMouseClicked

    private void listarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarPagoActionPerformed
        // TODO add your handling code here:
        controller.consultarPago(idFld.getText(), idPrestamo.getText(), fecha.getText());
    }//GEN-LAST:event_listarPagoActionPerformed

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
    private javax.swing.JButton PdfBtn;
    private javax.swing.JButton aux;
    private javax.swing.JTextField clienteFld;
    private javax.swing.JTextField fecha;
    private javax.swing.JToggleButton guardarPrestamo;
    private javax.swing.JTextField idBuscarPrestamo;
    private javax.swing.JTextField idFld;
    private javax.swing.JTextField idPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelMonto;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPago;
    private javax.swing.JLabel labelPlazo;
    private javax.swing.JLabel labelPrestamo;
    private javax.swing.JLabel labelTasa;
    private javax.swing.JLabel labelid;
    private javax.swing.JButton listarPago;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField pago;
    private javax.swing.JToggleButton pagoCuota;
    private javax.swing.JTable pagosTbl;
    private javax.swing.JButton pdfBuscar;
    private javax.swing.JTextField pdfidPrestamo;
    private javax.swing.JTextField plazo;
    private javax.swing.JTable prestamosTbl;
    private javax.swing.JButton regresarBtn;
    private javax.swing.JTextField tasaInteres;
    // End of variables declaration//GEN-END:variables
}
