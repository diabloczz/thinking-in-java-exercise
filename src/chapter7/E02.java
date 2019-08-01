package chapter7;

import java.util.HashMap;
import java.util.Map;

public class E02 extends Detergent {
	public void scrub() {
		append(" NewDetergent.scrub()");
		super.scrub(); // Doesn't have to be first
	}

	public void sterilize() {
		append(" sterilize()");
	}

	public static void main(String[] args) {
		E02 e = new E02();
		e.dilute();
		e.scrub();
		e.sterilize();
		System.out.println(e);

		Map a = new HashMap();
	}
}
