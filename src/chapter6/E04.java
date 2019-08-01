package chapter6;

import test.DebugOff;
import test.Father;

public class E04 extends Father {
	public static void main(String[] args) {
		E04 e = new E04();
		e.a();
		DebugOff ee = new DebugOff();
		// ee.a();//The method a() from the type DebugOff is not visible
	}
}
