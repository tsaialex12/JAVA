import java.util.Scanner;

public class JPA105 {
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);

    String name;
   	int one, five, ten, fifty, sum = 0;

    System.out.println("請輸入您的姓名:");
    name = scn.next();

    System.out.println("Hi, " + name + ",請輸入您的銅板的個數：");
    System.out.println("請輸入1元的數量");
    one = scn.nextInt();

    System.out.println("請輸入5元的數量");
    five = scn.nextInt();

    System.out.println("請輸入10元的數量");
    ten = scn.nextInt();

    System.out.println("請輸入50元的數量");
    fifty = scn.nextInt();

    sum = one + five * 5 + ten * 10 + fifty * 50;
    System.out.printf("您的錢總共有：%d 千 %d 百 %d 十 %d 元\n", sum / 1000,sum / 100 % 10,sum / 10 % 10,sum % 10);
    scn.close();
    }
}
