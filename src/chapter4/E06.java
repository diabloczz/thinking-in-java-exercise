package chapter4;

/**
 * 测试 return
 * 
 * @author czz
 *
 */
public class E06 {
	public static boolean test(int val, int begin, int end) {
		return (val > begin && val < end) ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(test(12, 3, 5));
		System.out.println(test(12, 3, 15));
	}
}
