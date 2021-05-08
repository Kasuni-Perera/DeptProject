
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
public class StudentPage extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public StudentPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sCCode = new javax.swing.JLabel();
        sDate = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        close = new javax.swing.JButton();
        courseCodeCombo = new javax.swing.JComboBox<>();
        dayCombo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchResultTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Search Course");

        sCCode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sCCode.setText("Course Code");

        sDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sDate.setText("Date");

        search.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        close.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        courseCodeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COSC22523", "COSC22522", "STAT22523", "STAT22522", "PMAT22523", "PMAT22522" }));
        courseCodeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCodeComboActionPerformed(evt);
            }
        });

        dayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        dayCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayComboActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sCCode, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(courseCodeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(sDate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(search)
                        .addGap(215, 215, 215)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(257, 257, 257))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sCCode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseCodeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(search))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        dispose(); 
        LoginPage login = new LoginPage();
                    login.setVisible(true);
    }//GEN-LAST:event_closeActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       
        String courseCode = this.courseCodeCombo.getSelectedItem().toString();
        String day = this.dayCombo.getSelectedItem().toString();

        List<CourseSearchResult> resultList = fetchSearchResults(courseCode, day);
        if(resultList.isEmpty()){
            JOptionPane.showMessageDialog(this, "No Results Found");
        }
        DefaultTableModel model = (DefaultTableModel) searchResultTable.getModel();
        model.setNumRows(0);
        resultList.forEach(result -> {
            Object[] row = {result.getCourseCode(), result.getDay(), result.getTimeSlot(), result.getLecturer(), result.getHall()};
            model.addRow(row);
        });
    }//GEN-LAST:event_searchActionPerformed

    private void courseCodeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseCodeComboActionPerformed
       
    }//GEN-LAST:event_courseCodeComboActionPerformed

    private void dayComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayComboActionPerformed
     
    }//GEN-LAST:event_dayComboActionPerformed

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
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JComboBox<String> courseCodeCombo;
    private javax.swing.JComboBox<String> dayCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel sCCode;
    private javax.swing.JLabel sDate;
    private javax.swing.JButton search;
    private javax.swing.JTable searchResultTable;
    // End of variables declaration//GEN-END:variables

    void exit(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private List<CourseSearchResult> fetchSearchResults(String courseCode, String day){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<CourseSearchResult> searchResults = new ArrayList<>();
        try {
            conn = ConnectionUtil.getConnection();
            if (conn == null) {
                JOptionPane.showMessageDialog(null, "Cannot connect to the database. Try again later.");
                return null;
            }
            ps = conn.prepareStatement("SELECT * FROM course as c, lecturer as l where c.lecturer_id = l.lecturer_id and course_code = ? and day = ?");
            ps.setString(1, courseCode);
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
            Logger.getLogger(StudentPage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionUtil.closeConnection(conn);
        }
        return searchResults;
    }
}
