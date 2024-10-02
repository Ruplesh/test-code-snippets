package StreamApiQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintNextMaxInteger {
    static int max;
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(0, 2, 3, 9, 0, 5, 6, 2);
        max = intList.get(0);
        AtomicInteger counter = new AtomicInteger();
        int size = intList.size();
        intList.stream().forEach(t -> {
            counter.getAndIncrement();
            if(t < max) {
                System.out.println(max);
                if(counter.get() == size) {
                    System.out.println(t);
                }
            }
            max = t;
        });
    }
}
