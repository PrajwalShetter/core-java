import java.util.*;

public class SecondHighestSal {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", "IT", 60000),
                new Employee("Rahul", "IT", 80000),
                new Employee("Amit", "HR", 70000),
                new Employee("Sneha", "HR", 50000)
        );

        Employee result = employees.stream()
                .sorted(Comparator.comparingDouble(
                        (Employee e) -> e.salary
                ).reversed())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(result);
    }
}