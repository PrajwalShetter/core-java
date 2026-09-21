import java.util.*;

class Employee3 {

    String name;
    int age;

    Employee3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}

public class EmpOlderThanAvgAge {

    public static void main(String[] args) {

        List<Employee3> employees = Arrays.asList(
                new Employee3("Ravi", 25),
                new Employee3("Rahul", 30),
                new Employee3("Amit", 22),
                new Employee3("Sneha", 35)
        );

        double averageAge = employees.stream()
                .mapToInt(emp -> emp.age)
                .average()
                .getAsDouble();

        employees.stream()
                .filter(emp -> emp.age > averageAge)
                .forEach(System.out::println);
    }
}