/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.sistemamed.vistasRecepcionista;

import com.mycompany.sistemamed.vistasAdmin.CitasImpl;
import com.mycompany.sistemamed.inter.CitasInter;
import com.mycompany.sistemamed.inter.DocInter;
import com.mycompany.sistemamed.inter.PacientesInter;
import com.mycompany.sistemamed.modelos.Citas;
import com.mycompany.sistemamed.modelos.Doctores;
import com.mycompany.sistemamed.vistasAdmin.DoctoresImp;
import com.mycompany.sistemamed.vistasAdmin.PacientesImpl;
import java.awt.Color;



/**
 *
 * @author crist
 */
public class AgregarDoctores extends javax.swing.JPanel {
        boolean isEdition=false;
        Doctores editarDoc;
        
    public AgregarDoctores() {
        initComponents();
        styles();
    }
    public AgregarDoctores(Doctores doc){
        initComponents();
        isEdition=true;
        editarDoc=doc;
        styles();
        
    }
    private void styles(){
       title.putClientProperty( "FlatLaf.style", "font: bold $h1.regular.font" );
        title.setForeground(Color.black);
        
       jLabel1.putClientProperty( "FlatLaf.style", "font: bold $h.regular.font" );
        jLabel1.setForeground(Color.WHITE);
       jLabel2.putClientProperty( "FlatLaf.style", "font: bold $h.regular.font" );
        jLabel2.setForeground(Color.WHITE);
        jLabel3.putClientProperty( "FlatLaf.style", "font: bold $h.regular.font" );
        jLabel3.setForeground(Color.WHITE);
        jLabel4.putClientProperty( "FlatLaf.style", "font: bold $h.regular.font" );
        jLabel4.setForeground(Color.WHITE);
        jLabel5.putClientProperty( "FlatLaf.style", "font: bold $h.regular.font" );
        jLabel5.setForeground(Color.WHITE);
        jLabel6.putClientProperty( "FlatLaf.style", "font: bold $h.regular.font" );
        jLabel6.setForeground(Color.WHITE);
        jLabel7.putClientProperty( "FlatLaf.style", "font: bold $h.regular.font" );
        jLabel7.setForeground(Color.WHITE);
        jLabel8.putClientProperty( "FlatLaf.style", "font: bold $h.regular.font" );
        jLabel8.setForeground(Color.WHITE);
       
          if(isEdition){
               title.setText("Modificar doctor");
              btnGuardar.setText("Guardar cambios");
              if(editarDoc!=null){
                  
                  txtNombre.setText(editarDoc.getNombre());
                  txtApellidos.setText(editarDoc.getApellidos());
                  txtEdad.setText(editarDoc.getEdad()+"");
                  comoGenero.setSelectedItem(editarDoc.getGenero());
                  txtEspecialidad.setText(editarDoc.getEspecialidad());
                  txtExperiencia.setText(editarDoc.getExperiencia());
                      comboEntrada.setSelectedItem(editarDoc.getHoraEntrada().substring(0,5));
                      comboSalida.setSelectedItem(editarDoc.getHoraSalida().substring(0,5));
                  
              }
        }
        
    }
    public void limpiar(){
      txtNombre.setText("");
      txtApellidos.setText("");
      txtEdad.setText("");
      comoGenero.setSelectedIndex(0);
      txtEspecialidad.setText("");
      txtExperiencia.setText("");
      comboEntrada.setSelectedIndex(0);
      comboSalida.setSelectedIndex(0);
    }
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtApellidos = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtEspecialidad = new javax.swing.JTextField();
        txtExperiencia = new javax.swing.JTextField();
        comoGenero = new javax.swing.JComboBox<>();
        comboEntrada = new javax.swing.JComboBox<>();
        comboSalida = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setRequestFocusEnabled(false);

        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Agregar doctores");
        title.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(4, 48, 49));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 350));

        btnGuardar.setBackground(new java.awt.Color(12, 149, 155));
        btnGuardar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Agregar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Edad");

        jLabel4.setText("Genero");

        jLabel5.setText("Especialidad");

        jLabel6.setText("Experiencia");

        jLabel7.setText("Hora de entrada");

        jLabel8.setText("Hora de salida");

        jButton2.setBackground(new java.awt.Color(12, 149, 155));
        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        txtEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecialidadActionPerformed(evt);
            }
        });

        comoGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        comboEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "09:00", "16:00", "17:00", "24:00", "01:00" }));

        comboSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "09:00", "16:00", "17:00", "24:00", "01:00" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(txtExperiencia)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(1, 1, 1)))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnGuardar)))
        );

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(197, 197, 197))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecialidadActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
        String nombre=txtNombre.getText();
        String apellidos=txtApellidos.getText();
        String edad=txtEdad.getText();
        String genero=(String)comoGenero.getSelectedItem();
        String especialidad=txtEspecialidad.getText();
        String experiencia=txtExperiencia.getText();
        String horaEntrada=(String)comboEntrada.getSelectedItem();
        String horaSalida=(String)comboSalida.getSelectedItem();
               
         if(nombre.isEmpty()||apellidos.isEmpty()||edad.isEmpty()||genero.isEmpty()||especialidad.isEmpty()||experiencia.isEmpty()||horaEntrada.isEmpty()||horaSalida.isEmpty()){
             javax.swing.JOptionPane.showMessageDialog(this,"Debe rellenar todos los campos","Aviso",javax.swing.JOptionPane.ERROR_MESSAGE );
             txtNombre.requestFocus();
            return;
        } try{
            if(!edad.matches("-?\\d+")){
             throw new NumberFormatException();
            }
            int aux=Integer.parseInt(edad);
         if(aux<0){
             javax.swing.JOptionPane.showMessageDialog(this,
                "¡Por favor Introduce una edad valida!.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                txtEdad.requestFocus();
            return;
         }   
        }catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(this,
            "La edad debe ser un número válido", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            txtEdad.requestFocus();
             return;
        }
         
        Doctores doc= isEdition ? editarDoc: new Doctores();    
        doc.setNombre(nombre);
        doc.setApellidos(apellidos);
        doc.setEdad(Integer.parseInt(edad));
        doc.setGenero(genero);
        doc.setEspecialidad(especialidad);
        doc.setExperiencia(experiencia);
        doc.setHoraEntrada(horaEntrada);
        doc.setHoraSalida(horaSalida);
        

        try{
            DocInter inter=new DoctoresImp();
            if(!isEdition)
             inter.registrar(doc);
            else
                inter.modificar(doc);
            String mensaje=isEdition ? "Modificado":"Registrado";
            
              javax.swing.JOptionPane.showMessageDialog(this,
            "Se ha "+mensaje+" con exito", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             if(!isEdition)
                 limpiar();
              
        }catch(Exception e){
           String alerta= isEdition ? "Modificado":"registrado";
           javax.swing.JOptionPane.showMessageDialog(this,
            "Ocurrio un error al "+alerta+" un medico", "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboEntrada;
    private javax.swing.JComboBox<String> comboSalida;
    private javax.swing.JComboBox<String> comoGenero;
    private javax.swing.JPanel contenido;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtExperiencia;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
