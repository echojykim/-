package kh.java.project.main;

public class Theater {

	private String place; //상영관 위치(도로명주소)
	private String connectAdviser; //상담원 연결(연락처)
	private String traffic; //교통안내
	private String parking; //주차안내
	private String guidance; //교환안내 안된다는 설명
	
	public Theater() {}
	
	public Theater(String place, String connectAdviser, String traffic, String parking, String guidance) {
		super();
		this.place = place;
		this.connectAdviser = connectAdviser;
		this.traffic = traffic;
		this.parking = parking;
		this.guidance = guidance;
	}


	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getConnectAdviser() {
		return connectAdviser;
	}

	public void setConnectAdviser(String connectAdviser) {
		this.connectAdviser = connectAdviser;
	}

	public String getTraffic() {
		return traffic;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getGuidance() {
		return guidance;
	}

	public void setGuidance(String guidance) {
		this.guidance = guidance;
	}

	@Override
	public String toString() {
		return "Theater [위치: " + place + ", cgv 상담원연결: " + connectAdviser + ", 교통안내: " + traffic + ", 주차안내: "
				+ parking + ", 안내사항: " + guidance + "]";
	}
	
	
}
