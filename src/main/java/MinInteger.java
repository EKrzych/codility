import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MinInteger {
    public static int solution(int[] A) {
        Set<Integer> B = Arrays.stream(A).filter(n->n > 0).boxed().collect(Collectors.toSet());
        int i;
        for(i = 1; i < A.length; i++) {
            if(B.size()< 1) return 1;
            if(!B.contains(i)) {
                return i;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int []A = {2};
        System.out.println(solution(A));
    }
}
