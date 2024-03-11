import java.util.Scanner;

public class JPA103 {
    public static void main(String[] args){
        System.out.println("Please input:");
        Scanner scn=new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        double a = (x + y + z ) / 3;
        System.out.println("AVG:" +a);
        scn.close();
    }
}
