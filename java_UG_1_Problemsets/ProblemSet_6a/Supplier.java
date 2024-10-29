package ProblemSet_6a;
import java.util.regex.Pattern;

public class Supplier {
		private String name;
		private String phone;
		private static final String PHONE_REGEX =
				"01483-{0,1}[0-9]{6}";
		public Supplier(String name, String phone) {
			this.name = name;
			if (Pattern.matches(PHONE_REGEX, phone)) {
				this.phone = phone;
			} else {
				throw new IllegalArgumentException();
			}
		}
		public String toString() {
			return name + "(" + phone + ")";
		}
		public String getName() {
			return name;
		}
		public String getPhone() {
			return phone;
		}
}
