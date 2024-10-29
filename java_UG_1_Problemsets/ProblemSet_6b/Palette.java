package ProblemSet_6b;

public class Palette {
	private P_COLOUR[] primaryColours;

	public Palette() {
		primaryColours = new P_COLOUR[3];
	}
	public Palette(P_COLOUR[] colours) {
		primaryColours = colours;
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
				text += colour + ", ";
			}
		}
		if (text == "") {
			return "No colours added";
		}
		if (text.charAt(text.length() - 2) == ',') {
			text = text.substring(0, text.length() - 2);
		}
		return text;
	}
}
