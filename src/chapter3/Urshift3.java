package chapter3;

public class Urshift3 {
	public static void main(String[] args) {
//		short i = -8;
//		System.out.println(Integer.toBinaryString(i));
//		String a = "11000";
//		System.out.println(Integer.parseInt(a, 2));

		int a = 0X80000000;
		System.out.println(Integer.toBinaryString(a));
		for (int i = 0; i < 31; i++) {
			System.out.println(Integer.toBinaryString(a >>= 1));
		}
	}
}
