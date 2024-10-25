/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author USER
 */
public class Transaction {
    private String itemCode;
    
    private String supplierhospitalCode;
    private int quantityInStock;
    private LocalDateTime lastUpdated;
    private String transactionType;
    
    public Transaction(String transactionType, String itemCode, String supplierhospitalCode, int quantityInStock, String lastUpdated) {
        this.transactionType = transactionType;
        this.itemCode = itemCode;
        this.supplierhospitalCode = supplierhospitalCode;
        this.quantityInStock = quantityInStock;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.lastUpdated = LocalDateTime.parse(lastUpdated, formatter);
    }
    
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    // Getters and setters
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    
    public String getSupplierHospitalCode() {
        return supplierhospitalCode;
    }

    public void setSupplierHospitalCode(String itemSupplierHospitalCode) {
        this.supplierhospitalCode = itemSupplierHospitalCode;
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
    
    public void updateQuantity(int quantityChange) {
        this.quantityInStock += quantityChange;
        this.lastUpdated = LocalDateTime.now();
    }
}
