package kh.java.project.main;

import java.io.Serializable;
import java.util.Objects;

public class Booking implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String userId;
	private String movieName;
	private String theaterName;
	private int seatRow;
	private int seatColumn;
	
	public Booking() {
		super();
	}
	
	public Booking(String userId, String movieName, String theaterName, int seatRow, int seatColumn) {
		super();
		this.userId = userId;
		this.movieName = movieName;
		this.theaterName = theaterName;
		this.seatRow = seatRow;
		this.seatColumn = seatColumn;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	
	public int getSeatRow() {
		return seatRow;
	}

	public void setSeatRow(int seatRow) {
		this.seatRow = seatRow;
	}

	public int getSeatColumn() {
		return seatColumn;
	}

	public void setSeatColumn(int seatColumn) {
		this.seatColumn = seatColumn;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(movieName, seatColumn, seatRow, theaterName, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		return Objects.equals(movieName, other.movieName) && seatColumn == other.seatColumn && seatRow == other.seatRow
				&& Objects.equals(theaterName, other.theaterName) && Objects.equals(userId, other.userId);
	}
	
	@Override
	public String toString() {
		return "Booking [userId=" + userId + ", movieName=" + movieName + ", theaterName=" + theaterName + ", seatRow="
				+ seatRow + ", seatColumn=" + seatColumn + "]";
	}

	public void printInfo() {
		System.out.println(userId + "님의 예약내역입니다.\n" + "영화명: " + movieName + "\n관람지점: " + theaterName + "\n좌석: " + seatRow + "행 " + seatColumn + "열\n즐거운 관람되세요~");
	}
	
	
}
