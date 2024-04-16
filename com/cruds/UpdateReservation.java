package com.cruds;

import java.sql.Connection;
import java.util.Scanner;
import com.queries.DbQueries;
import com.menu.UpdationMenu;
public class UpdateReservation {
    private static int userChoice;

    public static void updateReservation(Connection connection, Scanner scanner){
        boolean isExitLoop = false;
        while(true){
            UpdationMenu.getMenu();
            userChoice = UpdationMenu.getUserChoice(scanner);

            switch(userChoice){

                case 1: updateGuestName(connection, scanner); break;
                case 2: updateGuestRoom(connection, scanner); break;
                case 3: updateGuestContact(connection,scanner); break;
                case 4: updateAll(connection, scanner); break;
                case 0: isExitLoop = true;
                default:
                    System.out.println("Invalid choice !!");
                }

                if(isExitLoop){
                    break;
                }
            }
        }


    private static void updateGuestName(Connection connection, Scanner scanner){
        System.out.print("Enter the reservation id of the guest==> ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the new guest name==> ");
        String updatedName = scanner.nextLine();
        DbQueries.updateGuestNameQuery(connection,id,updatedName);
    }

    private static void updateGuestRoom(Connection connection , Scanner scanner){
        System.out.print("Enter the reservation id of the guest==> ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the new guest room number==> ");
        int updatedRoom = scanner.nextInt();
        DbQueries.updateGuestRoomQuery(connection,id,updatedRoom);
    }

    private static void updateGuestContact(Connection connection, Scanner scanner){
        System.out.print("Enter the reservation id of the guest==> ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the new guest contact==> ");
        String updatedContact = scanner.nextLine();
        DbQueries.updateGuestContactQuery(connection,id,updatedContact);
    }

    private static void updateAll(Connection connection , Scanner scanner){
        System.out.print("Enter the reservation id of the guest==> ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the new guest name==> ");
        String updatedName = scanner.nextLine();
        System.out.print("Enter the new guest room number==> ");
        int updatedRoom = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the new guest contact==> ");
        String updatedContact = scanner.nextLine();
        DbQueries.updateAll(connection,id,updatedName,updatedRoom,updatedContact);
    }
}
