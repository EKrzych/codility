import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Odds {
    public static int solution(int[] A) {
        Map<Integer, Boolean> myMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (myMap.containsKey(A[i])) {
                myMap.put(A[i], !myMap.get(A[i]));
            }
            myMap.putIfAbsent(A[i], true);
        }
        myMap.entrySet().removeIf(n -> n.getValue().equals(false));
        return new ArrayList<>(myMap.keySet()).get(0);
    }

    public static void main(String[] args) {
        int A[] = {1,2,2,1,3,1000000000,3,1000000000, 1000000000, 1000000000, 1000000000,1000000000,1000000000,2};
        System.out.println(solution(A));
    }
}

