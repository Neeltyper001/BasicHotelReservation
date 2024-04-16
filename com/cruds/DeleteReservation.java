package com.cruds;

import com.queries.DbQueries;

import java.sql.Connection;
import java.util.Scanner;

public class DeleteReservation {
    public static void deleteReservations(Connection connection , Scanner scanner){
        System.out.println("Enter the reservation id of the guest=> ");
        int reservationId = scanner.nextInt();
        DbQueries.delete(connection,reservationId);
    }
}
