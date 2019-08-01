package chapter4;

public class E07 {
	public static void main(String[] args) {
		int i = 0;
		while (true) {

			System.out.println(++i);
			if (i == 99) {
				return;
			}
		}
	}
}
