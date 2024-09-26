package OpenChallenge1;
import java.util.Scanner;

public class food {
	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("**** 자바 분식입니다. 주문하면 금액을 알려드립니다.****");
	      
	      int money1 = scanner.nextInt();
	      int money2 = scanner.nextInt();
	      int money3 = scanner.nextInt();
	      
	      System.out.println("떡복이 몇 인분 " + money1);
	      System.out.println("김말이 몇 인분 " + money2);
	      System.out.println("쫄면 몇 인분 " + money3);
	      int total = (money1*2000)+(money2*1000)+(money3*3000);
	      System.out.println("전체 금액은 " + total + " 원입니다");
	      scanner.close();
	   }

}

   
