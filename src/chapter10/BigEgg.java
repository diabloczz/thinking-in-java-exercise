package chapter10;

//: innerclasses/BigEgg.java
// An inner class cannot be overriden like a method.
import static net.mindview.util.Print.print;

class Egg {
	private Yolk y;

	protected class Yolk {
		public Yolk() {
			print("Egg.Yolk()");
		}
	}

	public Egg() {
		print("New Egg()");
		y = new Yolk();
	}
}

public class BigEgg extends Egg {
	public class Yolk {
		public Yolk() {
			print("BigEgg.Yolk()");
		}
	}

	public BigEgg() {
		new Egg.Yolk();
	};

	public static void main(String[] args) {
		new BigEgg();
	}
} /*
	 * Output: New Egg() Egg.Yolk()
	 */// :~
