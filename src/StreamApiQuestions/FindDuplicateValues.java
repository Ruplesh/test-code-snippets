package StreamApiQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateValues {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 28, 87, 10, 20, 76, 28, 80, 80, 80);
        Set<Integer> intSet = new HashSet<>();
        intList.stream().filter(x->!intSet.add(x))
                .collect(Collectors.toSet()).forEach(System.out::println);
    }
}
