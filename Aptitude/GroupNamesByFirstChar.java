import java.util.*;
import java.util.stream.Collectors;

public class GroupNamesByFirstChar {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Ravi", "Rahul", "Amit",
                "Anu", "Prajwal"
        );

        names.stream()
                .collect(Collectors.groupingBy(
                        name -> name.charAt(0)
                ))
                .forEach((character, list) ->
                        System.out.println(character + " = " + list));
    }
}