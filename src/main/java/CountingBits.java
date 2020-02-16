

public class CountingBits {
    public static int solution(int A, int B) {
        String binaryNumber = Long.toBinaryString((long)A * (long)B);
        return (int) binaryNumber.chars().filter(l -> l == '1').count();
    }

    public static void main(String[] args) {
//long m = 1000000000000000000L;
        System.out.println(solution(100000000, 100000000));
    }
}
