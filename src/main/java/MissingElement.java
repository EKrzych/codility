import java.util.Arrays;

public class MissingElement {
    public int solution(int[] A) {
        Arrays.sort(A);
        int i;
        for(i = 0; i < A.length; i++) {
            if(A[i] != i) return i;
        }
        return i;
    }
}
