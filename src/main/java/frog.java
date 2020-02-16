public class frog {
    public static int solution(int X, int Y, int D) {
        int jumpCounter = (Y-X)/D;
        for(int i = X+(jumpCounter*D); i < Y; i += D) {
            System.out.println(1);
            jumpCounter++;
        }
        return jumpCounter;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 999111321, 7));//142730189
    }

}
