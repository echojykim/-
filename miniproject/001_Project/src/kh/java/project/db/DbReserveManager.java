package kh.java.project.db;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kh.java.project.main.Booking;
import kh.java.project.member.Member;

public class DbReserveManager {
	
	static List<Booking> bookingAddList;

	static Booking booking = new Booking();
	static Scanner sc = new Scanner(System.in);
	
	static String fileName = "dbList/ReserveList.txt";
	static File bookingDbFile = new File(fileName);
	
	/**
	 * 예약내역 저장 메소드
	 */
	public static void bookingAddList(Booking booking) {
		// 파일 읽기
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(bookingDbFile));
			bookingAddList = (List<Booking>) ois.readObject();
		} catch (EOFException e) {
			bookingAddList = new ArrayList<Booking>(); // 초기화
		} catch (IOException | ClassNotFoundException e) {
			System.out.println();
			e.printStackTrace();
		}
		// 파일 추가
		bookingAddList.add(booking);
		// 파일 쓰기
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(bookingDbFile));
			
			oos.writeObject(bookingAddList);
			// 확인용
//			for(Booking reserve : bookingAddList) {
//				if(reserve == null) break;
//				System.out.println(reserve);
//			}
			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 예약내역 확인 메소드
	 */
	public static void bookingFindIdList(String loginUserId) {
		List<Booking> bookingFindIdList = new ArrayList<Booking>();
		// 파일 읽기
		try (
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(bookingDbFile));
		){
//			if(bookingFindIdList != null)
			bookingFindIdList = (List<Booking>) ois.readObject();
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (IOException | ClassNotFoundException | NullPointerException e) {
			e.printStackTrace();
		}
		// 파일 쓰기
		try (
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(bookingDbFile));
		){
			
			// 확인
			Booking bookingInfo = null;
			for(int i = 0; i < bookingFindIdList.size(); i++) {
				if(loginUserId.equals(bookingFindIdList.get(i).getUserId())) {
					bookingInfo = bookingFindIdList.get(i);
					break;
				} 
			}
			
			if(bookingInfo != null) {
				bookingInfo.printInfo();
			} else {				
				System.out.println("예약 내역이 없습니다.");
			}
			oos.writeObject(bookingFindIdList);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	/**
	 * 예약삭제
	 */
	public static void bookingRemoveList(String loginUserId) {
		List<Booking> bookingRemoveList = new ArrayList<Booking>();
		// 파일 읽기
		try (
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(bookingDbFile));
		){
			if(bookingRemoveList != null)
				bookingRemoveList = (List<Booking>) ois.readObject();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try (
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(bookingDbFile));
			){
			
			// 확인
			Booking bookingInfo = null;
			for(int i = 0; i < bookingRemoveList.size(); i++) {
				if(loginUserId.equals(bookingRemoveList.get(i).getUserId())) {
					bookingInfo = bookingRemoveList.get(i);
					break;
				} 
			}
			
			if(bookingInfo != null) {
				bookingInfo.printInfo();
				// 파일 삭제
				System.out.println("정말 삭제하시겠습니까? ");
				char yn = sc.next().toUpperCase().charAt(0);
				if(yn == 'Y') {
					bookingRemoveList.remove(bookingInfo);
					System.out.println("삭제되었습니다. 이용해주셔서 감사합니다. ");
					oos.writeObject(bookingRemoveList);
				} 
			} else {				
				System.out.println("입력하신 아이디로 예약된 내역은 없습니다.");
			}
			
		} catch (IOException | NullPointerException e) {
			e.printStackTrace();
		}
	}
	
}
