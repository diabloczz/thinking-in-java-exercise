package chapter3;

public class E10 {
	public static void main(String[] args) {
		int a = 0x55555555;
		int b = 0xaaaaaaaa;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		int c = a & b;
		System.out.println(Integer.toBinaryString(c));
		c = a | b;
		System.out.println(Integer.toBinaryString(c));
		c = a ^ b;
		System.out.println(Integer.toBinaryString(c));
	}
}
