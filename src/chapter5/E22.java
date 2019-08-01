package chapter5;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class E22 {
	static void describe(E21 pct) {
		printnb(pct + " has a portrait of ");
		switch (pct) {
		case ONE:
			print("George Washington");
			break;

		case TWO:
			print("Thomas Jefferson");
			break;
		case FIVE:
			print("Abraham Lincoln");
			break;
		case TEN:
			print("Alexander Hamilton");
			break;
		case TWENTY:
			print("Andrew Jackson");
			break;
		case FIFTY:
			print("U.S. Grant");
			break;
		}
	}

	public static void main(String args[]) {
		for (E21 s : E21.values())
			describe(s);
	}
}
