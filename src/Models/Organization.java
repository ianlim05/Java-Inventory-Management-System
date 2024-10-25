/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author USER
 */
public abstract class Organization {
    protected String code;
    protected String name;
    protected String contact;
    protected String address;
    
    public Organization(String code, String name, String contact, String address) {
        this.code = code;
        this.name = name;
        this.contact = contact;
        this.address = address;
    }
    // Abstract method to be implemented by subclasses
    public abstract String getOrganizationType();
    
    // Getters and setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

}
