/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginfeature;

/**
 *
 * @author Student
 */
import java.util.regex.Pattern; 

public class LoginFeature {
        
        private String registeredUsername;
        private String registeredPassword;
        private String registeredphoneNumber;
        private String firstName;
        private String lastName;
        
 //Constructors to initialize
        public LoginFeature() {
        }
        public LoginFeature(String firstame, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName; 
        }
        
        //METHOD 1 = check username is <= 5 characters and contains underscore
        public boolean checkUserName(String Username) {
        if (Username == null) return false;
        return Username.contains("_") && Username.length() <=5;
        }
        
        //MEHTOD 2 = check password complexity
        public boolean checkPasswordComplexity(String password){
        if (password == null) return false;
        
        boolean isLongEnough = password.length() >= 8;
        boolean hasCapitalLetter = !password.equals(password.toLowerCase()) && password.matches(".*[A-Z].*");
        boolean hasNumber = password.matches (".*[0-9].*");
        boolean hasSpecialCase = password.matches(".*[^a-zA-Z0-9].*");
        
        return isLongEnough && hasCapitalLetter && hasNumber && hasSpecialCase;                     
    }
