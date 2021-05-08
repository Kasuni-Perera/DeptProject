
package ui;

import conn.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CourseSearchResult;
import model.Day;
import model.TimeSlot;

/**
 *
 * @author Kasuni Navoda
 */
public class LecturerPage extends javax.swing.JFrame {

    /**
     * Creates new form LecturerPage
     */
    public LecturerPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        l_search = new javax.swing.JButton();
        l_close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchResultTable = new javax.swing.JTable();
        sCCode = new javax.swing.JLabel();
        sDate = new javax.swing.JLabel();
        l_dayCombo = new javax.swing.JComboBox<>();
        idCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText(" Lecturer Page");

        l_search.setText("Search");
        l_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_searchActionPerformed(evt);
            }
        });

        l_close.setText("Close");
        l_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_closeActionPerformed(evt);
            }
        });

        searchResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cource Code", "Day", "Time Slot", "Lecturer", "Halll"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(searchResultTable);

        sCCode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sCCode.setText("Lecturer ID");

        sDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sDate.setText("Date");

        l_dayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        l_dayCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_l_dayComboActionPerformed(evt);
            }
        });

        idCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        idCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sCCode, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sDate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_dayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(l_search, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l_close, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idCombo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sCCode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_dayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(96, 96, 96)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_close, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_searchActionPerformed
        String lecturer_id = this.idCombo.getSelectedItem().toString();
        String day = this.l_dayCombo.getSelectedItem().toString();

        List<CourseSearchResult> resultList = fetchSearchResults(lecturer_id, day);
        if(resultList.isEmpty()){
            JOptionPane.showMessageDialog(this, "No Results Found");
        }
        DefaultTableModel model = (DefaultTableModel) searchResultTable.getModel();
        model.setNumRows(0);
        resultList.forEach(result -> {
            Object[] row = {result.getCourseCode(), result.getDay(), result.getTimeSlot(), result.getLecturer(), result.getHall()};
            model.addRow(row);
        });
    }//GEN-LAST:event_l_searchActionPerformed

    private void l_l_dayComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_l_dayComboActionPerformed
       
    }//GEN-LAST:event_l_l_dayComboActionPerformed

    private void l_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_closeActionPerformed
        dispose();
        LoginPage login = new LoginPage();
        login.setVisible(true);
    }//GEN-LAST:event_l_closeActionPerformed

    private void idComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idComboActionPerformed

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
            java.util.logging.Logger.getLogger(LecturerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {            
                public void run() {
                new LecturerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> idCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton l_close;
    private javax.swing.JComboBox<String> l_dayCombo;
    private javax.swing.JButton l_search;
    private javax.swing.JLabel sCCode;
    private javax.swing.JLabel sDate;
    private javax.swing.JTable searchResultTable;
    // End of variables declaration//GEN-END:variables
void exit(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private List<CourseSearchResult> fetchSearchResults(String lecturer_id, String day){
        Connection conn1 = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<CourseSearchResult> searchResults = new ArrayList<>();
        try {
            conn1 = ConnectionUtil.getConnection();
            if (conn1 == null) {
                JOptionPane.showMessageDialog(null, "Cannot connect to the database. Try again later.");
                return null;
            }
            ps = conn1.prepareStatement("SELECT * FROM course as c, lecturer as l where c.lecturer_id = l.lecturer_id and l.lecturer_id = ? and day = ?");
            ps.setString(1, lecturer_id);
            ps.setString(2, day);
            rs = ps.executeQuery();
            
            while(rs.next()){
                String _courseCode = rs.getString("course_code");
                String _day = rs.getString("day");
                String _timeSlot = rs.getString("time_slot");
                String _lecturer = rs.getString("lecturer_name");
                String _hall = rs.getString("hall_id");
                
                CourseSearchResult result = new CourseSearchResult();
                result.setCourseCode(_courseCode);
                result.setDay(Day.valueOf(_day));
                result.setTimeSlot(TimeSlot.valueOf(_timeSlot));
                result.setLecturer(_lecturer);
                result.setHall(_hall);
                
                searchResults.add(result);

            }
            

        } catch (SQLException ex) {
            Logger.getLogger(LecturerPage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionUtil.closeConnection(conn1);
        }
        return searchResults;
    }

}
