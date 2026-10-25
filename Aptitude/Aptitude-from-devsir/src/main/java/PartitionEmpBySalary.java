import java.util.*;
import java.util.stream.Collectors;

public class PartitionEmpBySalary {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", "IT", 60000),
                new Employee("Rahul", "IT", 70000),
                new Employee("Prajwal", "HR", 45000),
                new Employee("Sneha", "HR", 50000)
        );

        employees.stream()
                .collect(Collectors.partitioningBy(
                        emp -> emp.salary > 50000
                ))
                .forEach((result, list) ->
                        System.out.println(result + " = " + list));
    }
}