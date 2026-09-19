import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepetedChar {

    public static void main(String[] args) {

        String word = "swiss";

        Character result = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(result);
    }
}