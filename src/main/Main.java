package main;


import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {

    private static void function1()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give id: ");
        int choice = keyboard.nextInt();
        String query="select name from owner2 where id="+choice+"";

        int flag=1;
        export(query,flag);
    }

    private static void function2()
    {   String query="";

        int flag=1;
        export(query,flag);
    }

    private static void function3()
    {

        int flag=1;
        export(query,flag);
    }

    private static void function4()
    {

        int flag=1;
        export(query,flag);
    }

    private static boolean closemenu()
    {
        return true;
    }

    private static void export(String query, int flag) {
        boolean finished=false;
            do {
                try {
                    Scanner keyboard = new Scanner(System.in);
                    System.out.println("---- Enter export type:");
                    System.out.println("1. File");
                    System.out.println("2. Console");
                    int choice = keyboard.nextInt();
                    if (choice == 1) {

                        toFile();
                        finished = true;
                    } else if (choice == 2) {

                        toConsole(query,flag);
                        finished = true;

                    } else {
                        System.out.println("Invalid Input, choose again.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input, please select one of the given options.");
                }
            } while(!finished);
    }

    private static void toFile()
    {
        }

    private static void toConsole(String query,int flag)
    {
        try {
            connect.SqlConnection.connect(query,flag);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }

    public static void main(String[] args) throws InputMismatchException {
        boolean finished = false;

        while (!finished) {
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("---- Select Functionality to perform:");
                System.out.println("1. Vehicle Insurance status");
                System.out.println("2. Forecoming Expiries");
                System.out.println("3. Expiries by plate");
                System.out.println("4. Fine calculation per owner");
                System.out.println("5. Exit");
                System.out.print("Choose:");
                int choice = keyboard.nextInt();
                switch (choice) {
                    case 1:
                        function1();
                        break;
                    case 2:
                        function2();

                        break;
                    case 3:
                        function3();

                        break;
                    case 4:
                        function4();

                        break;
                    case 5:
                        finished = closemenu();
                        break;
                        default:
                            System.out.println("Please select one of the given options");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input, please select one of the given options.");
            }

        }

    }

}