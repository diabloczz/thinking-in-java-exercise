package chapter4;

/**
 * ，手写一个方法，不使用Integer.toBinaryString()方法，显示整数的二进制显示。 利用此方法显示所有可能整数的组合运算
 * 
 * @author Administrator
 *
 */
public class E05 {
	// 将一个整数(计算机中按二进制补码存储),通过 & 0x01截取最高位,再将整数进行移位，依次截取，来获得改整数的完整二进制显示
	public static String toBinaryString(int i) {
		int digit = 31;
		char[] binary = new char[32];
		for (int a = 0; a < 32; a++) {
			binary[digit--] = (i & 0x01) == 1 ? '1' : '0';
			i >>>= 1;
		}
		return new String(binary);
	}

	public static void main(String[] args) {
		// System.out.println(toBinaryString(-127));
		System.out.println(toBinaryString(0xffffffff));
		System.out.println(toBinaryString(0xaaaaaaaa));
		System.out.println(toBinaryString(~0xffffffff));
		System.out.println(toBinaryString(~0xaaaaaaaa));
		System.out.println(toBinaryString(0xffffffff & 0xaaaaaaaa));
		System.out.println(toBinaryString(0xffffffff | 0xaaaaaaaa));
		System.out.println(toBinaryString(0xffffffff ^ 0xaaaaaaaa));
	}
}
