/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

/**
 *
 * @author Lorena Viridiana Reyes Vargas
 */
import java.awt.print.PrinterException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JOptionPane;
public class Nomina extends javax.swing.JFrame { 
public Nomina() { 
initComponents();
}
private void initComponents() { 
jLabel1 = new javax.swing.JLabel(); 
jLabel2 = new javax.swing.JLabel(); 
jLabel3 = new javax.swing.JLabel(); 
jLabel4 = new javax.swing.JLabel(); 
jLabel5 = new javax.swing.JLabel(); 
numempleado = new javax.swing.JTextField(); 
nombre = new javax.swing.JTextField();
rfc = new javax.swing.JTextField(); 
puesto = new javax.swing.JComboBox(); 
jLabel6 = new javax.swing.JLabel(); 
jLabel7 = new javax.swing.JLabel(); 
jLabel8 = new javax.swing.JLabel(); 
salario = new javax.swing.JTextField(); 
bonos = new javax.swing.JTextField(); 
total = new javax.swing.JTextField(); 
jLabel9 = new javax.swing.JLabel(); 
jLabel10 = new javax.swing.JLabel(); 
jLabel11 = new javax.swing.JLabel(); 
jLabel12 = new javax.swing.JLabel(); 
jLabel13 = new javax.swing.JLabel();
impuestos = new javax.swing.JTextField(); 
otros = new javax.swing.JTextField(); 
totald = new javax.swing.JTextField(); 
stotal = new javax.swing.JTextField(); 
calcular = new javax.swing.JButton(); 
imprimir = new javax.swing.JButton(); 
salir = new javax.swing.JButton();
borrar = new javax.swing.JButton(); 
ai = new javax.swing.JTextField(); 
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
setTitle("Recibo de Nomina"); 
setName("frame"); // NOI18N 
setResizable(false); 
jLabel1.setText("Percepciones"); 
jLabel2.setText("Numero de Empleado");
jLabel3.setText("Nombre"); 
jLabel4.setText("RFC"); 
jLabel5.setText("Puesto"); 
numempleado.addActionListener(new java.awt.event.ActionListener() { 
public void actionPerformed(java.awt.event.ActionEvent evt) { 
numempleadoActionPerformed(evt); 
} 
});
puesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gerente", "Director General", "Intendencia", "Secretaria", "Supervisor" })); 
puesto.addActionListener(new java.awt.event.ActionListener() { 
public void actionPerformed(java.awt.event.ActionEvent evt) { 
puestoActionPerformed(evt); 
} 
});
jLabel6.setText("Salario"); 
jLabel7.setText("Bonos/Vales"); 
jLabel8.setText("Total"); 
salario.addActionListener(new java.awt.event.ActionListener() { 
public void actionPerformed(java.awt.event.ActionEvent evt) { 
salarioActionPerformed(evt); 
} 
});
total.setEditable(false); 
jLabel9.setText("Deducciones"); 
jLabel10.setText("Impuestos"); 
jLabel11.setText("Otros Descuentos"); 
jLabel12.setText("Total Deducciones"); 
jLabel13.setText("Salario Total");
otros.addActionListener(new java.awt.event.ActionListener() { 
public void actionPerformed(java.awt.event.ActionEvent evt) { 
otrosActionPerformed(evt); 
} 
});
totald.setEditable(false); 
stotal.setEditable(false); 
stotal.addActionListener(new java.awt.event.ActionListener() { 
public void actionPerformed(java.awt.event.ActionEvent evt) { 
stotalActionPerformed(evt); 
} 
});
calcular.setText("Calcular"); 
calcular.addActionListener(new java.awt.event.ActionListener() { 
public void actionPerformed(java.awt.event.ActionEvent evt) { 
calcularActionPerformed(evt); 
} 
}); 
imprimir.setText("Imprimir"); 
imprimir.addActionListener(new java.awt.event.ActionListener() { 
public void actionPerformed(java.awt.event.ActionEvent evt) { 
imprimirActionPerformed(evt); 
} 
});
salir.setText("Salir"); 
salir.addActionListener(new java.awt.event.ActionListener() { 
public void actionPerformed(java.awt.event.ActionEvent evt) { 
salirActionPerformed(evt); 
} 
}); 
borrar.setText("Borrar");
borrar.addActionListener(new java.awt.event.ActionListener() { 
public void actionPerformed(java.awt.event.ActionEvent evt) { 
borrarActionPerformed(evt); 
} 
}); 
ai.setEditable(false); 
ai.setHorizontalAlignment(javax.swing.JTextField.CENTER);
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); 
getContentPane().setLayout(layout); 
layout.setHorizontalGroup( 
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() 
.addGap(0, 0, Short.MAX_VALUE) 
.addComponent(jLabel1) 
.addGap(34, 34, 34)) 
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() 
.addContainerGap() 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
.addComponent(calcular) 
.addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addGroup(layout.createSequentialGroup() 
.addComponent(imprimir) 
.addGap(44, 44, 44) 
.addComponent(borrar)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE) 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING) 
.addGroup(layout.createSequentialGroup() 
.addComponent(jLabel13) 
.addGap(58, 58, 58)) 
.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING) 
.addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING) 
.addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING) 
.addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)) 
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))) 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
.addComponent(otros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addComponent(stotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
.addComponent(totald, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addComponent(impuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addComponent(jLabel9)))) 
.addGroup(layout.createSequentialGroup() 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false) 
.addGroup(layout.createSequentialGroup() 
.addComponent(jLabel2) 
.addGap(18, 18, 18)
.addComponent(numempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)) 
.addGroup(layout.createSequentialGroup() 
.addComponent(jLabel3) 
.addGap(18, 18, 18) 
.addComponent(nombre)) 
.addGroup(layout.createSequentialGroup() 
.addComponent(jLabel4) 
.addGap(18, 18, 18) 
.addComponent(rfc)) 
.addGroup(layout.createSequentialGroup() 
.addComponent(jLabel5) 
.addGap(18, 18, 18)
.addComponent(puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))) 
.addGap(18, 18, 18) 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
.addGroup(layout.createSequentialGroup() 
.addComponent(jLabel6) 
.addGap(18, 18, 18) 
.addComponent(salario)) 
.addGroup(layout.createSequentialGroup() 
.addComponent(jLabel8) 
.addGap(18, 18, 18) 
.addComponent(total)) 
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel7) 
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
.addComponent(bonos))))) 
.addGap(10, 10, 10)) 
.addGroup(layout.createSequentialGroup() 
.addGap(74, 74, 74)
.addComponent(ai, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) 
); 
layout.setVerticalGroup( 
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
.addGroup(layout.createSequentialGroup() 
.addGap(6, 6, 6) 
.addComponent(jLabel1) 
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED) 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
.addComponent(jLabel2)
.addComponent(numempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addComponent(jLabel6) 
.addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 
.addGap(18, 18, 18) 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
.addComponent(jLabel3) 
.addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addComponent(jLabel7) 
.addComponent(bonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 
.addGap(18, 18, 18)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
.addComponent(jLabel4) 
.addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addComponent(jLabel8) 
.addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 
.addGap(18, 18, 18) 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
.addComponent(jLabel5) 
.addComponent(puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addComponent(jLabel9)) 
.addGap(18, 18, 18) 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
.addComponent(impuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addComponent(jLabel10)) 
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED) 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
.addComponent(jLabel11)
.addComponent(otros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addComponent(calcular)) 
.addGap(18, 18, 18) 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
.addComponent(totald, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addComponent(jLabel12) 
.addComponent(imprimir) 
.addComponent(borrar)) 
.addGap(15, 15, 15) 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
.addComponent(salir)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
.addComponent(stotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addComponent(jLabel13))) 
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE) 
.addComponent(ai, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(27, 27, 27)) 
); 
pack(); 
}// </editor-fold> 
private void numempleadoActionPerformed(java.awt.event.ActionEvent evt) { 
// TODO add your handling code here: 
} 
private void puestoActionPerformed(java.awt.event.ActionEvent evt) { 
// TODO add your handling code here: 
} 
private void calcularActionPerformed(java.awt.event.ActionEvent evt) { 
// TODO add your handling code here: 
double salario1 = 0, bonos1 = 0, impuestos1 = 0, otros1 = 0; 
String numempleado1 = numempleado.getText(); 
String nombre1 = nombre.getText(); 
String rfc1 = rfc.getText(); 
salario1 = Double.parseDouble(salario.getText()); 
bonos1 = Double.parseDouble(bonos.getText()); 
total.setText(String.valueOf(salario1+bonos1)); 
impuestos1 = Double.parseDouble(impuestos.getText());
otros1 = Double.parseDouble(otros.getText()); 
if(nombre1.isEmpty()) 
{ 
numempleado.setText(""); 
nombre.setText(""); 
rfc.setText(""); 
salario.setText(""); 
bonos.setText(""); 
impuestos.setText(""); 
bonos.setText(""); 
total.setText(""); 
totald.setText(""); 
stotal.setText(""); 
otros.setText("");
ai.setText(""); 
JOptionPane.showMessageDialog(this, "Falta su nombre"); 
} 
if(numempleado1.isEmpty()) 
{ 
numempleado.setText(""); 
nombre.setText(""); 
rfc.setText(""); 
salario.setText(""); 
bonos.setText("");
impuestos.setText(""); 
bonos.setText(""); 
total.setText(""); 
totald.setText(""); 
stotal.setText(""); 
otros.setText(""); 
ai.setText(""); 
JOptionPane.showMessageDialog(this, "Falta su numero de empleado"); 
} 
if(rfc1.isEmpty()) 
{ 
numempleado.setText(""); 
nombre.setText(""); 
rfc.setText(""); 
salario.setText("");
bonos.setText(""); 
impuestos.setText(""); 
bonos.setText(""); 
total.setText(""); 
totald.setText(""); 
stotal.setText(""); 
otros.setText(""); 
ai.setText(""); 
JOptionPane.showMessageDialog(this, "Falta su RFC"); 
} 
else
{ 
totald.setText(String.valueOf(impuestos1+otros1));
stotal.setText(String.valueOf((salario1+bonos1)-(impuestos1+otros1))); 
double stotal1 = ((salario1+bonos1)-(impuestos1+otros1)); 
nombre.setEditable(false); 
numempleado.setEditable(false); 
rfc.setEditable(false); 
salario.setEditable(false); 
bonos.setEditable(false); 
impuestos.setEditable(false); 
bonos.setEditable(false); 
otros.setEditable(false); 
ai.setText(numempleado1+" \n "+nombre1+" \n "+rfc1+" \n "+" Su salario total es "+stotal1); 
ai.setEditable(false); 
} 
} 
private void otrosActionPerformed(java.awt.event.ActionEvent evt) { 
// TODO add your handling code here: 
} 
private void salirActionPerformed(java.awt.event.ActionEvent evt) { 
// TODO add your handling code here: 
System.exit(0); 
} 
private void imprimirActionPerformed(java.awt.event.ActionEvent evt) { 
try { 
ai.print(); 
} catch (PrinterException ex) {
Logger.getLogger(Nomina.class.getName()).log(Level.SEVERE, null, ex); 
} 
} 
private void stotalActionPerformed(java.awt.event.ActionEvent evt) { 
// TODO add your handling code here: 
} 
private void borrarActionPerformed(java.awt.event.ActionEvent evt) { 
// TODO add your handling code here: 
nombre.setEditable(true); 
numempleado.setEditable(true); 
rfc.setEditable(true); 
salario.setEditable(true); 
bonos.setEditable(true); 
impuestos.setEditable(true); 
bonos.setEditable(true); 
otros.setEditable(true); 
ai.setEditable(true); 
numempleado.setText(""); 
nombre.setText(""); 
rfc.setText(""); 
salario.setText(""); 
bonos.setText(""); 
impuestos.setText(""); 
bonos.setText(""); 
total.setText(""); 
totald.setText(""); 
stotal.setText(""); 
otros.setText(""); 
ai.setText(""); 
} 
private void salarioActionPerformed(java.awt.event.ActionEvent evt) { 
// TODO add your handling code here: 
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
java.util.logging.Logger.getLogger(Nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
} catch (InstantiationException ex) { 
java.util.logging.Logger.getLogger(Nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
} catch (IllegalAccessException ex) { 
java.util.logging.Logger.getLogger(Nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
} catch (javax.swing.UnsupportedLookAndFeelException ex) { 
java.util.logging.Logger.getLogger(Nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
} 
//</editor-fold> 
//</editor-fold> 
/* Create and display the form */ 
java.awt.EventQueue.invokeLater(new Runnable() { 
@Override 
public void run() { 
new Nomina().setVisible(true); 
} 
}); 
} 
// Variables declaration - do not modify 
private javax.swing.JTextField ai; 
private javax.swing.JTextField bonos; 
private javax.swing.JButton borrar; 
private javax.swing.JButton calcular; 
private javax.swing.JButton imprimir; 
private javax.swing.JTextField impuestos; 
private javax.swing.JLabel jLabel1; 
private javax.swing.JLabel jLabel10; 
private javax.swing.JLabel jLabel11; 
private javax.swing.JLabel jLabel12; 
private javax.swing.JLabel jLabel13; 
private javax.swing.JLabel jLabel2; 
private javax.swing.JLabel jLabel3; 
private javax.swing.JLabel jLabel4; 
private javax.swing.JLabel jLabel5; 
private javax.swing.JLabel jLabel6; 
private javax.swing.JLabel jLabel7; 
private javax.swing.JLabel jLabel8; 
private javax.swing.JLabel jLabel9; 
private javax.swing.JTextField nombre; 
private javax.swing.JTextField numempleado; 
private javax.swing.JTextField otros; 
private javax.swing.JComboBox puesto; 
private javax.swing.JTextField rfc; 
private javax.swing.JTextField salario; 
private javax.swing.JButton salir; 
private javax.swing.JTextField stotal; 
private javax.swing.JTextField total; 
private javax.swing.JTextField totald; 
// End of variables declaration 
}
