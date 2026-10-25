import java.util.*;
import java.util.stream.Collectors;

public class NamesByDep {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", "IT", 60000),
                new Employee("Rahul", "IT", 70000),
                new Employee("Prajwal", "HR", 45000),
                new Employee("Sneha", "HR", 50000)
        );

        employees.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.department,
                        Collectors.mapping(
                                emp -> emp.name,
                                Collectors.toList()
                        )
                ))
                .forEach((department, names) ->
                        System.out.println(department + " = " + names));
    }
}