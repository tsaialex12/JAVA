import java.util.*;
class JPA204 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }
  
    public static void test() {
        System.out.println("Input:");
        int n = input.nextInt();
        if(n % 5 == 0 && n % 9 == 0)
        	System.out.println("Yes");
        else
        	System.out.println("No");
    }
}