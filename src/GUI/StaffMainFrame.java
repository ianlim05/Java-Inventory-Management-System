/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Management.InventoryManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




/**
 *
 * @author USER
 */
public class StaffMainFrame extends javax.swing.JFrame {
    
    private SupplierManagementFrame supplierManagementFrame;
    private HospitalManagementFrame hospitalManagementFrame;
    private TransactionManagementFrame inventoryManagementFrame;
    private InitialInventoryManagementFrame initialinventoryManagementFrame;
    
    public StaffMainFrame() {
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

        btnTransactions = new javax.swing.JButton();
        supplierButton = new javax.swing.JButton();
        hospitalButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnInventory = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(170, 15));
        setMinimumSize(new java.awt.Dimension(1100, 610));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1250, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTransactions.setFont(new java.awt.Font("Berlin Sans FB", 1, 25)); // NOI18N
        btnTransactions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transaction.png"))); // NOI18N
        btnTransactions.setText("Transactions");
        btnTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransactionsActionPerformed(evt);
            }
        });
        getContentPane().add(btnTransactions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 250, 70));

        supplierButton.setFont(new java.awt.Font("Berlin Sans FB", 1, 25)); // NOI18N
        supplierButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/supplierlogo.png"))); // NOI18N
        supplierButton.setText("Suppliers");
        supplierButton.setAlignmentY(0.0F);
        supplierButton.setBorder(null);
        supplierButton.setPreferredSize(new java.awt.Dimension(135, 50));
        supplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierButtonActionPerformed(evt);
            }
        });
        getContentPane().add(supplierButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 250, 70));

        hospitalButton.setFont(new java.awt.Font("Berlin Sans FB", 1, 25)); // NOI18N
        hospitalButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hospital.png"))); // NOI18N
        hospitalButton.setText("Hospitals");
        hospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(hospitalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 250, 70));

        jLabel1.setBackground(new java.awt.Color(242, 76, 211));
        jLabel1.setFont(new java.awt.Font("STCaiyun", 1, 28)); // NOI18N
        jLabel1.setText("Personal Protective Equipment (PPE) INVENTORY MANAGEMENT SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 930, 34));

        btnInventory.setFont(new java.awt.Font("Berlin Sans FB", 1, 25)); // NOI18N
        btnInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventory.png"))); // NOI18N
        btnInventory.setText("Inventory");
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 70));

        btnLogout.setFont(new java.awt.Font("Berlin Sans FB", 1, 25)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 250, 70));

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("STAFF");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, -1));

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/side.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 880));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 940));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransactionsActionPerformed
    closeAllFrames();
    
    if (inventoryManagementFrame == null) {
        inventoryManagementFrame = new TransactionManagementFrame();
    }
    positionFrameRelativeToMainFrame(inventoryManagementFrame);
    inventoryManagementFrame.setVisible(true);
    }//GEN-LAST:event_btnTransactionsActionPerformed

    private void supplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierButtonActionPerformed
    closeAllFrames();
    if (supplierManagementFrame == null) {
        supplierManagementFrame = new SupplierManagementFrame();
    }
    positionFrameRelativeToMainFrame(supplierManagementFrame);
    supplierManagementFrame.setVisible(true);
        
    }//GEN-LAST:event_supplierButtonActionPerformed

    private void hospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalButtonActionPerformed
    closeAllFrames();
    if (hospitalManagementFrame == null) {
        hospitalManagementFrame = new HospitalManagementFrame();
    }
    positionFrameRelativeToMainFrame(hospitalManagementFrame);
    hospitalManagementFrame.setVisible(true);
    }//GEN-LAST:event_hospitalButtonActionPerformed

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
        closeAllFrames();
    if (initialinventoryManagementFrame == null) {
        InventoryManager inventoryManager = new InventoryManager(); 
        initialinventoryManagementFrame = new InitialInventoryManagementFrame(inventoryManager); 
    }     
    positionFrameRelativeToMainFrame(initialinventoryManagementFrame);
    initialinventoryManagementFrame.setVisible(true);
    }//GEN-LAST:event_btnInventoryActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        closeAllFrames();
        int confirm = JOptionPane.showConfirmDialog(this, 
        "Are you sure you want to logout?", "Logout Confirmation", 
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (confirm == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed
    
    private void closeAllFrames() {
        if (supplierManagementFrame != null) {
            supplierManagementFrame.setVisible(false);
        }
        if (hospitalManagementFrame != null) {
            hospitalManagementFrame.setVisible(false);
        }
        if (inventoryManagementFrame != null) {
            inventoryManagementFrame.setVisible(false);
        }
        if (initialinventoryManagementFrame != null) {
            initialinventoryManagementFrame.setVisible(false);
        }
    }
    
    private void positionFrameRelativeToMainFrame(JFrame frameToPosition) {
        // Get the location and size of the StaffMainFrame
        int MainFrameX = this.getLocationOnScreen().x;
        int MainFrameY = this.getLocationOnScreen().y;
        int MainFrameWidth = this.getWidth();
        int MainFrameHeight = this.getHeight();

        // Calculate the center position for the frameToPosition
        int frameX = MainFrameX + (MainFrameWidth / 2) - 325;
        int frameY = MainFrameY + (MainFrameHeight / 2) - 310;

        // Set the location for the child frame
        frameToPosition.setLocation(frameX, frameY);
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
            java.util.logging.Logger.getLogger(StaffMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTransactions;
    private javax.swing.JButton hospitalButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton supplierButton;
    // End of variables declaration//GEN-END:variables
}
