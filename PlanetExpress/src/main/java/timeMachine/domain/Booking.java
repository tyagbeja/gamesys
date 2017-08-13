package timeMachine.domain;

public class Booking {
	String status;
	public Booking(String status, String message) {
		setStatus(status);
		setMessage(message);
	}
	public final String getStatus() {
		return status;
	}
	public final void setStatus(String status) {
		this.status = status;
	}
	public final String getMessage() {
		return message;
	}
	public final void setMessage(String message) {
		this.message = message;
	}
	String message;
	
}
