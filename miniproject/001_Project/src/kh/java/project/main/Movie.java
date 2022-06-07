package kh.java.project.main;

/**
 *  Movie VO 클래스
 *  영화정보
 *  1. 타이틀
 *  2. 감독
 *  3. 캐스팅
 *  4. 관람연령
 *  
 *  영화 - 신세계 
 *  모비우스
 *  스펜서
 *  토이스토리
 *
 */
public class Movie {

	private String title; // 영화(타이틀)
	private String diretor; // 감독
	private String cast; //캐스팅
	private int filmRating; //관람 연령 제한 
	
	public Movie() {} //기본생성자
	
	public Movie(String title, String director, String cast, int filmRating) {
		this.title = title;
		this.diretor = director;
		this.cast = cast;
		this.filmRating = filmRating;
	} 

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDiretor() {
		return diretor;
	}


	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}


	public String getCast() {
		return cast;
	}


	public void setCast(String cast) {
		this.cast = cast;
	}


	public int getFilmRating() {
		return filmRating;
	}


	public void setFilmRating(int filmRating) {
		this.filmRating = filmRating;
	}

	@Override
	public String toString() {
		return "Movie [영화 예매: " + title + ", 감독: " + diretor + ", 캐스팅: " + cast + ", 관람연령 제한: " + filmRating + "]";
	}
	
	
}

	