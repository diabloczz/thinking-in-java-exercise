package chapter3;

public class E11 {
	public static void main(String[] args) {
		int i = -1;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(i <<= 1));
		for (int j = 0; j < 32; j++) {
			System.out.println(Integer.toBinaryString(i >>>= 1));
		}
	}
}
