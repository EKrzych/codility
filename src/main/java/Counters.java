import java.util.Arrays;
import java.util.HashMap;

public class Counters {
    public static int[] solution(int N, int[] A) {
        int[]counters = new int [N];
        int currentMaxCounter = 0;
        for(int i = 0; i < A.length; i++) {

            int position = A[i]-1;
            if(position >= N) {
                Arrays.fill(counters, currentMaxCounter);
            } else if(position < N) {
                counters[position]++;
                if(currentMaxCounter < counters[position]) currentMaxCounter = counters[position];
            }
        }
        return counters;
    }

    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        Arrays.stream(solution(5, A)).forEach(System.out::println);

    }


}
