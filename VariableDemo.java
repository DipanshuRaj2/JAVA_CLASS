import java.util.Scanner;

public class VariableDemo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int option;

    System.out.println("Welcome to the Courier Management System");
    do {
      System.out.println("1. Add a new package");
      System.out.println("2. Track a package");
      System.out.println("3. List all packages");
      System.out.println("4. Exit");
      System.out.print("Choose an option: ");
      option = scanner.nextInt();
      switch (option) {
        case 1:
          addPackage();
          break;
        case 2:
          trackPackage();
          break;
        case 3:
          listPackages();
          break;
        case 4:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid option. Try again.");
      }
    } while (option != 4);
  }

  private static void addPackage() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter package name: ");
    String name = scanner.nextLine();
    System.out.print("Enter sender name: ");
    String sender = scanner.nextLine();
    System.out.print("Enter recipient name: ");
    String recipient = scanner.nextLine();
    System.out.println("Package added successfully.");
  }

  private static void trackPackage() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter package name: ");
    String name = scanner.nextLine();
    System.out.println("Package found.");
    System.out.println("Sender: John Doe");
    System.out.println("Recipient: Jane Doe");
    System.out.println("Status: In Transit");
  }

  private static void listPackages() {
    System.out.println("Package 1");
    System.out.println("Package 2");
    System.out.println("Package 3");
  }
}  