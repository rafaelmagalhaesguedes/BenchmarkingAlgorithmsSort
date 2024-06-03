package main;

import core.SortService;
import java.util.List;
import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    SortService sort = new SortService();
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    while (!exit) {
      System.out.print("\n+================= Benchmarking Algorithms Sort ===================+");
      System.out.print("\n\n1. Run Benchmarking");
      System.out.print("\n2. Exit");
      System.out.print("\n\nChoose an option: ");

      int choice = 0;
      boolean validChoice = false;

      while (!validChoice) {
        try {
          choice = scanner.nextInt();
          validChoice = true;
        } catch (Exception e) {
          System.out.println("Invalid input. Please enter an integer.");
          scanner.next(); // Clear the invalid input
        }
      }

      switch (choice) {
        case 1:
          int total = 0;
          boolean validInput = false;

          while (!validInput) {
            System.out.print("\nEnter total items: ");
            try {
              total = scanner.nextInt();
              validInput = true;
            } catch (Exception e) {
              System.out.println("Invalid input. Please enter an integer.");
              scanner.next(); // Clear the invalid input
            }
          }

          List<String> items = sort.readExcelData(total);
          String[] itemsArray = items.toArray(new String[0]);

          sort.bubbleSortString(itemsArray);
          sort.mergeSortStrings(itemsArray);

          System.out.println("\n\nPress enter to back to the menu...");
          scanner.nextLine();
          scanner.nextLine();
          break;

        case 2:
          exit = true;
          System.out.println("Exiting the program.");
          break;

        default:
          System.out.println("Invalid choice. Please enter 1 or 2.");
          break;
      }
    }
    scanner.close();
  }
}