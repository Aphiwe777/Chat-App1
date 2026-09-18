/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginfeature;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginFeature loginSystem = new LoginFeature();
        
        System.out.println("WELCOME TO IMESSAGE");
        
        //STEP 1- REGISTRATION (ask user for names)
        System.out.println("SIGN UP");
        
        System.out.println("Enter first your name");
        String firstName = scanner.nextLine();
        
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();
        
        //Prompt user for a username and make sure it is properly formatted
        String username;
        while (true) {
            System.out.println("Enter username (Must contain:"
                    + " 1. '_'underscore"
                    + "2. five charactters long)");
            username = scanner.nextLine();
            if (loginSystem.checkUserName(username));
            System.out.println("");
        }
        
    }
    
}
