package ProblemSet_4a;

public class Session {
	private int startTime = 0;
	private int endTime = 0;
	private String sessionName = null;

	public Session(String sessionName, int startTime, int endTime) {
		super();
		this.sessionName = sessionName;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getStartTime() {
		return startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public String getSessionName() {
		return sessionName;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
}
