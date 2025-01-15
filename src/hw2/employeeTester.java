package hw2;

public class employeeTester {
    public static void main(String[] args) {
        Employee myEmployee = new Employee("Mister Smith", 120.00);
        System.out.println(myEmployee.getName());
        System.out.println(myEmployee.getSalary());
        myEmployee.raiseSalary(10);
        System.out.println(myEmployee.getSalary());
    }
}
