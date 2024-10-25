/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author USER
 */
public class Hospital extends Organization{
    public Hospital(String hospitalCode, String name, String contact, String address) {
        super(hospitalCode, name, contact, address);
    }
    @Override
    public String getOrganizationType() {
        return "Hospital";
    }
    
    public String getHospitalCode() {
        return super.getCode();
    }

    

}

