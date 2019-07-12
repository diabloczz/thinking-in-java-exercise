package chapter2;

public class InitializeDemo2 {
	static {
		System.out.println("InitializeDemo2.static block start");
	}

	public InitializeDemo2(String str) {
		System.out.println("InitializeDemo2.gouzao method start:" + str);
	}
}
