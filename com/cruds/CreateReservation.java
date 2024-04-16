package com.cruds;
import java.util.Scanner;
import com.queries.DbQueries;
import java.sql.Connection;
public class CreateReservation {

    private static String guestName;
    private static String contactNumber;
    private static int roomNumber;

    public static void createReservation(Connection connection , Scanner scanner){

        System.out.print("Enter the guest name: ");
        guestName = scanner.nextLine();
        System.out.print("Enter the contact number: ");
        contactNumber = scanner.next();
        System.out.print("Enter the  room number: ");
        roomNumber = scanner.nextInt();
        DbQueries.createReservationQuery(connection,guestName,contactNumber,roomNumber);
    }

    public static  String getReservationDetails(){
        return ""+guestName+" "+contactNumber+" "+roomNumber;
    }


}
