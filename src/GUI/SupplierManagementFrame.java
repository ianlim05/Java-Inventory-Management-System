/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Models.Supplier;
import Management.InventoryManager;
import Utils.FileManager;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author USER
 */
public class SupplierManagementFrame extends javax.swing.JFrame {
    private InventoryManager inventoryManager;
    private DefaultTableModel tableModel;
    
    
    public SupplierManagementFrame() {
        initComponents();
        
        
        inventoryManager = new InventoryManager(); // Initialize InventoryManager
        tableModel = (DefaultTableModel) tableSupplier.getModel(); // Get table model from JTable
        loadSuppliersToTable(); // Load existing suppliers into the table
    }
    private void loadSuppliersToTable() {
        String filePath = "suppliers.txt";  
        try {
            // Check if file exists, if not create it
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile(); // Creates an empty hospitals.txt file if it doesn't exist
            }
            // Load data into the tableSupplier
            FileManager.loadTableDataFromFile(tableSupplier, filePath);  

            inventoryManager.loadOrganizationsFromFile(filePath);  

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading supplier data: " + e.getMessage());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableSupplier = new javax.swing.JTable();
        btnAddSupplier = new javax.swing.JButton();
        btnUpdateSupplier = new javax.swing.JButton();
        btnDeleteSupplier = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSupplierName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSupplierContact = new javax.swing.JTextField();
        btnClearAll = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSupplierAddress = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setLocation(new java.awt.Point(440, 120));
        setUndecorated(true);

        tableSupplier.setBackground(new java.awt.Color(204, 204, 255));
        tableSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Contact", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSupplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSupplier);
        if (tableSupplier.getColumnModel().getColumnCount() > 0) {
            tableSupplier.getColumnModel().getColumn(0).setPreferredWidth(5);
            tableSupplier.getColumnModel().getColumn(1).setPreferredWidth(10);
            tableSupplier.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        btnAddSupplier.setBackground(new java.awt.Color(153, 255, 153));
        btnAddSupplier.setText("ADD");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });

        btnUpdateSupplier.setBackground(new java.awt.Color(153, 255, 255));
        btnUpdateSupplier.setText("UPDATE");
        btnUpdateSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSupplierActionPerformed(evt);
            }
        });

        btnDeleteSupplier.setBackground(new java.awt.Color(255, 102, 102));
        btnDeleteSupplier.setText("DELETE");
        btnDeleteSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSupplierActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("UA Cadet", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("SUPPLIER MANAGEMENT");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address");

        btnClearAll.setBackground(new java.awt.Color(0, 255, 204));
        btnClearAll.setText("CLEAR ALL");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });

        closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png"))); // NOI18N
        closebutton.setAlignmentY(0.0F);
        closebutton.setBorderPainted(false);
        closebutton.setMinimumSize(new java.awt.Dimension(50, 50));
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Contact");

        txtSupplierAddress.setColumns(20);
        txtSupplierAddress.setRows(5);
        jScrollPane2.setViewportView(txtSupplierAddress);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnAddSupplier)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnUpdateSupplier)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnDeleteSupplier))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(txtSupplierContact, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnClearAll)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(168, 168, 168)
                        .addComponent(closebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(closebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClearAll)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13)
                        .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addComponent(txtSupplierContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdateSupplier)
                            .addComponent(btnDeleteSupplier)
                            .addComponent(btnAddSupplier))
                        .addGap(0, 180, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        clearFields();
        
        btnAddSupplier.setEnabled(true);
        btnUpdateSupplier.setEnabled(false);
    }//GEN-LAST:event_btnClearAllActionPerformed

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closebuttonActionPerformed

    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed
        String code = generateSupplierCode();
        String name = txtSupplierName.getText();
        String contact = txtSupplierContact.getText();
        String address = txtSupplierAddress.getText();
        
        String contactNumDash = "^[0-9-]+$";
        if (name.isEmpty() || contact.isEmpty() || address.isEmpty()){
            JOptionPane.showMessageDialog(this, "All fields must be filled before adding a supplier!", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else if (!contact.matches(contactNumDash)){
            JOptionPane.showMessageDialog(this, "Contact can only contain numbers and dashes!", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {
        // Create a new Supplier object
        Supplier supplier = new Supplier(code, name.trim(), contact.trim(), address.trim());

        // Use InventoryManager to add the new supplier
        inventoryManager.addOrganization(supplier);

        // Update the table to reflect the new supplier
        tableModel.addRow(new Object[]{supplier.getSupplierCode(), supplier.getName(), supplier.getContact(), supplier.getAddress()});
        saveSuppliersToFile();
        clearFields();
        }
    }//GEN-LAST:event_btnAddSupplierActionPerformed
    
    private String generateSupplierCode() {
        String prefix = "SPL";  
        int maxCodeNumber = 0;

        
        for (int i = 0; i < tableSupplier.getRowCount(); i++) {
            String currentCode = tableSupplier.getValueAt(i, 0).toString();

            if (currentCode.startsWith(prefix)) {
                // Extract the numeric part of the code and parse it to an integer
                int currentNumber = Integer.parseInt(currentCode.substring(3));
                if (currentNumber > maxCodeNumber) {
                    maxCodeNumber = currentNumber;
                }
            }
        }

        // Increment the highest code number by 1 to generate the new code
        int nextCodeNumber = maxCodeNumber + 1;
        return prefix + String.format("%03d", nextCodeNumber);  
    }
    
    private void tableSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSupplierMouseClicked
        int index = tableSupplier.getSelectedRow();
        TableModel model = tableSupplier.getModel();
        String code = model.getValueAt (index, 0).toString();
        String name = model.getValueAt(index, 1).toString();
        String contact = model.getValueAt(index, 2).toString();
        String address = model.getValueAt(index, 3).toString();
        
        
        txtSupplierName.setText(name);
        txtSupplierContact.setText(contact);
        txtSupplierAddress.setText(address);
        
           
        txtSupplierName.setEditable(true);   
        txtSupplierContact.setEditable(true);
        txtSupplierAddress.setEditable(true);
    
        btnAddSupplier.setEnabled(false);
        btnUpdateSupplier.setEnabled(true);
    }//GEN-LAST:event_tableSupplierMouseClicked

    private void btnUpdateSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSupplierActionPerformed
        int selectedRow = tableSupplier.getSelectedRow();
        if (selectedRow != -1) {               
            String supplierCode = tableSupplier.getValueAt(selectedRow, 0).toString();  // Supplier code as a String
            // Retrieve supplier using the supplier code
            Supplier supplier = (Supplier) inventoryManager.getOrganizationByCode(supplierCode);
        if (supplier != null) {
            
            supplier.setName(txtSupplierName.getText());
            supplier.setContact(txtSupplierContact.getText());
            supplier.setAddress(txtSupplierAddress.getText());
            
           
            
            TableModel model = tableSupplier.getModel();
            model.setValueAt(supplier.getSupplierCode(), selectedRow, 0);  
            model.setValueAt(supplier.getName(), selectedRow, 1);  
            model.setValueAt(supplier.getContact(), selectedRow, 2);
            model.setValueAt(supplier.getAddress(), selectedRow, 3);
            saveSuppliersToFile();
        } else {
            // Handle the case where the supplier was not found
            JOptionPane.showMessageDialog(this, "Supplier not found!");
        }
        }
    }//GEN-LAST:event_btnUpdateSupplierActionPerformed

    private void btnDeleteSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSupplierActionPerformed
        int selectedRow = tableSupplier.getSelectedRow();  // Get the selected row
        if (selectedRow != -1) {  // Check if a row is selected
            // Confirm deletion
            int confirm = JOptionPane.showConfirmDialog(null, 
                    "Are you sure you want to delete this supplier?", "Delete Supplier", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                // Get the supplier code from the selected row (primary key)
                TableModel model = tableSupplier.getModel();
                String code = model.getValueAt(selectedRow, 0).toString();
                

                // Remove supplier from InventoryManager
                inventoryManager.deleteOrganizationByCode(code);

                // Remove the row from the table
                DefaultTableModel tableModel = (DefaultTableModel) tableSupplier.getModel();
                tableModel.removeRow(selectedRow);

                // Clear text fields
                
                txtSupplierName.setText("");
                txtSupplierContact.setText("");
                txtSupplierAddress.setText("");

                // Reset buttons
                btnAddSupplier.setEnabled(true);
                btnUpdateSupplier.setEnabled(false);

                // Save the updated table data to the file
                savedeletedSuppliersToFile();

                JOptionPane.showMessageDialog(this, "Supplier deleted successfully.");
            }
        } else {
            // No row selected
            JOptionPane.showMessageDialog(this, "Please select a supplier to delete.");
        }
    
    }//GEN-LAST:event_btnDeleteSupplierActionPerformed

    
    
    
    private void saveSuppliersToFile() {
        String filePath = "suppliers.txt";  
        try {
            FileManager.saveTableDataToFile(tableSupplier, filePath);
            JOptionPane.showMessageDialog(this, "Supplier data saved successfully");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving supplier data: " + e.getMessage());
        }
    }
    
    private void savedeletedSuppliersToFile() {
        String filePath = "suppliers.txt";  
        try {
            FileManager.saveTableDataToFile(tableSupplier, filePath);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving supplier data: " + e.getMessage());
        }
    }
    
    private void clearFields() {
        
        txtSupplierName.setText("");
        txtSupplierContact.setText("");
        txtSupplierAddress.setText("");
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
            java.util.logging.Logger.getLogger(SupplierManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierManagementFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnDeleteSupplier;
    private javax.swing.JButton btnUpdateSupplier;
    private javax.swing.JButton closebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableSupplier;
    private javax.swing.JTextArea txtSupplierAddress;
    private javax.swing.JTextField txtSupplierContact;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables

}
