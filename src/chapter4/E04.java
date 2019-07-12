package chapter4;

/**
 * 打印素数
 * 
 * @author czz
 *
 */
public class E04 {
	public static void main(String[] args) {
		// 规定挑选素数的范围
		for (int i = 0; i < 100; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					// 如果能被整除,次数加一
					count++;
				}
			}
			if (count == 2) {
				System.out.println("发现一个素数:" + i);

			}
		}
	}
}
