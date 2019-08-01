package chapter4;

import static net.mindview.util.Print.printnb;

public class E09 {
	public static void printF(int amount) {
		if (amount == 1) {
			printnb(1);
		} else if (amount == 2) {
			printnb(1 + " ");
			printnb(1);
		} else {
			int[] all = new int[amount];
			all[0] = 1;
			all[1] = 1;
			for (int i = 2; i < amount; i++) {
				all[i] = all[i - 1] + all[i - 2];
			}
			for (int j : all) {
				printnb(j + " ");
			}
		}
	}

	public static void main(String[] args) {
		printF(10);
	}
}
