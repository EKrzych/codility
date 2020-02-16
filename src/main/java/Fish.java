import java.util.*;

public class Fish {
    public int solution(int[] A, int[] B) {
        Stack<Integer> livingFishIndexes = new Stack<Integer>();

        for (int i = 0; i < A.length; i++) {
            if(livingFishIndexes.size()==0) {
                livingFishIndexes.push(i);
            } else if(B[livingFishIndexes.peek()] == 1 && B[i] == 0) {
                int livingFish = livingFishIndexes.pop();
                if(A[livingFish] < A[i]) {
                    livingFishIndexes.push(i);
                } else {
                    livingFishIndexes.push(livingFish);
                }
            } else if(B[i] == 1 && B[i+1] == 0){
                    if(A[i] < A[i+1]) {
                        livingFishIndexes.push(i+1);
                        i++;
                    } else {
                        A[i+1] = A[i];
                        B[i+1] = B[i];
                    }

                } else {
                    livingFishIndexes.push(i);
                }
            }
        return livingFishIndexes.size();
        }
    }

