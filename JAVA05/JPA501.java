import java.util.Scanner;
public class JPA501 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
    	int n;
    	
    	do {
    		System.out.print("Input n (0 <= n <= 16):");
    		n = keyboard.nextInt();
    		
    		if(n >= 0 && n <= 16) 
    			System.out.printf("%d 的階乘 = %d\n", n,factorial(n));
    	} while(n != 999);
    }
    
    static int factorial(int n) {
    	if(n == 1)
    		return 1;
    	else
    		return n * factorial(n - 1);
    }
}