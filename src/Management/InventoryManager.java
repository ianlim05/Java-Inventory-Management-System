/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Management;

import Models.Item;  
import Models.Supplier;
import Models.Hospital;
import Models.Organization;
import Models.Transaction;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.JFrame;

public class InventoryManager {
    private List<Item> items;
    private List<Organization> organizations;
    private List<Transaction> transactions;
    private JFrame previousFrame;

    
    public InventoryManager() {
        this.items = new ArrayList<>();
        this.transactions = new ArrayList<>();
        this.organizations = new ArrayList<>();
    }
    
    public void addOrganization(Organization organization) {
        organizations.add(organization);
    }

    public void deleteOrganizationByCode(String code) {
        organizations.removeIf(org -> org.getCode().trim().equalsIgnoreCase(code.trim()));
    }

    public Organization getOrganizationByCode(String code) {
        for (Organization org : organizations) {
            if (org.getCode().trim().equalsIgnoreCase(code.trim())) {
                return org;
            }
        }
        return null;
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void printOrganizations() {
        for (Organization org : organizations) {
            System.out.println(org.getOrganizationType() + ": " + org.getName() + ", Contact: " + org.getContact());
        }
    }
    
    public void setPreviousFrame(JFrame frame) {
        this.previousFrame = frame;
    }

    public JFrame getPreviousFrame() {
        return this.previousFrame;
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public void removeItem(String itemCode) {
        items.removeIf(item -> item.getItemCode().equals(itemCode));
    }
    
    public Item findItemByCode(String itemCode) {
        for (Item item : items) {
            if (item.getItemCode().equals(itemCode)) {
                return item;
            }
        }
        return null;  // Item not found
    }
    
    public List<Item> getItems() {
        return items;
    }
    
    public List<Transaction> getAllTransactions() {
        return transactions;  // Return the list of all transactions
    }
    
    public List<Item> loadPPEFromFile() throws IOException {
        List<Item> itemList = new ArrayList<>();
        String filePath = "ppe.txt";

        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            // Skip the header line if there is one
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            // Read each line from the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split("\t"); 

                if (data.length == 5) {
                    String itemCode = data[0];
                    String itemName = data[1];
                    String supplierCode = data[2];
                    int quantity = Integer.parseInt(data[3].trim());
                    String lastUpdated = data[4];

                    // Create a new Item object and add it to the list
                    Item item = new Item(itemCode, itemName, supplierCode, quantity, lastUpdated);
                    itemList.add(item);
                }
            }
        } catch (FileNotFoundException e) {
            throw new IOException("File not found: " + filePath, e);
        } catch (NumberFormatException e) {
            throw new IOException("Error parsing number from file: " + e.getMessage(), e);
        }

        return itemList;
    }
    
    public List<Transaction> loadTransactionsFromFile() throws IOException {
        List<Transaction> transactionList = new ArrayList<>();
        String filePath = "transactions.txt";

        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split("\t"); 

                if (data.length == 5) {
                    String transactionType = data[0];  
                    String itemCode = data[1];
                    String supplierCode = data[2];
                    int quantity = Integer.parseInt(data[3].trim());
                    String lastUpdated = data[4];

                    // Create a new Item object with the transactionType and add it to the list
                    Transaction transaction = new Transaction(transactionType, itemCode, supplierCode, quantity, lastUpdated);
                    transactionList.add(transaction);
                }
            }
        } catch (FileNotFoundException e) {
            throw new IOException("File not found: " + filePath, e);
        } catch (NumberFormatException e) {
            throw new IOException("Error parsing number from file: " + e.getMessage(), e);
        }

        return transactionList;
    }
    
    public void updateItemQuantity(String itemCode, int quantityChange) {
        for (Item item : items) {
            if (item.getItemCode().equals(itemCode)) {
                item.updateQuantity(quantityChange);
                break;
            }
        }
    }

    // Method to print total available quantity of all items sorted in ascending order by item code
    public void printTotalQuantity() {
        Collections.sort(items, Comparator.comparing(Item::getItemCode));
        for (Item item : items) {
            System.out.println("Item Code: " + item.getItemCode() + ", Quantity: " + item.getQuantityInStock());
        }
    }


    // Method to track item received during a specific time period (start-Date to end-Date)
    public void trackItemReceived(LocalDateTime startDate, LocalDateTime endDate) {
        for (Item item : items) {
            // Assuming you have a getLastUpdated method in your Item class
            if (!item.getLastUpdated().isBefore(startDate) && !item.getLastUpdated().isAfter(endDate)) {
                System.out.println("Item Code: " + item.getItemCode() + ", Quantity: " + item.getQuantityInStock() + ", Last Updated: " + item.getLastUpdated());
            }
        }
    }

    
    public void loadOrganizationsFromFile(String filePath) throws IOException {
        organizations.clear(); // Clear before loading new data
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split("\t");
                
                if (data.length == 4) {
                    String code = data[0];
                    String name = data[1];
                    String contact = data[2];
                    String address = data[3];

                    
                    if (isSupplier(code)) {
                        organizations.add(new Supplier(code, name, contact, address));
                    } else {
                        organizations.add(new Hospital(code, name, contact, address));
                    }
                }
            }
        }
    }
    private boolean isSupplier(String code) {
        return code.startsWith("SPL"); 
    }

    
    public void updateItemQuantity(String itemCode, String sourceCode, int quantityChange, String sourceType) {
        for (Item item : items) {
            if (item.getItemCode().equals(itemCode)) {
                item.updateQuantity(quantityChange);

                // Log the transaction to a file
                logTransaction(itemCode, sourceCode, quantityChange, sourceType);
                break;
            }
        }
    }
    
    private void logTransaction(String itemCode, String sourceCode, int quantityChange, String sourceType) {
        try (FileWriter writer = new FileWriter("transactions.txt", true)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String dateTime = LocalDateTime.now().format(formatter);
            String transactionType = (sourceType.equals("supplier")) ? "Received" : "Distributed";

            writer.write("Item Code: " + itemCode + ", ");
            writer.write("Source Code: " + sourceCode + ", ");
            writer.write("Quantity: " + quantityChange + " " + transactionType + ", ");
            writer.write("Date-Time: " + dateTime + "\n");
        } catch (IOException e) {
            
        }
    }
    
}
