package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("톰");
        list.add("제리");
        list.add("도그");

        Stream<String> stream = list.stream();

        stream.forEach(System.out::println);

        list.stream().sorted().forEach(System.out::println);


    }


}
