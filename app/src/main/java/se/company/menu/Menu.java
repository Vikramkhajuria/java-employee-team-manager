package se.company.menu;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    public void start() {
        boolean running = true;
        printMenu();

        while (running) {
            System.out.print("Enter your choice: ");
            // Using string as choice because of q and Q
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" :
                    System.out.println("This is 1");
                    break;
                case "2" :
                    System.out.println("This is 2");
                    break;
                case "3" :
                    System.out.println("This is 3");
                    break;
                case  "4" :
                    System.out.println("This is 4");
                    break;
                case "5":
                    System.out.println("This is 5");
                    break;
                case "6":
                    System.out.println("This is 6");
                    break;
                case "7":
                    System.out.println("This is 7");
                    break;
                case "m":
                    System.out.println("This is m");
                case "q":
                case "Q":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public void printMenu() {
        System.out.println(" -----------------");
        System.out.println("| 1) Create a new empty team");
        System.out.println("| 2) Add normal employee to team");
        System.out.println("| 3) Add John, Jane and little Jr");
        System.out.println("| 4) Print out work being done");
        System.out.println("| 5) Add super employee to team");
        System.out.println("| 6) Add three super employee, with powers, to team");
        System.out.println("| 7) Salary report");
        System.out.println("| m) Print menu");
        System.out.println("| qQ) Quit");
        System.out.println(" -----------------");
    }

}
