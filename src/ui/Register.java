package ui;

import conn.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kasuni Navoda
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        r_role = new javax.swing.JLabel();
        r_username = new javax.swing.JLabel();
        r_password = new javax.swing.JLabel();
        r_repassword = new javax.swing.JLabel();
        r_roleCombo = new javax.swing.JComboBox<>();
        r_textusername = new javax.swing.JTextField();
        r_submit = new javax.swing.JButton();
        r_cancel = new javax.swing.JButton();
        r_textrepassword = new javax.swing.JPasswordField();
        r_textpassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        r_textfullname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        r_role.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r_role.setText("Role");

        r_username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r_username.setText("User name");

        r_password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r_password.setText("Password");

        r_repassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r_repassword.setText("Re-Enter Password");

        r_roleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Lecturer", "Admin" }));
        r_roleCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_roleComboActionPerformed(evt);
            }
        });

        r_textusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_textusernameActionPerformed(evt);
            }
        });

        r_submit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r_submit.setText("Submit");
        r_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_submitActionPerformed(evt);
            }
        });

        r_cancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r_cancel.setText("Cancel");
        r_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_cancelActionPerformed(evt);
            }
        });

        r_textrepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_textrepasswordActionPerformed(evt);
            }
        });

        r_textpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_textpasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Name with initials");

        r_textfullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_textfullnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(r_submit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r_cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(r_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(r_repassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(r_role, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(r_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r_roleCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(r_textusername)
                            .addComponent(r_textpassword)
                            .addComponent(r_textfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r_textrepassword))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_role, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_textfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_textusername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_textpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_repassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_textrepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_submit)
                    .addComponent(r_cancel))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void r_textusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_textusernameActionPerformed
        
    }//GEN-LAST:event_r_textusernameActionPerformed

    private void r_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_cancelActionPerformed
        dispose();
      
    }//GEN-LAST:event_r_cancelActionPerformed

    private void r_roleComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_roleComboActionPerformed
    
    }//GEN-LAST:event_r_roleComboActionPerformed

    private void r_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_submitActionPerformed
        String role = r_roleCombo.getSelectedItem().toString();
        String fullname = r_textfullname.getText();
        String name = r_textusername.getText();
        String password = r_textpassword.getText();
        String rePassword = r_textrepassword.getText();

        Connection con2 = null;
        try {
            if (password.equals(rePassword)) {
                con2 = ConnectionUtil.getConnection();
                if (con2 == null) {
                    JOptionPane.showMessageDialog(null, "Cannot connect to the database. Try again later.");
                    return;
                }
                PreparedStatement insert = con2.prepareStatement("insert into user(Role,fullname,username,password)values(?,?,?,?)");
                insert.setString(1, role);
                insert.setString(2, fullname);
                insert.setString(3, name);
                insert.setString(4, password);
                int result = insert.executeUpdate();
                if(result == 0 ){
                    JOptionPane.showMessageDialog(null, "Save Failed");
                return;
                } else {
                    
                    JOptionPane.showMessageDialog(this, "Sucessfully Registered");
                    dispose();
                }
            } else {
             
                JOptionPane.showMessageDialog(null, "Incorrect password. Try again.");
                return;
            }
            r_textfullname.setText("");
            r_textusername.setText("");
            r_textpassword.setText("");
            r_textrepassword.setText("");
            r_roleCombo.requestFocus();

        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionUtil.closeConnection(con2);
        }
    }//GEN-LAST:event_r_submitActionPerformed

    private void r_textpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_textpasswordActionPerformed
       
    }//GEN-LAST:event_r_textpasswordActionPerformed

    private void r_textfullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_textfullnameActionPerformed
       
    }//GEN-LAST:event_r_textfullnameActionPerformed

    private void r_textrepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_textrepasswordActionPerformed
      
    }//GEN-LAST:event_r_textrepasswordActionPerformed

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton r_cancel;
    private javax.swing.JLabel r_password;
    private javax.swing.JLabel r_repassword;
    private javax.swing.JLabel r_role;
    private javax.swing.JComboBox<String> r_roleCombo;
    private javax.swing.JButton r_submit;
    private javax.swing.JTextField r_textfullname;
    private javax.swing.JPasswordField r_textpassword;
    private javax.swing.JPasswordField r_textrepassword;
    private javax.swing.JTextField r_textusername;
    private javax.swing.JLabel r_username;
    // End of variables declaration//GEN-END:variables

    private static class insert {

        private static void executeUpdate() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void setString(int i, String Password) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public insert() {
        }
    }
}
