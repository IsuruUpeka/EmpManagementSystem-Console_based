package employeemanagementsystemoop;

public class Employee {
  public int id;
  public String name;
  public int age;
  public String password;
  public String desiganation;
  public String department;
  public double salary;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getDesiganation() {
    return desiganation;
  }

  public void setDesiganation(String desiganation) {
    this.desiganation = desiganation;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return (
      "Employee [id=" +
      id +
      ", name=" +
      name +
      ", age=" +
      age +
      ", password=" +
      password +
      ", desiganation=" +
      desiganation +
      ", department=" +
      department +
      ", salary=" +
      salary +
      "]"
    );
  }

  public Employee(
    int id,
    String name,
    int age,
    String password,
    String desiganation,
    String department,
    double salary
  ) {
    super();
    this.id = id;
    this.name = name;
    this.age = age;
    this.password = password;
    this.desiganation = desiganation;
    this.department = department;
    this.salary = salary;
  }
}
