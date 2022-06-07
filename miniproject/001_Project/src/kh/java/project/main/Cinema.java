package kh.java.project.main;

public class Cinema {

	private String title; //영화(타이틀)
	private int filmRating; //관람 연령 제한 
	private long runtime; //영화 총시간(러닝타임)
	private String videoHall; //상영관(M관~~) 
	private String screenSchedule; //상영시간표(ex: 스펜서 오후 1시~3시 30분) 
	
	public Cinema() {}
	
	public Cinema(String title, int filmRating, long runtime, String videoHall, String screenSchedule) {
		super();
		this.title = title;
		this.filmRating = filmRating;
		this.runtime = runtime;
		this.videoHall = videoHall;
		this.screenSchedule = screenSchedule;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getFilmRating() {
		return filmRating;
	}
	public void setFilmRating(int filmRating) {
		this.filmRating = filmRating;
	}
	public long getRuntime() {
		return runtime;
	}
	public void setRuntime(long runtime) {
		this.runtime = runtime;
	}
	public String getVideoHall() {
		return videoHall;
	}
	public void setVideoHall(String videoHall) {
		this.videoHall = videoHall;
	}
	public String getScreenSchedule() {
		return screenSchedule;
	}
	public void setScreenSchedule(String screenSchedule) {
		this.screenSchedule = screenSchedule;
	}
	
	@Override
	public String toString() {
		return "Cinema [영화 예매: " + title + ", 관람연령 제한: " + filmRating + ", 총 시간: " + runtime + ", 상영관: "
				+ videoHall + ", 상영시간: " + screenSchedule + "]";
	}
	
	
	
}
