/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIPackage;

import DataPackage.StudentClass;
import OperationsPackage.DivisionClass;
import OperationsPackage.PlaceClass;
import OperationsPackage.StandardsClass;
import OperationsPackage.StudentRegisterClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rishad Kavad
 */
public class StudentRegisterFrame extends javax.swing.JFrame {
     ResultSet rs;
    /**
     * Creates new form StudentRegisterFrame
     */
    public StudentRegisterFrame() {
        initComponents();
             genderComboBox.removeAllItems();
             genderComboBox.addItem("Select");
             genderComboBox.addItem("Male");
             genderComboBox.addItem("Female");
             genderComboBox.addItem("Other");
        
         viewPlaces();// Function to view places
         viewClasses();// Function to view classes
         viewDivisions();// Function to view divisions 
         
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        regTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        placeComboBox = new javax.swing.JComboBox<>();
        addressTextField = new javax.swing.JTextField();
        classComboBox = new javax.swing.JComboBox<>();
        divisionComboBox = new javax.swing.JComboBox<>();
        pcntTextField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student Registration");

        jLabel2.setText("Register No.");

        jLabel3.setText("Name of the student ");

        jLabel4.setText("Gender");

        jLabel5.setText("Address of the student");

        jLabel6.setText("Class");

        jLabel7.setText("Division");

        jLabel8.setText("Place");

        jLabel9.setText("Percentage");

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        placeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });

        classComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        divisionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        pcntTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcntTextFieldActionPerformed(evt);
            }
        });

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(151, 151, 151)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(regTextField)
                                    .addComponent(nameTextField)
                                    .addComponent(genderComboBox, 0, 247, Short.MAX_VALUE)
                                    .addComponent(placeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addressTextField)
                                    .addComponent(classComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(divisionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pcntTextField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetButton)
                        .addGap(18, 18, 18)
                        .addComponent(registerButton)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(regTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(placeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6))
                    .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(divisionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pcntTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(resetButton)
                    .addComponent(registerButton))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        
        //Code to insert student data starts
        StudentClass studentClass = new StudentClass();
        studentClass.setRegN0(Integer.parseInt(regTextField.getText()));
        studentClass.setStudentName(String.valueOf(nameTextField.getText()));
        studentClass.setStudentGender(String.valueOf(genderComboBox.getSelectedItem()));
        studentClass.setStudentAddress(String.valueOf(addressTextField.getText()));
        studentClass.setStudentPlace(String.valueOf(placeComboBox.getSelectedItem()));
        studentClass.setStudentClass(String.valueOf(classComboBox.getSelectedItem()));
        studentClass.setStudentDivision(String.valueOf(divisionComboBox.getSelectedItem()));
        studentClass.setStudentPercentage(Float.parseFloat(pcntTextField.getText()));
        StudentRegisterClass registerClass = new StudentRegisterClass();
        registerClass.registerStudent(studentClass);
        //Code to insert student data ends
        
        StudentHomeFrame homeFrame = new StudentHomeFrame();
        homeFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerButtonActionPerformed

    private void pcntTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcntTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcntTextFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        StudentHomeFrame homeFrame = new StudentHomeFrame();
        homeFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        //Code to reset values starts
        regTextField.setText("");
        nameTextField.setText("");
        addressTextField.setText("");
        addressTextField.setText("");
        pcntTextField.setText("");
        genderComboBox.setSelectedIndex(1);
        placeComboBox.setSelectedIndex(1);
        classComboBox.setSelectedIndex(1);
        divisionComboBox.setSelectedIndex(1);
        //Code to reset values ends
    }//GEN-LAST:event_resetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> classComboBox;
    private javax.swing.JComboBox<String> divisionComboBox;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField pcntTextField;
    private javax.swing.JComboBox<String> placeComboBox;
    private javax.swing.JTextField regTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
   // Function to load places to the combo box starts
    private void viewPlaces() {
       try {
             
             placeComboBox.removeAllItems();
             placeComboBox.addItem("Select");
             PlaceClass placeClass = new PlaceClass();
             rs = placeClass.viewPlaces();
             while(rs.next()){
                 
                 placeComboBox.addItem(rs.getString("place_name"));
                 
             }} catch (SQLException ex) {
             Logger.getLogger(StudentRegisterFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
   // Function to load places to the combo box ends
    
    // Function to load classes to the combo box starts
    private void viewClasses() {
         try {
             classComboBox.removeAllItems();
             classComboBox.addItem("Select");
             StandardsClass standardsClass = new StandardsClass();
             rs = standardsClass.viewClasses();
             while(rs.next()){
                 classComboBox.addItem(rs.getString("class_name"));
             }
         } catch (SQLException ex) {
             Logger.getLogger(StudentRegisterFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    // Function to load classes to the combo box ends
    // Function to load divisions to the combo box starts
    private void viewDivisions() {
         try {
             divisionComboBox.removeAllItems();
             divisionComboBox.addItem("Select");
             DivisionClass divisionClass = new DivisionClass();
             rs = divisionClass.viewDivisions();
             while(rs.next()){
                 divisionComboBox.addItem(rs.getString("division"));
             }
         } catch (SQLException ex) {
             Logger.getLogger(StudentRegisterFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    // Function to load classes to the combo box enda
}
