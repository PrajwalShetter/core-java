import java.util.*;
import java.util.stream.Collectors;

public class HighestpaidEmplName {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", "IT", 60000),
                new Employee("Rahul", "IT", 80000),
                new Employee("Prajwal", "HR", 45000),
                new Employee("Sneha", "HR", 70000),
                new Employee("Amit", "Sales", 55000)
        );

        employees.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.department,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(
                                        Comparator.comparingDouble(
                                                emp -> emp.salary
                                        )
                                ),
                                optional -> optional.get().name
                        )
                ))
                .forEach((department, employeeName) ->
                        System.out.println(
                                department + " = " + employeeName
                        ));
    }
}