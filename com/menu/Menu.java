package com.menu;
import java.util.Scanner;
public class Menu {

   private  Scanner scanner;
   int userChoice;
     public Menu (Scanner scanner){
          this.scanner = scanner;
     }

     public void getMenu(){
          System.out.println("******************************************************************************");
          System.out.println("*                                                                            *");
          System.out.println("*                 WELCOME TO OUR HOTEL RESERVATION                           *");
          System.out.println("*                                                                            *");
          System.out.println("*  Please select following options                                           *");
          System.out.println("*                                                                            *");
          System.out.println("*  1. Reserve a room                                                         *");
          System.out.println("*  2. View reservations                                                      *");
          System.out.println("*  3. Get a room number                                                      *");
          System.out.println("*  4. Update reservations                                                    *");
          System.out.println("*  5. Delete reservations                                                    *");
          System.out.println("*  0. Exit                                                                   *");
          System.out.println("*                                                                            *");
          System.out.println("******************************************************************************");
          System.out.println("*                                                                            *");
          System.out.println("*                                                                            *");
          System.out.print("Your choice Sir/Mam?==> ");
          setUserChoice(this.scanner.nextInt());
          this.scanner.nextLine();
     }

     public void setUserChoice(int userChoice){
          this.userChoice = userChoice;
     }

     public int getUserChoice(){
          return this.userChoice;
     }
}
