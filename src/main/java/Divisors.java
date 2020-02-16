public class Divisors {
    public static int solution(int A, int B, int K) {
        int counter = 0;
            while(A <= B) {
                if(A % K == 0) {
                    counter++;
                }
                A ++;
            }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(solution(10,10,5));
        System.out.println(solution(11,345,17));
    }
}
