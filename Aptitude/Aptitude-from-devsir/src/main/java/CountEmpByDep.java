import java.util.*;
import java.util.stream.Collectors;

public class CountEmpByDep {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", "IT", 60000),
                new Employee("Rahul", "IT", 70000),
                new Employee("Prajwal", "HR", 45000),
                new Employee("Sneha", "HR", 50000),
                new Employee("Amit", "Sales", 55000)
        );

        employees.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.department,
                        Collectors.counting()
                ))
                .forEach((department, count) ->
                        System.out.println(department + " = " + count));
    }
}