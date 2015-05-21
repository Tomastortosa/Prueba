/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Tomas
 */
public class ProbarExamen extends javax.swing.JFrame {

    /**
     * Creates new form ProbarExamen
     */
    public ProbarExamen() {
        initComponents();
        Azul.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotones = new javax.swing.ButtonGroup();
        etiResultado = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        Opciones = new javax.swing.JPanel();
        Azul = new javax.swing.JRadioButton();
        Verde = new javax.swing.JRadioButton();
        Rojo = new javax.swing.JRadioButton();
        Amarillo = new javax.swing.JRadioButton();
        Negro = new javax.swing.JRadioButton();
        Lista = new javax.swing.JScrollPane();
        ListaColores = new javax.swing.JList();
        etiResultado2 = new javax.swing.JLabel();
        Combobox = new javax.swing.JComboBox();
        etiResultado3 = new javax.swing.JLabel();
        PrecioBase = new javax.swing.JLabel();
        txtPrecioBase = new javax.swing.JTextField();
        SistemaOperativo = new javax.swing.JToggleButton();
        Formatear = new javax.swing.JToggleButton();
        Programas = new javax.swing.JToggleButton();
        etiResultado4 = new javax.swing.JLabel();
        PrecioSO = new javax.swing.JLabel();
        PrecioFormat = new javax.swing.JLabel();
        PrecioPrg = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        Reinciar = new javax.swing.JButton();
        Reinciar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ReinciarTodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        Opciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Colores"));

        GrupoBotones.add(Azul);
        Azul.setText("Azul");

        GrupoBotones.add(Verde);
        Verde.setText("Verde");

        GrupoBotones.add(Rojo);
        Rojo.setText("Rojo");

        GrupoBotones.add(Amarillo);
        Amarillo.setText("Amarillo");

        GrupoBotones.add(Negro);
        Negro.setText("Negro");

        javax.swing.GroupLayout OpcionesLayout = new javax.swing.GroupLayout(Opciones);
        Opciones.setLayout(OpcionesLayout);
        OpcionesLayout.setHorizontalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addGroup(OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Azul)
                    .addComponent(Verde)
                    .addComponent(Rojo)
                    .addComponent(Amarillo)
                    .addComponent(Negro))
                .addGap(0, 82, Short.MAX_VALUE))
        );
        OpcionesLayout.setVerticalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Azul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Verde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rojo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Amarillo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(Negro))
        );

        ListaColores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Naranja", "Morado", "Blanco", "Rosa", "Gris" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        Lista.setViewportView(ListaColores);

        etiResultado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Combobox.setEditable(true);
        Combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Numero 1", "Numero 2", "Numero 3", "Numero 4", "Numero 5" }));
        Combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboboxActionPerformed(evt);
            }
        });

        etiResultado3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PrecioBase.setText("Precio Base");

        txtPrecioBase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SistemaOperativo.setText("Instalacion S.O.");

        Formatear.setText("Formatear");

        Programas.setText("Programas");

        etiResultado4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PrecioSO.setText("15");
        PrecioSO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PrecioFormat.setText("30");
        PrecioFormat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PrecioPrg.setText("10");
        PrecioPrg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        Reinciar.setText("Reiniciar");
        Reinciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReinciarActionPerformed(evt);
            }
        });

        Reinciar1.setText("Reinciar");
        Reinciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reinciar1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reinciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ReinciarTodo.setText("Reinciar Todo");
        ReinciarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReinciarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Reinciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ReinciarTodo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etiResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Reinciar1))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(etiResultado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jButton2))
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addGap(293, 293, 293)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecioBase)
                                    .addComponent(PrecioBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SistemaOperativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Formatear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Programas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etiResultado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PrecioSO)
                                    .addComponent(PrecioFormat)
                                    .addComponent(PrecioPrg)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(Calcular)))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PrecioBase)
                            .addComponent(Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SistemaOperativo)
                            .addComponent(PrecioSO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Formatear)
                            .addComponent(PrecioFormat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Programas)
                            .addComponent(PrecioPrg))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiResultado4, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(etiResultado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiResultado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calcular)
                    .addComponent(btnAceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reinciar)
                    .addComponent(ReinciarTodo)
                    .addComponent(Reinciar1)
                    .addComponent(jButton2))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String mensaje = "Color elejido: ";
        String mensaje2 = "";
        
        if (Azul.isSelected())
            mensaje = mensaje + "Azul";
        if (Amarillo.isSelected())
            mensaje = mensaje + "Amarillo";
        if (Negro.isSelected())
            mensaje = mensaje + "Negro";
        if (Rojo.isSelected())
            mensaje = mensaje + "Rojo";
        if (Verde.isSelected())
            mensaje = mensaje + "Verde";
       
        if (ListaColores.getSelectedIndex()==-1) {
            mensaje2="Seleccionalo";
            } else {
                mensaje2= ListaColores.getSelectedValue().toString();
                etiResultado2.setText(mensaje2);
            }
        
        etiResultado.setText(mensaje);
        etiResultado2.setText(mensaje2);
        
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void ComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboboxActionPerformed
        String mensaje = "";
        
        mensaje = Combobox.getSelectedItem().toString();
        etiResultado3.setText(mensaje);
    }//GEN-LAST:event_ComboboxActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        int precio_base = "", precio_instalacion = "", precio_formatear = "", precio_Programas = "";
      
        
//Recojo datos desde la ventana:
        
precio_base = Integer.parseInt(txtPrecioBase.getText());
precio_instalacion = Integer.parseInt(PrecioSO.getText());
precio_formatear = Integer.parseInt(PrecioFormat.getText());
precio_Programas = Integer.parseInt(PrecioPrg.getText());
        
int precio_total;
        
precio_total = precio_base;
        
if (SistemaOperativo.isSelected()) { 
   precio_total = precio_total + precio_instalacion;
}
        
if (Formatear.isSelected()) { 
   precio_total = precio_total + precio_formatear;            
}
        
if (Programas.isSelected()) { 
   precio_total = precio_total + precio_Programas;
}
        
                

etiResultado4.setText(precio_total + " €");
    }//GEN-LAST:event_CalcularActionPerformed

    private void ReinciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReinciarActionPerformed
       String mensaje = "";
        mensaje = "";
    }//GEN-LAST:event_ReinciarActionPerformed

    private void Reinciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reinciar1ActionPerformed
        String mensaje = "";
        mensaje = "";
    }//GEN-LAST:event_Reinciar1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String mensaje = "";
        mensaje = "";
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ReinciarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReinciarTodoActionPerformed
        String mensaje = "";
        String mensaje2 = "";
        mensaje = "";
        mensaje2 = "";
    }//GEN-LAST:event_ReinciarTodoActionPerformed

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
            java.util.logging.Logger.getLogger(ProbarExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProbarExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProbarExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProbarExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProbarExamen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Amarillo;
    private javax.swing.JRadioButton Azul;
    private javax.swing.JButton Calcular;
    private javax.swing.JComboBox Combobox;
    private javax.swing.JToggleButton Formatear;
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JScrollPane Lista;
    private javax.swing.JList ListaColores;
    private javax.swing.JRadioButton Negro;
    private javax.swing.JPanel Opciones;
    private javax.swing.JLabel PrecioBase;
    private javax.swing.JLabel PrecioFormat;
    private javax.swing.JLabel PrecioPrg;
    private javax.swing.JLabel PrecioSO;
    private javax.swing.JToggleButton Programas;
    private javax.swing.JButton Reinciar;
    private javax.swing.JButton Reinciar1;
    private javax.swing.JButton ReinciarTodo;
    private javax.swing.JRadioButton Rojo;
    private javax.swing.JToggleButton SistemaOperativo;
    private javax.swing.JRadioButton Verde;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel etiResultado;
    private javax.swing.JLabel etiResultado2;
    private javax.swing.JLabel etiResultado3;
    private javax.swing.JLabel etiResultado4;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField txtPrecioBase;
    // End of variables declaration//GEN-END:variables
}
