import java.time.LocalDate;

class Employee {
    private String name;
    private double salary;
    private int hireYear;

    public Employee(String name, double salary, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
    }

    public Employee(String ramesh, int salary, double v, String s) {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - hireYear;
    }
}

class PermanentEmployee extends Employee {
    public PermanentEmployee(String name, double salary, int hireYear) {
        super(name, salary, hireYear);
    }
}

class TemporaryEmployee extends Employee {
    private int contractDuration; // Duration of contract in years

    public TemporaryEmployee(String name, double salary, int hireYear, int contractDuration) {
        super(name, salary, hireYear);
        this.contractDuration = contractDuration;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    // Override calculateYear() method for TemporaryEmployee
   // @Override
    public int calculateYear() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int yearsOfService = currentYear - getHireYear();
        return Math.min(yearsOfService, contractDuration); // Return the minimum of actual years of service and contract duration
    }
}

public class Rohit {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee("Tushar Lohara", 150000, 2010);
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee("Mikha Jena", 140000, 2018,4);

        System.out.println("Permanent Employee:");
        System.out.println("Name: " + permanentEmployee.getName());
        System.out.println("Salary: " + permanentEmployee.getSalary());
        System.out.println("Years of Service: " + permanentEmployee.calculateYearsOfService());

        System.out.println("\nTemporary Employee:");
        System.out.println("Name: " + temporaryEmployee.getName());
        System.out.println("Salary: " + temporaryEmployee.getSalary());
        System.out.println("Years of Service: " + temporaryEmployee.calculateYearsOfService());
        System.out.println("Contract Duration: " + temporaryEmployee.getContractDuration());
    }
}
