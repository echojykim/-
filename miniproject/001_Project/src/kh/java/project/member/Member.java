package kh.java.project.member;

import java.io.Serializable;
import java.util.Objects;

public class Member implements Serializable {
	private static final long serialVersionUID = 1L; // 직렬화 처리
	private int index;
	private String userId; // 아이디 중복검사
	private String userPw;
	private String userName;
	private int age; // 나이
	private String userPhone; // 핸드폰 중복검사
	
	public Member() {
		super();
	}
	
	public Member(String userId, String userPw, String userName, int age, String userPhone) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.age = age;
		this.userPhone = userPhone;
	}
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, index, userId, userName, userPhone, userPw);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return age == other.age && index == other.index && Objects.equals(userId, other.userId)
				&& Objects.equals(userName, other.userName) && Objects.equals(userPhone, other.userPhone)
				&& Objects.equals(userPw, other.userPw);
	}

	@Override
	public String toString() {
		return String.format("ID: %s, PW: %s, Name: %s, Age: %d, Phone: %s%n", userId, userPw, userName, age, userPhone);
	}

	public String getMemberInfo() {
		return "Id: " + userId + " Pw: " + userPw + " Name: " + userName + " Age: " + age + " Phone: " + userPhone;
	}
}
