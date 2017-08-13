package timeMachine.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	public final Integer getId() {
		return id;
	}
	public final void setId(Integer id) {
		this.id = id;
	}
	private long pgid;
	
	private String place;
	
	private Date date;
	
	public final long getPgid() {
		return pgid;
	}
	public final void setPgid(long pgid) {
		this.pgid = pgid;
	}
	public final String getPlace() {
		return place;
	}
	public final void setPlace(String place) {
		this.place = place;
	}
	public final Date getDate() {
		return date;
	}
	public final void setDate(Date date) {
		this.date = date;
	}
	
}
