/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author USER
 */
public class Supplier extends Organization{
    public Supplier(String supplierCode, String name, String contact, String address) {
        super(supplierCode, name, contact, address);
    }
    @Override
    public String getOrganizationType() {
        return "Supplier";
    }
    public String getSupplierCode() {
        return super.getCode();
    }

}

