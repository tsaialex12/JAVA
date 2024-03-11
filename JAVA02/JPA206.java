import java.util.*;
public class JPA206 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();        
        test();
        test();
        test();
    }
    
    static void test() {
        int Chinese, English, Math, avg;
        System.out.print("Input Chinese score:");
        Chinese = keyboard.nextInt();
        System.out.print("Input English score:");
        English = keyboard.nextInt();
        System.out.print("Input Math score:");
        Math = keyboard.nextInt();
        
        if(Chinese < 60)
        	System.out.println("Chinese failed.");
        if(English < 60)
        	System.out.println("English failed.");
        if(Math < 60)
        	System.out.println("Math failed.");
        if(Chinese >= 60 && English >= 60 && Math >= 60)
        	System.out.println("All pass.");
    }
}