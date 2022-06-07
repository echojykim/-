package kh.java.project.db;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kh.java.project.member.Member;

public class DbMemberManager {
	
	static List<Member> memberAddList;

	static Member member = new Member();
	static Scanner sc = new Scanner(System.in);
	
	static String fileName = "dbList/MemberList.txt";
	static File memberDbFile = new File(fileName);
	/**
	 * 회원가입 메소드
	 */
	public static void memberAddList(Member mb) {
		// 파일 읽기
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(memberDbFile));
			memberAddList = (List<Member>) ois.readObject();
		} catch (EOFException e) {
			memberAddList = new ArrayList<Member>(); // 초기화
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(111);
			e.printStackTrace();
		}
		// 파일 추가
		memberAddList.add(mb);
		// 파일 쓰기
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(memberDbFile));
			
			oos.writeObject(memberAddList);
			// 확인용
//			for(Member user : memberAddList) {
//				if(user == null) break;
//				System.out.println(user);
//			}
			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 아이디 찾기 메소드
	 */
	public static void memberFindIdList(String mb) {
		List<Member> memberFindIdList = new ArrayList<Member>();
		// 파일 읽기
		try (
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(memberDbFile));
		){
			memberFindIdList = (List<Member>) ois.readObject();
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (IOException | ClassNotFoundException | NullPointerException e) {
			e.printStackTrace();
		}
		// 파일 쓰기
		try (
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(memberDbFile));
		){
			oos.writeObject(memberFindIdList);
			// 확인
			for(int i = 0; i < memberFindIdList.size(); i++) {
				if(mb.equals(memberFindIdList.get(i).getUserPhone())) {
					System.out.println("찾으시는 아이디는 " + memberFindIdList.get(i).getUserId() + " 입니다.");
					return;
				} 
			}
			System.out.println("입력하신 번호로 등록된 아이디는 없습니다.");
			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * 비밀번호 찾기 메소드
	 */
	public static void memberFindPwList(String mb) {
		List<Member> memberFindPwList = new ArrayList<Member>();
		// 파일 읽기
		try (
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(memberDbFile));
		){
			if(memberFindPwList != null)
				memberFindPwList = (List<Member>) ois.readObject();
		} catch (IOException | ClassNotFoundException | NullPointerException e) {
			e.printStackTrace();
		}
		// 파일 쓰기
		try (
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(memberDbFile));
		){
			oos.writeObject(memberFindPwList);
			// 확인
			for(int i = 0; i < memberFindPwList.size(); i++) {
				if(mb.equals(memberFindPwList.get(i).getUserId())) {
					System.out.println("해당 비밀번호는 " + memberFindPwList.get(i).getUserPw() + " 입니다.");
					return;
				}
			}
			System.out.println("입력하신 아이디를 찾을 수 없습니다.");
			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 계정삭제 
	 */
	public static void memberRemoveList(String removeId, String removePw) {
		List<Member> memberRemoveList = new ArrayList<Member>();
		// 파일 읽기
		try (
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(memberDbFile));
		){
			if(memberRemoveList != null)
				memberRemoveList = (List<Member>) ois.readObject();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try (
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(memberDbFile));
		){
			// 확인
			Member memberIndex = null;
			for(int i = 0; i < memberRemoveList.size(); i++) {
				if(removeId.equals(memberRemoveList.get(i).getUserId()) && removePw.equals(memberRemoveList.get(i).getUserPw())) {
					System.out.println("ID: " + memberRemoveList.get(i).getUserId() 
							+ " 이름: " + memberRemoveList.get(i).getUserName());
					memberIndex = memberRemoveList.get(i);
				}
			}
			if(memberIndex != null) {
				// 파일 삭제
				System.out.println("정말 삭제하시겠습니까? ");
				char yn = sc.next().toUpperCase().charAt(0);
				if(yn == 'Y') {
					memberRemoveList.remove(memberIndex);
					System.out.println("삭제되었습니다. 이용해주셔서 감사합니다. ");
					oos.writeObject(memberRemoveList);
				}
			} else {
			System.out.println("다시 입력해주세요.");
			}
		} catch (IOException | NullPointerException e) {
			e.printStackTrace();
		}
		
	}
	
}
