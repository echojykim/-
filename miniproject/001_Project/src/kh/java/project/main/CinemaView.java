package kh.java.project.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import kh.java.project.db.DbMemberManager;
import kh.java.project.db.DbReserveManager;
import kh.java.project.main.CinemaController;
import kh.java.project.member.MemberView;


public class CinemaView  {
	
	Booking booking = new Booking();
	Scanner sc = new Scanner(System.in);
	static boolean flag = false;
	
	static int movieSelect = 0;
	static int theaterSelect = 0;
	static String movieName = "";
	static String theaterName = "";
	static int seatRow = 0;
	static int seatColumn = 0;
	static int seatRow2 = 0;
	static int seatColumn2 = 0;
	static String loginUserId;
	
	public static void main(String[] args) {
		
		Cinema cinema = new Cinema();

		CinemaView cinemaview = new CinemaView();
		cinemaview.mainMenu();

	}
	
	public void loginUserId(String userId) {
		this.loginUserId = userId;
	}

	public void mainMenu() {
		int menuSelect = 0;
		String mainMenu = "========예매하기==========\n" 
				+ "1. 영화 선택\n" 
				+ "2. 극장 선택\n"
				+ "3. 예매 내역 확인\n"
				+ "4. 예매 취소\n"
				+ "========================\n"
				+ "> 선택하세요 :";
		while(true) {
			System.out.println(mainMenu);
			menuSelect = sc.nextInt();
			switch(menuSelect) {
			case 1 : 
				movieList(); 
				return;
			case 2 : 
				theaterList();
				return;
			case 3 : 
				reservPrint();
				return;
			case 4 : 
				remove();
				return; 
			default :
				System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
				break;
			}
		}
	}
	
	//1. 영화선택
	public void movieList() {
		
		while(true) {
			System.out.println("========================\n" 
					+ "1. 신세계\n" 
					+ "2. 모비우스\n"
					+ "3. 스펜서\n" 
					+ "4. 토이스토리2\n" 
					+ "========================\n"
					+ "> 선택하세요 :");
			movieSelect = sc.nextInt();
			switch(movieSelect) {
			
			case 1 : System.out.println("========================");
					 System.out.println(map4.get("1_신세계"));
					 System.out.println(map4.get("2_신세계"));
					 System.out.println(map4.get("3_신세계"));
					 System.out.println("========================");
					 
					 selectTheater();
				     return;
			
			case 2 : System.out.println("========================");
					 System.out.println(map4.get("1_모비우스"));
		      		 System.out.println(map4.get("2_모비우스"));
		      		 System.out.println(map4.get("3_모비우스"));
		      		 System.out.println("========================");

		      		selectTheater();
		      		return;
		      		
			case 3 : System.out.println("========================");
					 System.out.println(map4.get("1_스펜서"));
     		 		 System.out.println(map4.get("2_스펜서"));
     		 		 System.out.println(map4.get("3_스펜서"));
     		 		 System.out.println("========================");
     		 		 
     		 		selectTheater();
     		 		return;
     		 		
			case 4 : System.out.println("========================");
					 System.out.println(map4.get("1_토이스토리2"));
	 		 		 System.out.println(map4.get("2_토이스토리2"));
	 		 		 System.out.println(map4.get("3_토이스토리2"));
	 		 		 System.out.println("========================");
	 		 
	 		 		selectTheater();
	 		 		return;
				
			default :
				System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
				break;
			
			}
		}
		
	}
	
	public void selectTheater() {
		
		while(true) {
			System.out.println("=========================\n"
					+ "1. CGV 사당점\n"
					+ "2. CGV 하남미사점\n"
					+ "3. CGV 가양점\n"
					+ "> 선택: ");
			theaterSelect = sc.nextInt();
			switch(theaterSelect) {
			
			case 1 :
				System.out.println("사당점 좌석안내도입니다.");
				seat();
				return;
				
			case 2 : 
				System.out.println("하남미사점 좌석안내도입니다.");
				seat();
				return;
				
			case 3 : 
				System.out.println("가양점 좌석안내도입니다.");
				seat();
				return;

			default : 
				System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
			}
		}
	}

	
	// 극장 한 곳 선택시 영화 3개 출력
	public void theaterList() {
		
		if(flag != true) {
			while(true) {
				System.out.println("=========================\n"
						+ "1. CGV 사당점\n"
						+ "2. CGV 하남미사점\n"
						+ "3. CGV 가양점\n"
						+ "> 선택: ");
				theaterSelect = sc.nextInt();
				
					switch(theaterSelect) {
					
					case 1 : System.out.println(map3.get("1_신세계"));
						     System.out.println(map3.get("1_모비우스"));
						     System.out.println(map3.get("1_스펜서"));
						     System.out.println(map3.get("1_토이스토리2"));
						     selectMovie();
						     return;
					
					case 2 : System.out.println(map3.get("2_신세계"));
				      		 System.out.println(map3.get("2_모비우스"));
				      		 System.out.println(map3.get("2_스펜서"));
				      		 System.out.println(map3.get("2_토이스토리2"));
				      		 selectMovie();
				      		return;
				     
					case 3 : System.out.println(map3.get("3_신세계"));
		     		 		 System.out.println(map3.get("3_모비우스"));
		     		 		 System.out.println(map3.get("3_스펜서"));
		     		 		 System.out.println(map3.get("3_토이스토리2"));
		     		 		 selectMovie();
		     		 		return;
					
					default :
						System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
						break;
					
					}
			}
		}
		return;
	}
	
	//극장 선택 -> 영화 선택 
	public void selectMovie() {
		
		while(true) {
			System.out.println("==========================");
			System.out.println("예매하실 영화를 선택하세요(영화 제목) : ");
			movieName = sc.next();
			switch(movieName) {
			
			case "신세계" : seat(); return;
			case "모비우스" : seat(); return; 
			case "스펜서" : seat(); return; 
			case "토이스토리2" : seat(); return;
			
			default :
				System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
				break;
			}
		}
	}
	
	public void seat() {
		
		String seats[][] = {{"□","□","□","□","□"},
				{"□","□","□","□","□"},
				{"□","□","□","□","□"},
				{"□","□","□","□","□"},
				{"□","□","□","□","□"}};
		
	
		System.out.println("1" + Arrays.toString(seats[0]) + 
				"\n2" + Arrays.toString(seats[1]) +
				"\n3" + Arrays.toString(seats[2]) + 
				"\n4" + Arrays.toString(seats[3]) +
				"\n5" + Arrays.toString(seats[4]) +
				"\n  1  2  3  4  5");
		
		
		System.out.println("좌석을 선택해주세요(가로 행 입력) : ");
		seatRow = sc.nextInt();
		System.out.println("좌석을 선택해주세요(세로 열 입력) : ");
		seatColumn = sc.nextInt();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(seats[i][j] == seats[seatRow-1][seatColumn-1])
					seats[seatRow-1][seatColumn-1] = "■";
				
			}
		}
		System.out.println("1" + Arrays.toString(seats[0]) + 
				"\n2" + Arrays.toString(seats[1]) +
				"\n3" + Arrays.toString(seats[2]) + 
				"\n4" + Arrays.toString(seats[3]) +
				"\n5" + Arrays.toString(seats[4]) +
				"\n  1  2  3  4  5");
		
		System.out.println("예매가 완료되었습니다.");
		addPrint();
	}
	
	public static void addPrint() {
		if(movieSelect == 1) {
			movieName = "신세계";
		} else if(movieSelect == 2) {
			movieName = "모비우스";
		} else if(movieSelect == 2) {
			movieName = "스펜서";
		} else {
			movieName = "토이스토리2";
		}
		if(theaterSelect == 1) {
			theaterName = "사당점";
		} else if(theaterSelect == 2) {
			theaterName = "하남미사점";
		} else {
			theaterName = "가양점";
		}
		Booking booking = new Booking(loginUserId, movieName, theaterName, seatRow, seatColumn);
		DbReserveManager.bookingAddList(booking);
		booking.printInfo();
		
	}
	
	// 확인용!
	public static void reservPrint() {
		System.out.println(loginUserId + "님 안녕하세요.");
		
		DbReserveManager.bookingFindIdList(loginUserId);
		return;
	}
	
	static void remove () {
		System.out.println(loginUserId + "님 안녕하세요.");
		DbReserveManager.bookingRemoveList(loginUserId);
		return;
	}

	//영화관+상영관 같이 들어있는 정보
	Map<String, Cinema> map4 = new HashMap<>();
	{
		map4.put("1_신세계", new Cinema("신세계", 19, 134, "1. CGV사당점 5관", "오후 1시 30분 ~ 오후 3시 44분"));
		map4.put("2_신세계", new Cinema("신세계", 19, 134, "2. CGV하남미사점 1관", "오후 6시 14분 ~ 오후 8시 28분"));
		map4.put("3_신세계", new Cinema("신세계", 19, 134, "3. CGV가양점 8관", "오후 8시 10분 ~ 오후 10시 24분"));
		
		map4.put("1_모비우스", new Cinema("모비우스", 15, 104, "1. CGV사당점 2관", "오전 10시 32분 ~ 오후 12시 16분"));
		map4.put("2_모비우스", new Cinema("모비우스", 15, 104, "2. CGV하남미사점 4관", "오후 2시 45분 ~ 오후 4시 29분"));
		map4.put("3_모비우스", new Cinema("모비우스", 15, 104, "3. CGV가양점 7관", "오후 7시 10분 ~ 오후 9시 54분"));

		map4.put("1_스펜서", new Cinema("스펜서", 12, 117, "1. CGV사당점 2관", "오전 9시 30분 ~ 오전 11시 17분"));
		map4.put("2_스펜서", new Cinema("스펜서", 12, 117, "2. CGV하남미사점 8관", "오후 4시 05분 ~ 오후 6시 02분"));
		map4.put("3_스펜서", new Cinema("스펜서", 12, 117, "3. CGV가양점 1관", "오후 10시 36분 ~ 오전 12시 23분"));

		map4.put("1_토이스토리2", new Cinema("토이스토리2", 0, 92, "1. CGV사당점 6관", "오후 2시 03분 ~ 오후 3시 35분"));
		map4.put("2_토이스토리2", new Cinema("토이스토리2", 0, 92, "2. CGV하남미사점7관", "오후 3시 11분 ~ 오후 4시 43분"));
		map4.put("3_토이스토리2", new Cinema("토이스토리2", 0, 92, "3. CGV가양점 3관", "오후 5시 34분 ~ 오후 7시 06분"));
	}
	
	Map<String, Cinema> map3 = new HashMap<>();
	{
		map3.put("1_신세계", new Cinema("신세계", 19, 134, "5관", "오후 1시 30분 ~ 오후 3시 44분"));
		map3.put("2_신세계", new Cinema("신세계", 19, 134, "1관", "오후 6시 14분 ~ 오후 8시 28분"));
		map3.put("3_신세계", new Cinema("신세계", 19, 134, "8관", "오후 8시 10분 ~ 오후 10시 24분"));
		
		map3.put("1_모비우스", new Cinema("모비우스", 15, 104, "2관", "오전 10시 32분 ~ 오후 12시 16분"));
		map3.put("2_모비우스", new Cinema("모비우스", 15, 104, "4관", "오후 2시 45분 ~ 오후 4시 29분"));
		map3.put("3_모비우스", new Cinema("모비우스", 15, 104, "7관", "오후 7시 10분 ~ 오후 9시 54분"));

		map3.put("1_스펜서", new Cinema("스펜서", 12, 117, "2관", "오전 9시 30분 ~ 오전 11시 17분"));
		map3.put("2_스펜서", new Cinema("스펜서", 12, 117, "8관", "오후 4시 05분 ~ 오후 6시 02분"));
		map3.put("3_스펜서", new Cinema("스펜서", 12, 117, "1관", "오후 10시 36분 ~ 오전 12시 23분"));

		map3.put("1_토이스토리2", new Cinema("토이스토리2", 0, 92, "6관", "오후 2시 03분 ~ 오후 3시 35분"));
		map3.put("2_토이스토리2", new Cinema("토이스토리2", 0, 92, "7관", "오후 3시 11분 ~ 오후 4시 43분"));
		map3.put("3_토이스토리2", new Cinema("토이스토리2", 0, 92, "3관", "오후 5시 34분 ~ 오후 7시 06분"));
	}
}

