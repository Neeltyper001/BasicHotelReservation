package com.menu;

public class Exit {

    public static void exit(){
        int count = 3;
        System.out.print("Exiting the system");
        try{
            while(count != 0){
                System.out.print(".");
                Thread.sleep(750);
                count--;
            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nThank you for visit");
        System.exit(0);
    }
}
