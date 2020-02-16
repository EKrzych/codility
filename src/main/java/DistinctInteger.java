import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctInteger {
    public int solution(int[] A) {
        Set<Integer> mySet = Arrays.stream(A).boxed().collect(Collectors.toSet());
        return mySet.size();
    }
}
