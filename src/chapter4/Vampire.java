package chapter4;

/**
 * 输入特定位数的所有吸血鬼数字
 * 
 * @author Administrator
 *
 */
public class Vampire {
	public static void printAllVampireNum(int digit) {
		if (digit % 2 != 0) {
			System.out.println("The number of vampires must be even");
			return;
		} else {

		}
	}

	public static int getMin(int digit) {
		// java中计算位权的方法，第一位位底数，第二位为位权
		return (int) Math.pow(10, digit - 1);
	}

	public static int getMax(int digit) {
		int i = 0;
		for (int j = 0; j < digit; j++) {
			i += 9 * Math.pow(10, j);
		}
		return i;
	}

	/**
	 * 根据一个数和它的位数，计算其每一位的权值
	 * 
	 * @param i
	 * @param digit
	 */
	public static void count(int i, int digit) {

	}

	public static void main(String[] args) {
		System.out.println(getMax(4));
		System.out.println(getMin(4));
	}
}
