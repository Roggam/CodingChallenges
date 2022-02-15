import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFilter {

    //Given a list of strings, write a method that returns a list of all strings that start with the letter 'a' (lower case)
    // and have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams API's.

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ala");
        list.add("hello");
        list.add("all");
        list.add("apple");

        System.out.println(stringListFilter(list));

    }



    public static List<String> stringListFilter(List<String> list){
        return list.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }
}
