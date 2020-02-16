import java.util.Arrays;

public class PassingCars {
    public static int solution(int[] A) {
        int cars = 0;
        long temp = 0;
        int j = A.length;
        for(int i = A.length - 1; i >= 0; i--) {
            if(A[i] == 0) {
                temp += Arrays.stream(Arrays.copyOfRange(A, i, j)).filter(n -> n == 1).count();
                cars += temp;
                j = i;
                if(cars >= 1000000000) return -1;
            }
        }
        return cars;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1};
        System.out.println(solution(arr));
    }

}

//    public int solution(int[] A) {
//        int cars = 0;
//        for(int i = 0; i < A.length; i++) {
//            if(A[i] == 0) {
//                cars += Arrays.stream(Arrays.copyOfRange(A, i, A.length)).filter(n -> n==1).count();
//                if(cars >= 1000000000) return -1;
//            }
//        }
//        return cars;
//    }