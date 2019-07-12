package chapter3;

public class Constant {
	public static void main(String[] args) {
		Long l = 200000L;
		System.out.println(Long.toOctalString(l));
		Long ll = 0155L;
		System.out.println(Long.toBinaryString(ll));
		ll = 0xffffL;
		System.out.println(Long.toBinaryString(ll));
	}
}
