import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNames {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Ravi", "Rahul", "Ravi", "Amit",
                "Rahul", "Sneha", "Amit"
        );

        names.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(System.out::println);
    }
}