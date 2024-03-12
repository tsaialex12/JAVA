import java.util.*;
public class JPA205 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        for(int i = 0;i<=3;i++){
            int n = input.nextInt();
        if(n % 6 == 0)
        	System.out.printf("%d是2、3、6的倍數\n", n);
        else if(n % 3 == 0)
        	System.out.printf("%d是3的倍數\n", n);
        else if(n % 2 == 0)
        	System.out.printf("%d是2的倍數\n", n);
        else
        	System.out.printf("%d不是2、3、6的倍數\n", n);
        }        
    }
}