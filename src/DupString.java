import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByKey;

public class DupString {

    public  static void main(String args[]) {
        String line = " New Java class New";
        Set<String> strset = new HashSet<>();
        String sentence = "alex brian charles alex charles david eric david";

        List<String> wordsList = Arrays.stream(sentence.split(" ")).collect(Collectors.toList());

        Set<String> ss = wordsList.stream().filter(w->!strset.add(w)).
        collect(Collectors.toSet());
                //collect(Collectors.groupingBy(s -> s,Collectors.counting()));

        System.out.println(ss);
       // String stream = Stream.of(line).filter(x->).forEach();

        Map<Integer, String> map = new HashMap<>();
        map.put(10,"ten");
        map.put(1,"one");
        map.put(5,"five");
        map.put(3,"thre");
        map.put(4,"four");
        System.out.println( "Unsorted  by value" + map);
        map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByKey()).forEach(System.out::println);


    }
}
