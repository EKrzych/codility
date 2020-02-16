import java.util.Arrays;

public class Sorting {
    public int solution(int[] A) {
        Arrays.sort(A);
        int fromEnd = A[A.length-1]*A[A.length-2]*A[A.length-3];
        int fromBegin = A[0]*A[1]*A[A.length-1];
        if (fromEnd > fromBegin) {
            return fromEnd;
        }
        return fromBegin;
    }
}
