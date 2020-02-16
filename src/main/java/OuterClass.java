import java.util.*;
import java.util.stream.Collectors;

public class OuterClass {
        static Map<String, Integer> wordMap = new HashMap<>();



        static List<String> myList = Arrays.asList("ccc", "dd", "f");
        static Comparator c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               return o1.length() - o2.length();
            }
        };

    public static void main(String[] args) {
        Collections.sort(myList, c);
        myList.forEach(System.out::println);
        String word = "doll";

        wordMap.compute(word, (String key, Integer value) -> value ++);
        int[] arrWithInts = new int [100];

    }


}
