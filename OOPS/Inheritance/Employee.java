/*Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee that will inherit the Person class. 
The other data members of the Employee class are annual salary (double), 
the year the employee started to work, and the national insurance number which is a String. 
Save this in a file called Employee.java
Your class should have the necessary constructors and getter/setter methods.
Write another class called TestEmployee, containing a main method to fully test your class
definition. */


public class Employee extends Person {
    private double annualsalary;
    private int startedYear;
    private String insuaranceNo;

    public Employee(String name, double annualsalary, int startedYear, String insuaranceNo) {
        super(name); // Call the constructor of the superclass (Person)
        this.annualsalary = annualsalary;
        this.startedYear = startedYear;
        this.insuaranceNo = insuaranceNo;
    }

    public void setAnnualSalary(double annualsalary){
        this.annualsalary = annualsalary;
    }

    public double getAnnualSalary(){
        return annualsalary;
    }

    public void setStartedYear(int startedYear){
        this.startedYear = startedYear;
    }

    public int getStartedYear(){
        return startedYear;
    }

    public void setInsuranceNo(String insuaranceNo){
        this.insuaranceNo = insuaranceNo;
    }

    public String getInsuranceNo(){
        return insuaranceNo;
    }


}
