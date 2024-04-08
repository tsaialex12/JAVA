import java.util.*;
class JPA301 {
    public static void main(String argv[]) {
    	System.out.println("Input:");
        int N = new Scanner(System.in).nextInt(), sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;                       
        }
        System.out.println("1 + ... + " + N + " = " + sum);
    }
}