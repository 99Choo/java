package OpenChallenge1;

import java.util.Scanner;

public class Birth {
	  public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);   
	      int happy = scanner.nextInt();
	      int birth = (happy%10000) / 100;
	      int day = (happy%10000) % 100;
	      System.out.print("생일을 입력하세요.");
	      System.out.print(happy/10000+"년 ");
	      System.out.print(birth+"월 ");
	      System.out.println(day+"일");
	      scanner.close();
	      
	   }
	}

