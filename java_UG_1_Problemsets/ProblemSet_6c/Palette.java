package ProblemSet_6c;


public class Palette {
	private P_COLOUR[] primaryColours;

	public Palette() {
		primaryColours = new P_COLOUR[3];
	}
	public Palette(P_COLOUR[] colours) {
		if (colours.length > 3) {
			throw new IllegalArgumentException("");
		}
		this.primaryColours = colours;
	}

	public void addColour(P_COLOUR colour) {
		for (int i = 0; i < 3; i++) {
			if (primaryColours[i] == colour) {
				throw new IllegalArgumentException("");
			} else if (primaryColours[i] == null) {
				primaryColours[i] = colour;
				break;
			}
		}
	}

	public String getColours() {
		String text = "";
		for (P_COLOUR colour: primaryColours) {
			if (colour != null) {
				if (text == "") {
					text += colour;
				} else {
					text += ", " + colour;
				}
			}
		}
		if (text == "") {
			return "No colours added";
		}
		return text;
	}

	public String mixColours() {
	    int mask = 0;
		for (P_COLOUR colour: primaryColours) {
			if (colour != null) {
				String name = colour.name();
				switch (name) {
					case "RED": mask = mask | 4; break;
					case "YELLOW": mask = mask | 2; break;
					case "BLUE": mask = mask | 1; break;
					default: mask = mask | 0; break;
				}
			}
		}
		switch (mask) {
			case 1: return "BLUE";
			case 2: return "YELLOW";
			case 3: return "GREEN";
			case 4: return "RED";
			case 5: return "PURPLE";
			case 6: return "ORANGE";
			case 7: return "BLACK";
			default: return "";
		}
	}

	public String display() {
		return getColours() + " = " + mixColours();
	}
}
