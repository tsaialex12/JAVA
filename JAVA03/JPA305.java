import java.util.Scanner;
public class JPA305 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
    }
    
    public static void test() {
        System.out.print("Please enter one value:");
        int n = keyboard.nextInt(), ans = 1;
        
        if(n >= 1 && n <= 10) {
        	for(int i = 2;i <= n;i++) 
        		ans *= i;
        	System.out.println(n + "!: " + ans);
        }
        else
        	System.out.println("Error, the value is out of range.");
    }
}