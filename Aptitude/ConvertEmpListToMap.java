import java.util.*;
import java.util.stream.Collectors;

public class ConvertEmpListToMap {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", "IT", 60000),
                new Employee("Rahul", "IT", 70000),
                new Employee("Amit", "HR", 50000)
        );

        Map<String, Double> result =
                employees.stream()
                        .collect(Collectors.toMap(
                                emp -> emp.name,
                                emp -> emp.salary
                        ));

        System.out.println(result);
    }
}