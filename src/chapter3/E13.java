package chapter3;

public class E13 {
	public static void showCharInBinary(char c) {
		System.out.println(c + ":" + Integer.toBinaryString(c));
	}

	public static void main(String[] args) {
		char[] c = { 'q', 'a', '1', '+' };
		for (int i = 0; i < c.length; i++) {
			showCharInBinary(c[i]);
		}

	}
}
