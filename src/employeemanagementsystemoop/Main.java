package employeemanagementsystemoop;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
  static String userType;
  static boolean ordering = true;
  static boolean signedIn = false;
  static HashSet<Employee> empset;

  public static void menu() {
    System.out.println(
      "****************Welcome To Employee Managment System *********** " +
      "\n1. Add Employee " +
      "\n2.View Employee" +
      "\n3.Update Employee" +
      "\n4. Delete Employee" +
      "\n5.View All Employee" +
      "\n6. Exist "
    );
  }

  public static void loginAsAdmin() {
    Scanner sc = new Scanner(System.in);
    Login login = new Login();

    System.out.println("Enter username");
    String username = sc.nextLine();

    System.out.println("Enter password");
    String password = sc.nextLine();

    if (
      username.equalsIgnoreCase(login.username) &&
      password.equalsIgnoreCase(login.password)
    ) {
      signedIn = true;
    } else {
      System.out.println("Invalid login details");
    }
  }

  public static void loginAsEmp() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter id");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter password");
    String pswd = sc.nextLine();

    for (Employee emp : empset) {
      if (id == emp.id && pswd.equalsIgnoreCase(emp.password)) {
        signedIn = true;
        System.out.println(emp);
        break;
      }
    }

    if (!signedIn) {
      System.out.println("Invalid login details");
    }
  }

  public static void loginMenu() {
    Scanner sc = new Scanner(System.in);

    System.out.println(
      "** Welcome To The Employee Managment System of K&D Music Store **" +
      "\n1. Login as Admin " +
      "\n2. Login as Employee"
    );
    int choice = sc.nextInt();
    if (choice == 1) {
      userType = "admin";
      loginAsAdmin();
    } else {
      userType = "employee";
      loginAsEmp();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    EmployeeDetails service = new EmployeeDetails();

    loginMenu();

    if (signedIn && userType.equalsIgnoreCase("admin")) {
      do {
        menu();
        System.out.println("Enter your Choice");
        int choice = sc.nextInt();
        switch (choice) {
          case 1:
            System.out.println("Add Employee");
            empset = service.addEmp();

            break;
          case 2:
            System.out.println("View Employee");
            service.viewEmp();
            break;
          case 3:
            System.out.println("Update Employee");
            service.updateEmployee();
            break;
          case 4:
            System.out.println("Delete Employee");
            service.deleteEmp();
            break;
          case 5:
            System.out.println("view All Employee");
            service.viewAllEmps();
            break;
          case 6:
            signedIn = false;
            userType = "";
            ordering = false;
            loginMenu();
            System.out.println("Thank you for using the application!!");
          default:
            System.out.println("Please enter valid choice");
            break;
        }
      } while (ordering);
    }
  }
}
