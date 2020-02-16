import java.util.HashSet;
import java.util.Set;

public class FrogTimer {
    public static int solution(int X, int[] A) {
        Set<Integer> leafs = new HashSet<>();
        for(int i = 0; i < A.length; i++) {
            if(A[i] <= X) leafs.add(A[i]);

            if(leafs.size() == X) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] B = {1, 3, 1, 3, 2, 1, 3};
        System.out.println(solution(3, B));
    }
}
