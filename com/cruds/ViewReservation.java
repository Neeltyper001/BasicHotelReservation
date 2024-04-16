package com.cruds;
import java.util.Scanner;
import com.queries.DbQueries;
import java.sql.Connection;
public class ViewReservation {

    public static void viewReservation(Connection connection){
        DbQueries.viewReservationQuery(connection);
    }

    public static void getRoomNo(Connection connection, Scanner scanner){
        System.out.print("Enter the reservation id of the guest==> ");
        int reservationId = scanner.nextInt();
        DbQueries.getRoomNoQuery(connection, reservationId);
    }
}
