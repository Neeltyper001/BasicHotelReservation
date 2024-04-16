package com.menu;

import java.util.Scanner;

public class UpdationMenu {
   private static int userChoice;

    public static void getMenu(){
        System.out.println("******************************************************************************");
        System.out.println("*                                                                            *");
        System.out.println("*                 WHAT YOU WOULD LIKE TO UPDATE                              *");
        System.out.println("*                                                                            *");
        System.out.println("*  Please select following options                                           *");
        System.out.println("*                                                                            *");
        System.out.println("*  1. Update guest name                                                      *");
        System.out.println("*  2. Update guest room                                                      *");
        System.out.println("*  3. Update guest contact                                                   *");
        System.out.println("*  4. Update all                                                             *");
        System.out.println("*  0. Exit                                                                   *");
        System.out.println("*                                                                            *");
        System.out.println("******************************************************************************");
        System.out.println("*                                                                            *");
        System.out.println("*                                                                            *");
        System.out.print("Your choice Sir/Mam?==> ");
    }


    public static int getUserChoice(Scanner scanner){
        userChoice = scanner.nextInt();
        scanner.nextLine();
        return userChoice;
    }
}
