

public class Tests {
    public static int solution(int N) {
        char [] binaryNumber = (Integer.toBinaryString(N)).toCharArray();
        System.out.println(binaryNumber);
        int maxGap = 0;
        int temp = 0;
        for(int i = 0, j = 1; j < binaryNumber.length; ) {
            if(binaryNumber[i] == '1' && binaryNumber[j] == '0') {

                while(j < binaryNumber.length && binaryNumber[j] != '1') {
                    temp++;
                    j++;
                }

                if(j < binaryNumber.length && maxGap < temp && binaryNumber[j] == '1') {
                    maxGap = temp;

                }
                i = j;
                j = i + 1;




            } else {
                i++;
                j++;
            }
            temp = 0;
        }
        return maxGap;
    }

    public static void main(String[] args) {
        System.out.println(solution(13));
        System.out.println(solution(77));
        System.out.println(solution(10));
        System.out.println(solution(1234567));
        System.out.println(solution(345));
        System.out.println(solution(678));


    }
}
