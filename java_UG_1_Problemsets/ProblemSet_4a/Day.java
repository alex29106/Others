package ProblemSet_4a;

public class Day {
	private String name = null;
	private Session[] sessions;
	private String text = "";

	public Day(String name) {
		super();
		this.name = name;
		this.sessions = new Session[4];
	}

	public String getName() {
		return name;
	}
	public Session getSessions(int inIndex) {
		return sessions[inIndex];
	}
	public void setSession(int inIndex, String inModuleName,
			int inStartTime, int inEndTime) {
		sessions[inIndex] = new Session(inModuleName,
				inStartTime, inEndTime);
	}
	public String toString() {
		for (int i = 0; i < sessions.length; i++) {
		    if (sessions[i] != null) {
		        text += sessions[i].getSessionName() + ": "
		        	 + sessions[i].getStartTime() + " - "
		        	 + sessions[i].getEndTime() + "\n";
		    }
		}
		return text;
	}
}
