package chapter8;

public class E01 {
	public void ride(Cycle c) {
		// c.run();
		c.wheels();
	}

	public static void main(String[] args) {
		E01 e = new E01();
		e.ride(new Cycle());
		e.ride(new Unicycle());
		e.ride(new Bicycle());
		e.ride(new Tricycle());
	}
}

class Cycle {
	int wheel = 2;

	public void run() {
		System.out.println("cycle run...");
	}

	public void wheels() {
		System.out.println("the amount of wheel is " + wheel);
	}
}

class Unicycle extends Cycle {
	int wheel = 4;

	public void run() {
		System.out.println("unicycle run...");
	}

	public void wheels() {
		System.out.println("the amount of wheel is " + super.wheel);
	}
}

class Bicycle extends Cycle {
	int wheel = 6;

	public void run() {
		System.out.println("bicycle run...");
	}

	public void wheels() {
		System.out.println("the amount of wheel is " + super.wheel);
	}
}

class Tricycle extends Cycle {
	int wheel = 8;

	public void run() {
		System.out.println("tricycle run...");
	}

	public void wheels() {
		System.out.println("the amount of wheel is " + super.wheel);
	}
}
