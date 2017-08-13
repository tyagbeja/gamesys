package timeMachine.domain;

public class Passenger {
		
	private int pgid;
	
	private String place;
	
	private String date;
	
	public final int getPgid() {
		return pgid;
	}
	public final void setPgid(int pgid) {
		this.pgid = pgid;
	}
	public final String getPlace() {
		return place;
	}
	public final void setPlace(String place) {
		this.place = place;
	}
	public final String getDate() {
		return date;
	}
	public final void setDate(String date) {
		this.date = date;
	}
	
}
