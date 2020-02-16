public class DNA {
    public static int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int [P.length];
        int value;
        for(int i = 0; i < P.length; i++) {
            String partString = S.substring(P[i],Q[i]+1);

            if(partString.contains("A")) {
                value = 1;
            } else if (partString.contains("C")){
                value = 2;
            } else if(partString.contains("G")) {
                value = 3;
            }else {
                value = 4;
            }

            result[i] = value;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "TC";
        int [] P = {0, 0, 1};
        int[] Q = {0, 1, 1};
        System.out.println(solution(s,P,Q));
    }
}
