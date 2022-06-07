package kh.java.project.member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import kh.java.project.db.DbMemberManager;
import kh.java.project.main.CinemaView;

public class MemberView {
	private DbMemberManager dbm = new DbMemberManager(); 
	private Scanner sc = new Scanner(System.in);
	boolean flag = false;
	List<Member> memberAddList = new ArrayList<Member>();
	List<Member> check = new ArrayList<>();
	CinemaView cinemaview = new CinemaView(); 
	
	static String fileName = "dbList/MemberList.txt";
	static File memberDbFile = new File(fileName);
	
	
	Member member = new Member();
	String inputId = null;
	String inputPw = null;
	
	public void mainMenu() {
		int select = 0;
		
		String menu = ">>>>>>>> 📢Login Menu <<<<<<<\n"
				+ "1. 로그인 🔓\n"
				+ "2. 회원가입 💾\n"
				+ "3. 계정 삭제 ❌\n"
				+ "4. 아이디 찾기 🔍\n"
				+ "5. 비밀번호 찾기 🔍\n"
				+ "0. 나가기 📴\n"
				+ "-----------------------------\n"
				+ "> 메뉴 선택: ";
		while(true) {
			System.out.print(menu);
			try {
				
				select = sc.nextInt();
				switch(select) {
				case 1 : 
					login();
					cinemaview.mainMenu();
					break;
				case 2 : mbAdd(); break;
				case 3 : mbRemove(); break;
				case 4 : findId(); break;
				case 5 : findPw(); break;
				case 0 : 
					logout();
					if(flag == true)
						return;
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 선택해주세요~");
				}
			} catch(InputMismatchException e) {
				System.err.println("숫자만 입력해주세요~");
				sc.nextLine();
			}
		}
	}
	
	public void login() {
		outer:
		while(true) {
			int pass = 0;
			System.out.print("아이디를 입력하세요: ");
			String inputId = sc.next();
			System.out.print("비밀번호를 입력하세요: ");
			String inputPw = sc.next();
			try {
				BufferedReader br = new BufferedReader(new FileReader(memberDbFile));
				String line = "";
				
				try {
					while((line = br.readLine()) != null) {
						int passId = line.indexOf(inputId);
						int passPw = line.indexOf(inputPw);
						if(passId != -1 && passPw != -1) {
							System.out.println(inputId + "님 환영합니다.");
							pass = 1;
							CinemaView loingCinema = new CinemaView();
							loingCinema.loginUserId(inputId);
							return;
						}
					}
					if(pass == 0) {
						System.out.println("다시 입력해주세요~");
					} 
					br.close();
				} catch (IOException | NullPointerException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 회원가입
	 */
	public void mbAdd() {
		System.out.print("아이디를 입력해주세요(공백 불가): ");
		String userId = sc.next().replace("[ ~!@#$%^&*]", "");
		System.out.print("비밀번호를 입력해주세요: ");
		String userPw = sc.next();
		System.out.print("이름을 입력해주세요: ");
		sc.nextLine();
		String userName = sc.nextLine().replace(" ", "");
		System.out.print("나이를 입력해주세요: ");
		int age = sc.nextInt();
		System.out.print("핸드폰 번호를 입력해주세요: ");
		sc.nextLine();
		String userPhone = sc.nextLine().replace("[- ]", "");
		Member mb = new Member(userId, userPw, userName, age, userPhone);
		DbMemberManager.memberAddList(mb);
		System.out.println("회원가입이 완료되었습니다.");
		return;
	}
	
	/**
	 * 정보 삭제 메소드
	 */
	public void mbRemove() {
		System.out.print("> 삭제할 계정 아이디를 입력해주세요: ");
		String removeId = sc.next();
		System.out.print("> 비밀번호를 입력해주세요: ");
		String removePw = sc.next();
		DbMemberManager.memberRemoveList(removeId, removePw);
	}
	/**
	 * 
	 */
	public void findId() {
		System.out.println("-----------------------------");
		System.out.print("찾으실 아이디에 등록된 핸드폰 번호를 입력하세요: ");
		sc.nextLine();
		String findId = sc.nextLine();
		DbMemberManager.memberFindIdList(findId);
	}
	/**
	 * 
	 */
	public void findPw() {
		System.out.println("-----------------------------");
		System.out.print("아이디를 입력하세요: ");
		sc.nextLine();
		String findPw = sc.nextLine();
		DbMemberManager.memberFindPwList(findPw);
	}
	
	/**
	 * 종료메소드
	 */
	public void logout() {
		while(true) {
			System.out.print("종료하시겠습니까?(y/n): ");
			char yn = sc.next().charAt(0);
			
			switch(yn) {
			case 'y':
			case 'Y':
				System.out.println("프로그램을 종료합니다.");
				flag = true;
				return;
			case 'n':
			case 'N':
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요~");
			}
		}
	}
}
