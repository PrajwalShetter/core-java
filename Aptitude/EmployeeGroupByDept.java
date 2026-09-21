import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class EmployeeGroupByDept {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", "IT", 60000),
                new Employee("Prajwal", "HR", 45000),
                new Employee("Rahul", "IT", 70000),
                new Employee("Sneha", "HR", 50000),
                new Employee("Amit", "Sales", 55000)
        );

        employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.department))
                .forEach((department, list) ->
                        System.out.println(department + " = " + list));
    }
}