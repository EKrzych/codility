import java.math.BigDecimal;
import java.math.RoundingMode;

import static sun.swing.MenuItemLayoutHelper.max;

public class MinAvgSlice {
    public static int solution(int[] A) {
        float currentMaxSum = A[0];
        int prevMaxLength = 2;
        float globalSum = A[0] + A[1];
        int globalMaxLength = 2;
        int beginningOfGlobalMax = 0;

        for (int i = 1 ; i < A.length; i++) {

            float currentMaxAvxLarger = round((currentMaxSum + (A[i])) / (prevMaxLength));
            float currentMaxAvxCouple = round((A[i] + A[i-1])/2);
            if (currentMaxAvxCouple <= currentMaxAvxLarger) {
                currentMaxSum = A[i] + A[i-1];
                if (currentMaxAvxCouple < globalSum/globalMaxLength) {
                    globalSum = currentMaxSum;
                    beginningOfGlobalMax = i-1;

                    globalMaxLength = 2;
                }
                prevMaxLength = 2;

            } else {
                currentMaxSum += A[i];

                if (currentMaxAvxLarger < globalSum/globalMaxLength) {
                    globalSum = currentMaxSum;
                    prevMaxLength = beginningOfGlobalMax = i - prevMaxLength+1;
                    globalMaxLength++;
                }
                prevMaxLength++;


            }

        }
        return beginningOfGlobalMax;
    }

    private static float round(double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }

    public static void main(String[] args) {
        int [] D = {-1000, -1000};
        int [] C = {-3, -5, -8, -4, -10};
        int [] A = {4, 2, 2, 5, 1, 5, 8};
        System.out.println(solution(D));//1
      System.out.println(solution(A));//1
        int [] B = {-1000, 1000};
       System.out.println(solution(B));//0
        System.out.println(solution(C));//2
    }
}
