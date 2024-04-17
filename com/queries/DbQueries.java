package com.queries;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
public class DbQueries {

  public static void createReservationQuery(Connection connection , String guestName , String contactNumber , int roomNumber){
        String createReservationQuery = String.format("INSERT INTO reservations (guest_name, room_no, contact) VALUES (\"%s\",\"%d\",\"%s\")",guestName,roomNumber,contactNumber);
        try{
            Statement statement = connection.createStatement();
            int resultSet = statement.executeUpdate(createReservationQuery);
            System.out.println("Successfull insertion!!"+resultSet+" rows affected");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void viewReservationQuery(Connection connection){
        String viewReservationQuery = "SELECT * from reservations;";
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(viewReservationQuery);
            System.out.println("=====================================================================================================");
            System.out.println("=                                                                                                   =");
            System.out.println("=   id          guest_name            room_no           contact                 reservation_date    =");
            System.out.println("=                                                                                                   =");
            while(resultSet.next()){
                int id = resultSet.getInt("reservation_id");
                String guestName = resultSet.getString("guest_name");
                int roomNumber = resultSet.getInt("room_no");
                String contact = resultSet.getString("contact");
                String reservationDate = resultSet.getTimestamp("reservation_date").toString();
                System.out.println("=   "+id+"           "+guestName+"            "+roomNumber+"              "+contact+"               "+reservationDate+" =");
            }
            resultSet.close();
            statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void getRoomNoQuery(Connection connection,int reservationId){
        String getRoomNoQuery = String.format("SELECT reservation_id, room_no from reservations where reservation_id = %d",reservationId);
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getRoomNoQuery);
            System.out.println("=====================================================================================================");
            System.out.println("=                                                                                                   =");
            while(resultSet.next()){
                int reservationID = resultSet.getInt("reservation_id");
                int roomNo = resultSet.getInt("room_no");
                System.out.println("Room No: "+roomNo+" ReservationId: "+reservationID);
                System.out.println("=                                                                                                   =");
                System.out.println("=====================================================================================================");
            }
            resultSet.close();
            statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());

        }

    }

    public static void updateGuestNameQuery(Connection connection, int reservationId,String updatedName){
         String updateGuestNameQuery = String.format("UPDATE reservations SET guest_name = \"%s\" where reservation_id = %d",updatedName,reservationId);

        try{
            Statement statement = connection.createStatement();
            int resultSet = statement.executeUpdate(updateGuestNameQuery);
            System.out.println("Successfull updation!!"+resultSet+" rows affected");
            statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public static void updateGuestRoomQuery(Connection connection, int reservationId, int updatedRoom){
        String updateGuestRoomQuery = String.format("UPDATE reservations SET room_no = %d where reservation_id = %d",updatedRoom,reservationId);

        try{
            Statement statement = connection.createStatement();
            int resultSet = statement.executeUpdate(updateGuestRoomQuery);
            System.out.println("Successfull updation!!"+resultSet+" rows affected");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public static void updateGuestContactQuery(Connection connection, int reservationId, String updatedContact){
        String updateGuestContactQuery = String.format("UPDATE reservations SET contact = \"%s\" where reservation_id = %d",updatedContact,reservationId);

        try{
            Statement statement = connection.createStatement();
            int resultSet = statement.executeUpdate(updateGuestContactQuery);
            System.out.println("Successfull updation!!"+resultSet+" rows affected");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void updateAll(Connection connection, int reservationId,String updatedName, int updatedRoom, String updatedContact){
        String updateGuestContactQuery = String.format("UPDATE reservations SET guest_name = \"%s\" , room_no = %d , contact = \"%s\" where reservation_id = %d",updatedName,updatedRoom,updatedContact,reservationId);

        try{
            Statement statement = connection.createStatement();
            int resultSet = statement.executeUpdate(updateGuestContactQuery);
            System.out.println("Successfull updation!!"+resultSet+" rows affected");
            statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void delete(Connection connection, int reservationId){
        String updateGuestContactQuery = String.format("DELETE FROM reservations where reservation_id = %d",reservationId);

        try{
            Statement statement = connection.createStatement();
            int resultSet = statement.executeUpdate(updateGuestContactQuery);
            System.out.println("Successfull updation!!"+resultSet+" rows affected");
            statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}


