package OpenChallenge1;

import java.util.Scanner;

public class Daller {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("$1=1200원입니다. 달러를 입력하세요.");
		int money=scanner.nextInt();
		int money1=money*1200;
		System.out.println("$"+money + " 는 " + money1 + " 원입니다.");
		scanner.close();
	}

}
