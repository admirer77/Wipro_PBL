/*Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee that will inherit the Person class. 
The other data members of the Employee class are annual salary (double), 
the year the employee started to work, and the national insurance number which is a String. 
Save this in a file called Employee.java
Your class should have the necessary constructors and getter/setter methods.
Write another class called TestEmployee, containing a main method to fully test your class
definition. */

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Manush", 50000.00, 2015, "AB123456C");

        // Test getters
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getStartedYear());
        System.out.println("National Insurance Number: " + employee.getInsuranceNo());

        // Test setters
        employee.setName("Parmesh");
        employee.setAnnualSalary(60000.00);
        employee.setStartedYear(2020);
        employee.setInsuranceNo("CD789012E");

        // Test getters again after using setters
        System.out.println("Updated Name: " + employee.getName());
        System.out.println("Updated Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Updated Year Started: " + employee.getStartedYear());
        System.out.println("Updated National Insurance Number: " + employee.getInsuranceNo());
    }
}
