import java.util.*;
public class JPA207 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();        
        test();
        test();
        test();
    }
    
    static void test() {
    	int[] datas = new int[3];
    	
        System.out.print("請輸入三個整數：");
        datas[0] = keyboard.nextInt();
        datas[1] = keyboard.nextInt();
        datas[2] = keyboard.nextInt();
        
        Arrays.sort(datas);	// 將資料由小排到大
        int a = datas[0], b = datas[1], c = datas[2];
        
        if(a + b > c) {
        	if(a * a + b * b  == c * c)
        		System.out.println("直角三角形");
        	else if(a * a + b * b < c * c)
        		System.out.println("鈍角三角形");
        	else if(a * a + b * b > c * c)
        		System.out.println("銳角三角形");
        }
        else
        	System.out.println("不可以構成三角形");
    }
}