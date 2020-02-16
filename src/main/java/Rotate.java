

public class Rotate {
    public int[] solution(int[] A, int K) {
        if(A.length == 0) return A;
        for(int i = 0; i < K; i ++) {
            A = shiftByOne(A);
        }
        return A;
    }

    private int[] shiftByOne(int[]A) {
        int B [] = new int [A.length];
        B[0] = A[A.length - 1];
        for(int i = 1; i < A.length; i++) {

            B[i] = A[i-1];
        }
        return B;
    }
}
