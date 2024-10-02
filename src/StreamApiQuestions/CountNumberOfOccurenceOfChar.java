package StreamApiQuestions;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountNumberOfOccurenceOfChar {

    static String initialChar = "";
    public static void main(String[] args) {
        String str = "AABCCCADD";
        //str.chars().mapToObj(c -> (char) c).forEach(System.out::println);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        initialChar = str.charAt(0) + "";
        AtomicInteger counter = new AtomicInteger(0);
        Stream.of(str.split("")).forEach(t -> {
            if(!initialChar.equals(t)){
                System.out.print(initialChar+atomicInteger.get());
                atomicInteger.set(0);
                initialChar = t;
            }
            atomicInteger.incrementAndGet();
            if(counter.incrementAndGet() == str.length()){
                System.out.print(initialChar+atomicInteger.get());
            }
        });


        Map<String, Long> map = Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);


    }
}
