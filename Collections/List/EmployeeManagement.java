import java.util.ArrayList;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void GetEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
    }
}

class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return list.remove(e);
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay Slip for Employee ID " + empId + ": Salary = " + e.salary;
            }
        }
        return "Employee not found.";
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        EmployeeDB empDB = new EmployeeDB();

        Employee e1 = new Employee(1, "John Doe", "john.doe@example.com", "Male", 50000);
        Employee e2 = new Employee(2, "Jane Smith", "jane.smith@example.com", "Female", 60000);

        empDB.addEmployee(e1);
        empDB.addEmployee(e2);

        System.out.println("Employee Details:");
        e1.GetEmployeeDetails();
        e2.GetEmployeeDetails();

        System.out.println("\nPay Slip:");
        System.out.println(empDB.showPaySlip(1));

        System.out.println("\nDeleting Employee with ID 1:");
        empDB.deleteEmployee(1);

        System.out.println("\nPay Slip After Deletion:");
        System.out.println(empDB.showPaySlip(1));
    }
}
