import java.util.*;

public class ThirdHighestDistrinctSalary {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("A", "IT", 80000),
                new Employee("B", "IT", 70000),
                new Employee("C", "HR", 90000),
                new Employee("D", "HR", 70000),
                new Employee("E", "Sales", 60000)
        );

        Double result = employees.stream()
                .map(emp -> emp.salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .get();

        System.out.println(result);
    }
}