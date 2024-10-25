/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Management;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jun20
 */
public class UserManagement {
    public boolean checkIfUserExists(String U_Name) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userDetails = line.split("\t");
                 if (userDetails.length > 1 && userDetails[1].equals(U_Name)) {
                    reader.close();
                    return true;  // Username already exists
                }
            }
            reader.close();
        } catch (IOException e) {
     
        }
        return false;  // Username does not exist
    }
}