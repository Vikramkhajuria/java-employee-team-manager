package se.company.menu;
import se.company.resource.NormalEmployee;
import se.company.resource.Team;
import se.company.resource.SuperEmployee;
import se.company.resource.SuperPower;


import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private Team team;


    public void start() {
        boolean running = true;


        while (running) {
            printMenu();
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextLine()) {
                System.out.println("\nNo input available. Exiting...");
                break;
            }
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1" :
                    team = new Team();
                    System.out.println(team);
                    break;
                case "2" :
                    if (team == null) {
                        System.out.println("No team exists. Create a team first (option 1).");
                        break;
                    }

                    System.out.println("Create new normal employee");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter work: ");
                    String work = scanner.nextLine();

                    System.out.print("Enter salary: ");
                    int salary = Integer.parseInt(scanner.nextLine());



                    NormalEmployee norm = new NormalEmployee(name, work, salary);
                    team.add(norm);
                    System.out.println(team);
                    break;
                case "3" :
                    if (team == null) {
                        System.out.println("No team exists. " +
                                "Create a team first (option 1).");
                        break;
                    }
                    NormalEmployee jane = new NormalEmployee("Jane Doe", "IT", 30000);
                    NormalEmployee john = new NormalEmployee("John Doe", "Economic", 30000);
                    NormalEmployee jr   = new NormalEmployee("Little JR Doe", "Trainee", 1000);

                    team.add(jane);
                    team.add(john);
                    team.add(jr);

                    System.out.println(team);
                    break;
                case  "4" :
                    if (team == null) {
                        System.out.println("No team exists. " +
                                "Create a team first (option 1).");
                        break;
                    }
                    System.out.println(team.work());
                    break;
                case "5":
                    if (team == null) {
                        System.out.println("No team exists. " +
                                "Create a team first (option 1).");
                        break;
                    }
                    System.out.println("# Create new SuperEmployee");
                    System.out.print(" Enter name: ");
                    String sName = scanner.nextLine();

                    System.out.print(" Enter work: ");
                    String sWork = scanner.nextLine();

                    SuperEmployee sup = new SuperEmployee(sName, sWork);
                    team.add(sup);

                    System.out.println(team);
                    break;
                case "6":
                    if (team == null) {
                        System.out.println("No team exists. Create a team first (option 1).");
                        break;
                    }
                    SuperPower flight = new SuperPower("Flight", "Fly at supersonic speeds.");
                    SuperPower strength = new SuperPower("Strength", "Really strong to lift a house.");
                    SuperPower invisibility = new SuperPower("Invisibility", "Become invisible to the naked eye.");

                    SuperEmployee clark = new SuperEmployee("Clark Kent", "IT");
                    clark.addPower(flight);
                    clark.addPower(strength);

                    SuperEmployee jessica = new SuperEmployee("Jessica Jones", "Investigations");
                    jessica.addPower(strength);
                    jessica.addPower(flight);

                    SuperEmployee wade = new SuperEmployee("Wade Wilson", "Public relations");
                    wade.addPower(invisibility);
                    wade.addPower(strength);

                    // Add them to the team
                    team.add(clark);
                    team.add(jessica);
                    team.add(wade);

                    System.out.println(team);
                    break;

                case "7":
                    break;
                case "m":
                    printMenu();
                    break;
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
        System.out.println("| m) Print menu");
        System.out.println("| qQ) Quit");
        System.out.println(" -----------------");
    }

}
