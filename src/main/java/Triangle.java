import java.util.Arrays;

public class Triangle {
    public static int solution(int[] B) {
        long[] A = Arrays.stream(B).mapToLong(n->(long)n).toArray();
        Arrays.sort(A);
        for (int i = 0; i <= A.length - 3; i++) {
            if ((A[i] + A[i+1] > A[i+2]) && (A[i+1] + A[i+2] > A[i]) && (A[i+2] + A[i] > A[i+1])) {

                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2147483647,2147483647,2147483647};
        System.out.println(solution(arr));
    }
}
