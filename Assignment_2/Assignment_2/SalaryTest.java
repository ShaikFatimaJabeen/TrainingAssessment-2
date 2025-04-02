
class Employee {
    double getSalary() {
        return 20000;
    }
}
class Manager extends Employee {
    double getSalary() {
        return 50000;
    }
}
class SalaryTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager mgr = new Manager();
        System.out.println("Employee Salary: " + emp.getSalary());
        System.out.println("Manager Salary: " + mgr.getSalary());
    }
}