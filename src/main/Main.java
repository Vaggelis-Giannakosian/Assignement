package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void function1()
    {
    }

    public static void function2()
    {
    }

    public static void function3()
    {
    }

    public static void function4()
    {
    }

    public static boolean closemenu()
    {
        boolean finished = true;
        return finished;
    }

    public static void export() {
        boolean finished=false;
            while(!finished){
                try {
                    Scanner keyboard = new Scanner(System.in);
                    System.out.println("---- Enter export type:");
                    System.out.println("1. File");
                    System.out.println("2. Console");
                    int choice = keyboard.nextInt();
                    if (choice == 1) {
                        finished=true;
                        toFile();
                    } else if (choice == 2){
                        toConsole();
                        finished=true;
                    }
                    else {
                        System.out.println("Invalid Input, choose again.");
                    }
                }
                catch (InputMismatchException e) {
                  System.out.println("Invalid Input, please select one of the given options.");
          }
        }
    }

    public static void toFile()
    {
        }

    public static void toConsole()
    {
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
                        export(;
                        break;)
                    case 2:
                        function2();
                        export();
                        break;
                    case 3:
                        function3();
                        export();
                        break;
                    case 4:
                        function4();
                        export();
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