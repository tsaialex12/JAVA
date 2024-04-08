import java.util.Scanner;
public class JPA503 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
    	System.out.print("Input m: ");
    	int m = keyboard.nextInt(), n;
    	
    	while(m != 999) {
    		System.out.print("Input n: ");
    		n = keyboard.nextInt();
    		
    		System.out.printf("最大公因數為：%d\n", gcd(m, n));
    		
    		System.out.print("Input m: ");
        	m = keyboard.nextInt();
        }
    }
    
    static int gcd(int m, int n) {
    	if(n == 0)
    		return m;
    	return m % n == 0 ? n : gcd(n, m % n);
    }
}