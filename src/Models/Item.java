package Models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Item {
    private String itemCode;
    private String itemName;
    private String supplierCode;
    private int quantityInStock;
    private LocalDateTime lastUpdated;
    private String transactionType;
   

    // Constructor for PPE items
    public Item(String itemCode, String itemName, String supplierCode, int quantityInStock, String lastUpdated) {  
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.supplierCode = supplierCode;
        this.quantityInStock = quantityInStock;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.lastUpdated = LocalDateTime.parse(lastUpdated, formatter);
    }
    
    
    

    // Getters and setters
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String itemSupplierCode) {
        this.supplierCode = itemSupplierCode;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
        this.lastUpdated = LocalDateTime.now();
    }
    
    public LocalDateTime getLastUpdated(){
        return lastUpdated;
    }
    
    public void setLastUpdated(String lastUpdated) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.lastUpdated = LocalDateTime.parse(lastUpdated, formatter);
    }
    
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    
    // Methods for managing inventory updates
    public void updateQuantity(int quantityChange) {
        this.quantityInStock += quantityChange;
        this.lastUpdated = LocalDateTime.now();
    }
    
    @Override
    public String toString() {
        return "Item{" +
                "itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
    
}

