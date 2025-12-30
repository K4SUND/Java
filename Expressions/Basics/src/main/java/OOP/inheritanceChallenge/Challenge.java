package OOP.inheritanceChallenge;

public class Challenge {

    public static void main(String[] args) {
        SalariedEmployee joe = new SalariedEmployee("joe", "2001_09_02", "2025_11_26", 40000);
        HourlyEmployee mary = new HourlyEmployee("mary", "2001_09_02", "2025_11_26", 40);


        System.out.println(joe);
        System.out.println(joe.getAge());
        System.out.println(joe.collectPay());
        joe.retire();
        System.out.println(joe);
        System.out.println(joe.collectPay());

        System.out.println(mary);
        System.out.println(mary.getAge());
        System.out.println(mary.collectPay());
        mary.getDoublePay();
        mary.terminate("2025_05_02");
        System.out.println(mary);



    }


}

class Worker {
    private String name;
    private String birthday;

    // use in sub classes
    protected String endDate;


    // end data is not included
    // it is protected -- can be add using sub classes
    public Worker(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int getAge() {


        //substring --> start index , length
        int birthYear = Integer.parseInt(birthday.substring(0, 4));
//        System.out.println(birthYear);
        return 2025 - birthYear;

    }


    // overriden by the subclasses
    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
//        System.out.println("Terminated");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}


class Employee extends Worker {

    private static int employeeNo = 1;
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthday, String hireDate) {
        super(name, birthday);
        employeeId = employeeNo++;  // employeeNo = employeeNo+1  , employeeId = employeeNo
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthday, String hireDate, double annualSalary) {
        super(name, birthday, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire() {
        terminate("2025_05_26");
        isRetired = true;
    }

    @Override
    public double collectPay() {
        // retired ( 90%)
        double payCheck = annualSalary / 26;
        double adjustedPay = isRetired ? payCheck * 0.9 : payCheck;
        return (int) adjustedPay;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "isRetired=" + isRetired +
                ", annualSalary=" + annualSalary +
                "} " + super.toString();
    }
}


class HourlyEmployee extends Employee {

    private double hourlyPayRate;


    public HourlyEmployee(String name, String birthday, String hireDate, double hourlyPayRate) {
        super(name, birthday, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }


    // week
    // 40 hours
    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}