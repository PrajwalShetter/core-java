import java.util.*;
import java.util.stream.Collectors;

public class HandleDuplicateKeyConvToMap {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", "IT", 60000),
                new Employee("Ravi", "HR", 70000),
                new Employee("Rahul", "IT", 50000)
        );

        Map<String, Double> result =
                employees.stream()
                        .collect(Collectors.toMap(
                                emp -> emp.name,
                                emp -> emp.salary,
                                (oldValue, newValue) ->
                                        Math.max(oldValue, newValue)
                        ));

        System.out.println(result);
    }
}