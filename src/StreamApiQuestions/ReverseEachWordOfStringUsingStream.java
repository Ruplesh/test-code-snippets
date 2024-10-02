package StreamApiQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordOfStringUsingStream {

    public static void main(String[] args) {
        String str = "I work at MSCI";
        String expectedOutput = "I krow ta ICSM";
        String output = "";
        List<String> strList = Arrays.asList(str.split(" "));
        Stream<String> streamStr = Stream.of(str.split(" "));
        List<String> result = streamStr.map(t-> (new StringBuffer(t)).reverse().toString()).toList();
        for (String s : result) {
            output = output + " " + s;
        }
        System.out.println(output.trim());
        strList.stream().forEach(t-> System.out.println((new StringBuffer(t)).reverse()));
    }
}
