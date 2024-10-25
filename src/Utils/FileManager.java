/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.io.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
/**
 *
 * @author USER
 */
public class FileManager {
    public static void saveTableDataToFile(JTable table, String filePath) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            // Write column headers
            for (int i = 0; i < model.getColumnCount(); i++) {
                bw.write(model.getColumnName(i) + "\t");  // Tab-separated or comma-separated
            }
            bw.newLine();  // Move to the next line after headers

            // Write table data
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    bw.write(model.getValueAt(row, col).toString() + "\t");  // Tab-separated values
                }
                bw.newLine();  // Move to the next line after each row
            }
        }
    }

    /**
     * Loads data from a text file and populates the given JTable.
     * 
     * @param table The JTable to populate with data.
     * @param filePath The file path to load the data from.
     * @throws IOException If there is an error while reading from the file.
     */
    public static void loadTableDataFromFile(JTable table, String filePath) throws IOException {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);  // Clear the table before loading new data

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;

            // Read the file line by line
            while ((line = br.readLine()) != null) {
                String[] values = line.split("\t");  // Split by tab, adjust if you use commas
                if (isFirstLine) {
                    // Skip the first line if it's column headers
                    isFirstLine = false;
                    continue;
                }
                model.addRow(values);  // Add each line as a new row in the table
            }
        }
    }
}
