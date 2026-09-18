import java.util.*;

public class LogestName {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Ravi", "Prajwal", "Rahul", "Alexander"
        );

        String result = names.stream()
                .max(Comparator.comparingInt(String::length))
                .get();

        System.out.println(result);
    }
}