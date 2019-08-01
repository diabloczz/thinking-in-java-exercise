package chapter4;

public class E0902 {
	public static int fib(int amount) {

		if (amount <= 2) {
			return 1;
		}
		return fib(amount - 1) + fib(amount - 2);
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i <= 0) {
				System.out.println("arg must be positive");
			} else {
				System.out.println(fib(i));
			}

		}

	}
}
