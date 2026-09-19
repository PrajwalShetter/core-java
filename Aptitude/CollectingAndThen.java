import java.util.*;
import java.util.stream.Collectors;

public class CollectingAndThen {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", "IT", 60000),
                new Employee("Rahul", "IT", 80000),
                new Employee("Amit", "HR", 70000)
        );

        Employee result = employees.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.maxBy(
                                Comparator.comparingDouble(
                                        emp -> emp.salary
                                )
                        ),
                        Optional::get
                ));

        System.out.println(result);
    }
}