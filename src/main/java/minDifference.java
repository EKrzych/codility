
import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.StrictMath.abs;

public class minDifference {
    public static int solution(int[] A) {
        int minDifference = 0;
        for(int P = 1; P < A.length; P++) {
            int temp = abs(IntStream.of(Arrays.copyOfRange(A,0,P)).sum() - IntStream.of(Arrays.copyOfRange(A,P,A.length)).sum());
            if(P == 1) minDifference = temp;

            if(minDifference > temp) {
                minDifference = temp;
            }
        }
        return minDifference;
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};
        System.out.println(solution(A));
    }
}
