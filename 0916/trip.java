package OpenChallenge1;
import java.util.Scanner;

public class trip {
	   public static void main(String[] args) {
		      Scanner scanner = new Scanner(System.in);
		      
		      System.out.print("여행지");
		      String Trip = scanner.nextLine();
		      
		      System.out.print("인원수 ");
		      int Peoples = scanner.nextInt();
		      
		      System.out.print("숙박일 ");
		      int Day = scanner.nextInt();
		      int Days = Day+1;
		      
		      System.out.print("1인당 항공료 ");
		      int Airport = scanner.nextInt();
		      
		      System.out.print("1방 숙박비 ");
		      int Room_Charge = scanner.nextInt();
		      
		      // 방 개수 
		      int Rooms;
		      if(Peoples%2 == 1) {
		         Rooms = (Peoples+1)/2;
		      }else {
		         Rooms = Peoples/2;
		      }
		      // 항공비 왕복, 숙박비
		      int All = (Airport*Peoples)*2 + (Rooms*Room_Charge)*Day;
		      
		      System.out.print(Peoples + "명의 " + Trip + Day + "박 " + Days + "일 여행에는 방이" + Rooms + "개 필요하며 경비는" + All +"입니다");
		      scanner.close();
		   }

		}

