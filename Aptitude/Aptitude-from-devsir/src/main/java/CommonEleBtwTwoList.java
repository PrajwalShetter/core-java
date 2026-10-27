import java.util.*;
import java.util.stream.Collectors;

public class CommonEleBtwTwoList {

    public static void main(String[] args) {

        List<Integer> list1 =
                Arrays.asList(10, 20, 30, 40);

        List<Integer> list2 =
                Arrays.asList(30, 40, 50, 60);

        list1.stream()
                .filter(list2::contains)
                .forEach(System.out::println);
    }
}