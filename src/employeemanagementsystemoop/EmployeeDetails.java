package employeemanagementsystemoop;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeDetails {
  HashSet<Employee> empset;

  Scanner sc = new Scanner(System.in);
  boolean found = false;
  int id;
  String name;
  int age;
  String password;
  String department;
  String desiganation;
  double sal;

  public EmployeeDetails() {
    this.empset = new HashSet<Employee>();
  }

  //view all employees
  public void viewAllEmps() {
    for (Employee emp : empset) {
      System.out.println(emp);
    }
  }

  //view emp based on there id
  public void viewEmp() {
    System.out.println("Enter id: ");
    id = sc.nextInt();
    for (Employee emp : empset) {
      if (emp.getId() == id) {
        System.out.println(emp);
        found = true;
      }
    }
    if (!found) {
      System.out.println("Employee with this id is not present");
    }
  }

  //update the employee
  public void updateEmployee() {
    System.out.println("Enter id: ");
    id = sc.nextInt();
    boolean got = false;
    for (Employee emp : empset) {
      if (emp.getId() == id) {
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter new Salary");
        sal = sc.nextDouble();
        emp.setName(name);
        emp.setSalary(sal);
        System.out.println("Updated Details of employee are: ");
        System.out.println(emp);
        got = true;
      }
    }
    if (!got) {
      System.out.println("Employee is not present");
    } else {
      System.out.println("Employee details updated successfully !!");
    }
  }

  //delete emp
  public void deleteEmp() {
    System.out.println("Enter id");
    id = sc.nextInt();
    boolean got = false;
    Employee empdelete = null;
    for (Employee emp : empset) {
      if (emp.getId() == id) {
        empdelete = emp;
        got = true;
      }
    }
    if (!got) {
      System.out.println("Employee is not present");
    } else {
      empset.remove(empdelete);
      System.out.println("Employee deleted successfully!!");
    }
  }

  //add emp
  public HashSet addEmp() {
    System.out.println("Enter id:");
    id = sc.nextInt();
    System.out.println("Enter name");
    name = sc.next();
    System.out.println("Enter age");
    age = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter password");
    password = sc.nextLine();
    System.out.println("enter Desiganation");
    desiganation = sc.next();
    System.out.println("Enter Department");
    department = sc.next();
    System.out.println("Enter sal");
    sc.nextDouble();

    Employee emp = new Employee(
      id,
      name,
      age,
      password,
      desiganation,
      department,
      sal
    );

    empset.add(emp);

    return empset;
  }

  public static void main(String[] args) {}
}
