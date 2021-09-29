/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.presentation.principal;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.List;
import java.util.Observable;
import javax.imageio.ImageIO;
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
         
         List<Canton> canton = model.getCantones();
         List<Distrito> distritos = model.getDistritos();
         Cliente cliente = model.getCliente();
         cedula.setText(cliente.getCedula());
         nombre.setText(cliente.getNombre());    
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        provinciasMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/presentation/imagenes/mapa0.png"))); // NOI18N
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

        cantonCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        provincia.setEnabled(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(provinciasMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldCedula)
                            .addComponent(textFieldNombre))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(239, 239, 239)
                                .addComponent(GuardarBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(ConsultarBtn))))
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
                            .addComponent(distritoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldDistrito))))
                .addContainerGap(104, Short.MAX_VALUE))
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
                .addComponent(provinciasMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        provinciasMapa.getAccessibleContext().setAccessibleName("Provincias");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void ConsultarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarBtnActionPerformed
        controller.consultarClientePorCedula(cedula.getText());
    }//GEN-LAST:event_ConsultarBtnActionPerformed

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
            
            cantonCB.setModel(new javax.swing.DefaultComboBoxModel<>(nombreCanton));
            cantonCB.setSelectedItem(cantonCB.getSelectedItem());
            cantonCB.setSelectedIndex(-1);
            
            List<Distrito> distrito = controller.consultarDistrito(cantonCB.getSelectedItem().toString());
            String nombreDistrito[] = new String[distrito.size()];
            for(int i = 0; i < nombreDistrito.length; i++)
            {
                nombreDistrito[i] = distrito.get(i).getNombre();
            }
            distritoCB.setModel(new javax.swing.DefaultComboBoxModel<>(nombreDistrito));
            distritoCB.setSelectedItem(distritoCB.getSelectedItem());
            distritoCB.setSelectedIndex(-1);
        }
        else 
        {
            provincia.setText(" ");
            provinciasMapa.setIcon(pro[0]);
        }
    }//GEN-LAST:event_provinciasMapaMouseClicked

    private void GuardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBtnActionPerformed
//        if (cedula.getText().isEmpty() || nombre.getText().isEmpty())
//        {
//            JOptionPane.showMessageDialog(this,"Se deben rellenar todos los espacios para agregar un cliente" );
//        }
//        else 
//        {
////             controller.agregarCliente(new Cliente(cedula.getText(),nombre.getText(),(Provincia)provincia.getText(), 
////                     (Canton) cantonCB.getSelectedItem(), (Distrito) distritoCB.getSelectedItem()));
//        }
    }//GEN-LAST:event_GuardarBtnActionPerformed

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
    private javax.swing.JComboBox<String> cantonCB;
    private javax.swing.JTextField cedula;
    private javax.swing.JComboBox<String> distritoCB;
    private javax.swing.JTextField nombre;
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
