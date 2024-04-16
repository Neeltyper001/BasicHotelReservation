package com.main;
import java.sql.Connection;
import com.databaseConnection.DatabaseConnection;
import com.menu.Exit;
import com.menu.Menu;
import java.util.Scanner;
import com.cruds.*;

public class CoreClass {
       private final DatabaseConnection databaseConnection;
       private final Connection connection;
       private Menu menu;
       private Scanner scanner;

    public CoreClass(){
         this.databaseConnection = new DatabaseConnection();
         this.connection = databaseConnection.getConnection();
         this.scanner = new Scanner(System.in);
         menu = new Menu(this.scanner);


         while(true){
             menu.getMenu();
             switch(menu.getUserChoice()){
                 case 1: CreateReservation.createReservation(connection,scanner);
                     System.out.println(CreateReservation.getReservationDetails());
                     break;

                 case 2: ViewReservation.viewReservation(connection);
                     break;
//
                 case 3: ViewReservation.getRoomNo(connection,scanner);
                     break;

                 case 4: UpdateReservation.updateReservation(connection,scanner);
                     break;
//
                 case 5: DeleteReservation.deleteReservations(connection,scanner);
                     break;

                 case 0:   Exit.exit();
                            System.out.println("Exiting");;
                      break;

                 default:
                     System.out.println("Wrong choice");
         }

         }
    }
}
