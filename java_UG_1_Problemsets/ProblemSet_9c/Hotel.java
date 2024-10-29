package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private String name;
	private List<IGuest> guests;

	public Hotel(String name) {
		this.name = name;
		this.guests = new ArrayList<IGuest>();
	}

	public void addGuest(IGuest guests) {
		this.guests.add(guests);
	}
	public String printGuestList() {
		String text = name + " Hotel\nGuest List\n";
		for (IGuest guest:guests) {
			text += guest.toString() + "\n";
		}
		return text;
	}

	public String getName() {
		return name;
	}

	public List<IGuest> getGuests() {
		return guests;
	}
}
