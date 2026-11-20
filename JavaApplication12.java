/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

import java.util.Scanner;
public class JavaApplication12 {

    
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       //System.out.println("Please Password");
       //int i =in.nextInt();
       int password  =1234;
       double balance =2500.75;
       int inputPassword = 0;
        int count=1;
        boolean loggedIn = false;
      while(count <=3){
         System.out.println("Please enter PIN:");
           inputPassword=in.nextInt(); 
            if( inputPassword == password){
          System.out.println("Login successful");
           loggedIn = true;
          break;
             }
          else {count++;}
             }
             if (count == 4) {
             System.out.println("Your account has been locked.");
              }
             int choice;
                  do {
                      System.out.println("1. Check Balance");
                      System.out.println("2. Deposit");
                       System.out.println("3. Withdraw");
                      System.out.println("4. Show Account Status");
                       System.out.println("5. Exit");

                        System.out.println("Choose an option:");
                        choice = in.nextInt();
                       switch (choice) {

    case 1:
        System.out.println("Your balance is: " + balance);
        break;

    case 2:
        System.out.println("Enter deposit amount:");
        double deposit = in.nextDouble();

        if (deposit > 0) {
            balance = balance + deposit;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
        break;

    case 3:
        System.out.println("Enter withdraw amount:");
        double withdraw = in.nextDouble();

        if (withdraw > 0 && withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Withdraw successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
        break;

    case 4:
        if (balance >= 5000) {
            System.out.println("VIP Customer");
        } else if (balance >= 1000) {
            System.out.println("Regular Customer");
        } else {
            System.out.println("Low Balance");
        }
        break;

    case 5:
        System.out.println("Thank you for using our ATM.");
        break;

    default:
        System.out.println("Invalid option.");
}

                  }while ( choice != 5);
          
              
         
          
                         
    
                  } 
}
