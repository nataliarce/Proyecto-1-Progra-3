/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.presentation.principal;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.awt.Rectangle;
import java.awt.event.ItemEvent;
import java.io.IOException;
import java.util.List;
import java.util.Observable;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import payroll.logic.Canton;
import payroll.logic.Cliente;
import payroll.logic.Distrito;
import payroll.logic.Provincia;

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
    public void update(Observable o, Object arg) {
         Provincia prov = model.getProvincia();
         if(prov.getNombre() == "")
         {
             provinciasMapa.setIcon(pro[0]);
         }
        
         Cliente cliente = model.getCliente();
         cedula.setText(cliente.getCedula());
         nombre.setText(cliente.getNombre());    
         cantonCB.setModel(new DefaultComboBoxModel(model.getCantones().toArray()));
         cantonCB.setSelectedItem(cliente.getCanton());

         if(cliente.getCedula().isEmpty())
         {
            provinciasMapa.setIcon(pro[0]);
         }
         else
         {
            int i = Integer.parseInt(cliente.getCedula().substring(0,1));
            provinciasMapa.setIcon(pro[i]);
            provincia.setText(cliente.getProvincia().toString());
         }
    }
    
//************** END MVC ***********
    
    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        this.cargarProvincias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        provinciasMapa = new javax.swing.JLabel();
        textFieldCedula = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JLabel();
        textFieldProvincia = new javax.swing.JLabel();
        textFieldCanton = new javax.swing.JLabel();
        textFieldDistrito = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        cantonCB = new javax.swing.JComboBox<>();
        provincia = new javax.swing.JTextField();
        distritoCB = new javax.swing.JComboBox<>();
        ConsultarBtn = new javax.swing.JButton();
        GuardarBtn = new javax.swing.JButton();
        prestamos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        provinciasMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/presentation/imagenes/mapa0.png"))); // NOI18N
        provinciasMapa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        provinciasMapa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                provinciasMapaMouseMoved(evt);
            }
        });
        provinciasMapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                provinciasMapaMouseClicked(evt);
            }
        });
        provinciasMapa.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                provinciasMapaComponentMoved(evt);
            }
        });

        textFieldCedula.setText("Cedula");

        textFieldNombre.setText("Nombre");

        textFieldProvincia.setText("Provincia");

        textFieldCanton.setText("Canton");

        textFieldDistrito.setText("Distrito");

        cantonCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cantonCBItemStateChanged(evt);
            }
        });
        cantonCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantonCBMouseClicked(evt);
            }
        });

        provincia.setEditable(false);

        distritoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distritoCBActionPerformed(evt);
            }
        });

        ConsultarBtn.setText("Consultar");
        ConsultarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarBtnActionPerformed(evt);
            }
        });

        GuardarBtn.setText("Guardar");
        GuardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBtnActionPerformed(evt);
            }
        });

        prestamos.setText("PRESTAMOS");
        prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldCedula)
                                    .addComponent(textFieldNombre))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(cedula)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldProvincia)
                                    .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldCanton)
                                    .addComponent(cantonCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(114, 114, 114)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldDistrito)
                                    .addComponent(distritoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ConsultarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(GuardarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(339, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(provinciasMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCedula)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultarBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldNombre)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(GuardarBtn)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldProvincia)
                    .addComponent(textFieldCanton)
                    .addComponent(textFieldDistrito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantonCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distritoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(provinciasMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(prestamos)
                        .addGap(454, 454, 454))))
        );

        provinciasMapa.getAccessibleContext().setAccessibleName("Provincias");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //***********************EVENTO DE MAPA************************************
    private void provinciasMapaComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_provinciasMapaComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_provinciasMapaComponentMoved

    private void provinciasMapaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provinciasMapaMouseMoved
        
        Provincia prov = controller.consultarCoordenadas(evt.getX(), evt.getY());
        if(prov != null)
        {
            int numProvincia = Integer.parseInt(prov.getNumero());

            provinciasMapa.setIcon(pro[numProvincia]);
        }
        else
        {
            provinciasMapa.setIcon(pro[0]);
        }
    }//GEN-LAST:event_provinciasMapaMouseMoved

    //***********************EVENTO DE CLIENTE**********************************
    private void ConsultarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarBtnActionPerformed

        controller.consultarClientePorCedula(cedula.getText());
        Cliente cliente = model.getCliente();
        
        if (!cliente.equals(new Cliente()))
        {
            cantonCB.setModel(new DefaultComboBoxModel(controller.consultarCanton(cliente.getProvincia().getNombre()).toArray()));
            cantonCB.setSelectedItem(cliente.getCanton());
            distritoCB.setModel(new DefaultComboBoxModel(controller.consultarDistrito(cliente.getProvincia().getNombre(),
            cliente.getCanton().getNombre()).toArray()));
            distritoCB.setSelectedItem(cliente.getDistrito());
            provincia.setText(cliente.getProvincia().getNombre());
            provinciasMapa.setIcon(pro[Integer.parseInt(cliente.getProvincia().getNumero())]);
            prestamos.setEnabled(true);
            cliente.getPrestamos();
        }
        else 
        {
            distritoCB.removeAllItems();
            cantonCB.setModel(new DefaultComboBoxModel(/*provinciaActual.getCantones().toArray() */));
            provinciasMapa.setIcon(pro[0]);
            provincia.setText("");
            //this.provinciaActual.setNombre(");
            prestamos.setEnabled(false);
            
        }

//        controller.consultarClientePorCedula(cedula.getText());
//        Cliente cliente = model.getCliente();
//        
//        if (!cliente.equals(new Cliente()))
//        {
//            cantonCB.setModel(new DefaultComboBoxModel(controller.getCantones(cliente.getProvincia().getNombre()).toArray()));
//            cantonCB.setSelectedItem(cliente.getCanton());
//        }
//        else 
//        {
//            //cantonCB.setModel(new Default);
//        }
    }//GEN-LAST:event_ConsultarBtnActionPerformed

    //***********************EVENTO DE MAPA************************************
    private void provinciasMapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provinciasMapaMouseClicked
        // TODO add your handling code here:
        Provincia prov = controller.consultarCoordenadas(evt.getX(), evt.getY());
        if(prov != null)
        {
            int numProvincia = Integer.parseInt(prov.getNumero());
            provincia.setText(prov.getNombre());
            provinciasMapa.setIcon(pro[numProvincia]);
            
            List<Canton> canton = controller.consultarCanton(provincia.getText());
           
            
            String nombreCanton[] = new String[canton.size()];
            
            for (int i = 0 ; i<nombreCanton.length ; i++)
            {
                nombreCanton[i] = canton.get(i).getNombre();
            }
            
            cantonCB.setModel(new javax.swing.DefaultComboBoxModel(nombreCanton));
            cantonCB.setSelectedItem(cantonCB.getSelectedItem());
            cantonCB.setSelectedIndex(-1);

        }
        else 
        {
            provincia.setText(" ");
            provinciasMapa.setIcon(pro[0]);
            
        }
    }//GEN-LAST:event_provinciasMapaMouseClicked

    //***********************EVENTO DE GUARDAR**********************************
    private void GuardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBtnActionPerformed
        if (cedula.getText().isEmpty() || nombre.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,
                    "Se deben rellenar todos los espacios para agregar un cliente" );
        }
        else 
        {
            Provincia p = controller.buscarProvinciaPorNombre(provincia.getText());
            Canton c = controller.buscarCantonPorNombre((String) cantonCB.getSelectedItem());
            Distrito d = controller.buscarDistritoPorNombre((String) distritoCB.getSelectedItem());
            controller.agregarCliente(new Cliente(cedula.getText(),nombre.getText(),
                    p, c, d));
        }
		
    }//GEN-LAST:event_GuardarBtnActionPerformed

    //******************MOSTRAR PANTALLA PRESTAMO*******************************
    private void prestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamosActionPerformed
        // TODO add your handling code here:
        if (cedula.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Debe consultar un cliente primero.");
        }
        else 
        {
            controller.mostrarPrestamos();
        }
    }//GEN-LAST:event_prestamosActionPerformed

    //************************EVENTO CANTON*************************************
    private void cantonCBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantonCBMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cantonCBMouseClicked

    private void cantonCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cantonCBItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            List<Distrito> distrito = controller.consultarDistrito(provincia.getText(),cantonCB.getSelectedItem().toString());
            String nombreDistrito[] = new String[distrito.size()];
            for(int i = 0; i < nombreDistrito.length; i++)
            {
                nombreDistrito[i] = distrito.get(i).getNombre();
            }
            distritoCB.setModel(new javax.swing.DefaultComboBoxModel(nombreDistrito));
            distritoCB.setSelectedItem(distritoCB.getSelectedItem());
            distritoCB.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_cantonCBItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controller.exit();
    }//GEN-LAST:event_formWindowClosing

    private void distritoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distritoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distritoCBActionPerformed

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
    private javax.swing.JButton ConsultarBtn;
    private javax.swing.JButton GuardarBtn;
    private javax.swing.JComboBox<Canton> cantonCB;
    private javax.swing.JTextField cedula;
    private javax.swing.JComboBox<Distrito> distritoCB;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton prestamos;
    private javax.swing.JTextField provincia;
    private javax.swing.JLabel provinciasMapa;
    private javax.swing.JLabel textFieldCanton;
    private javax.swing.JLabel textFieldCedula;
    private javax.swing.JLabel textFieldDistrito;
    private javax.swing.JLabel textFieldNombre;
    private javax.swing.JLabel textFieldProvincia;
    // End of variables declaration//GEN-END:variables

    int n = 8;
    ImageIcon [] pro;
    public void cargarProvincias()
    {
        pro = new ImageIcon[n];
        try {
            for (int i=0;i<n;i++)
            {
                pro[i] = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("../imagenes/mapa"+i+".png")));
            }
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
    }

}
