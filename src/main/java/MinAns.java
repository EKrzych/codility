public class MinAns {
    static int solution(int[] A) {
        int ans = A[0];
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]A = {-7, 1, -2, 2};
        System.out.println(solution(A));
    }
}
