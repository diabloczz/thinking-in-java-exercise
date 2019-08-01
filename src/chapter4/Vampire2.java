package chapter4;

public class Vampire2 {
	public static void isVampire(int n) {
		int kilo = n / 1000;
		// System.out.println(kilo);
		int hundred = (n % 1000) / 100;
		// System.out.println(hundred);
		int decade = ((n % 1000) % 100) / 10;
		// System.out.println(decade);
		int unit = ((n % 1000) % 100) % 10;
		// System.out.println(unit);
		if (n == (kilo * 10 + hundred) * (decade * 10 + unit)) {
			System.out.println(n + "=" + (kilo * 10 + hundred) + "*" + (decade * 10 + unit));
			// return true;
		}
		if (n == (hundred * 10 + kilo) * (decade * 10 + unit)) {
			System.out.println(n + "=" + (hundred * 10 + kilo) + "*" + (decade * 10 + unit));
			// return true;
		}
		if (n == (kilo * 10 + hundred) * (unit * 10 + decade)) {
			System.out.println(n + "=" + (kilo * 10 + hundred) + "*" + (unit * 10 + decade));
			// return true;
		}
		if (n == (hundred * 10 + kilo) * (unit * 10 + decade)) {
			System.out.println(n + "=" + (hundred * 10 + kilo) + "*" + (unit * 10 + decade));
			// return true;
		}
		if (n == (kilo * 10 + decade) * (hundred * 10 + unit)) {
			System.out.println(n + "=" + (kilo * 10 + decade) + "*" + (hundred * 10 + unit));
			// return true;
		}
		if (n == (decade * 10 + kilo) * (hundred * 10 + unit)) {
			System.out.println(n + "=" + (decade * 10 + kilo) + "*" + (hundred * 10 + unit));
			// return true;
		}
		if (n == (kilo * 10 + decade) * (unit * 10 + hundred)) {
			System.out.println(n + "=" + (kilo * 10 + decade) + "*" + (unit * 10 + hundred));
			// return true;
		}
		if (n == (decade * 10 + kilo) * (unit * 10 + hundred)) {
			System.out.println(n + "=" + (decade * 10 + kilo) + "*" + (unit * 10 + hundred));
			// return true;
		}
		if (n == (kilo * 10 + unit) * (hundred * 10 + decade)) {
			System.out.println(n + "=" + (kilo * 10 + unit) + "*" + (hundred * 10 + decade));
			// return true;
		}
		if (n == (unit * 10 + kilo) * (hundred * 10 + decade)) {
			System.out.println(n + "=" + (unit * 10 + kilo) + "*" + (hundred * 10 + decade));
			// return true;
		}
		if (n == (kilo * 10 + unit) * (decade * 10 + hundred)) {
			System.out.println(n + "=" + (kilo * 10 + unit) + "*" + (decade * 10 + hundred));
			// return true;
		}
		if (n == (unit * 10 + kilo) * (decade * 10 + hundred)) {
			System.out.println(n + "=" + (unit * 10 + kilo) + "*" + (decade * 10 + hundred));
			// return true;
		}

	}

	public static void main(String[] args) {
		for (int i = 1000; i <= 9999; i++) {
			isVampire(i);
		}
	}
}
