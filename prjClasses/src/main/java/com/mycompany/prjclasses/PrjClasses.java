/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses;

/**
 *
 * @author lab_services_student
 */
public class PrjClasses {
     public static String strSecondClassVar = "Testing";

    public static void main(String[] args) {
        System.out.println("Hello from the 2nd class");
        
        newClass nc = new newClass();//creating a object of new class
        
        nc.helloClass();//have to use nc to communicate with the class
    }
}
