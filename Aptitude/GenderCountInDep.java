import java.util.*;
import java.util.stream.Collectors;

class Employee2 {

    String name;
    String department;
    String gender;

    Employee2(String name, String department, String gender) {
        this.name = name;
        this.department = department;
        this.gender = gender;
    }
}

public class GenderCountInDep {

    public static void main(String[] args) {

        List<Employee2> employees = Arrays.asList(
                new Employee2("Ravi", "IT", "Male"),
                new Employee2("Sneha", "IT", "Female"),
                new Employee2("Rahul", "IT", "Male"),
                new Employee2("Prajwal", "HR", "Male"),
                new Employee2("Anu", "HR", "Female")
        );

        employees.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.department,
                        Collectors.groupingBy(
                                emp -> emp.gender,
                                Collectors.counting()
                        )
                ))
                .forEach((department, genderMap) -> {
                    System.out.println(department);
                    genderMap.forEach((gender, count) ->
                            System.out.println(gender + " = " + count));
                });
    }
}