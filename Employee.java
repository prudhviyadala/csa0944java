public class Employee {
    private String name;
    private int age;
    private double monthlySalary;
    public Employee(String name, int age, double monthlySalary) {
        this.name = name;
        this.age = age;
        this.monthlySalary = monthlySalary;
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
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public double calculateAnnualSalary() throws IllegalArgumentException {
        if (monthlySalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        return monthlySalary * 12;
    }
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee("John Doe", 30, 5000);
            System.out.println("Annual Salary of " + emp1.getName() + ": " + emp1.calculateAnnualSalary());
            Employee emp2 = new Employee("Jane Smith", 25, -3000);
            System.out.println("Annual Salary of " + emp2.getName() + ": " + emp2.calculateAnnualSalary());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
