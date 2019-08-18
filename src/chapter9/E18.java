package chapter9;

public class E18 {
	public static void ride(CycleFactory factory) {
		Cycle c = factory.getCycle();
		System.out.println("Num. of wheels: " + c.wheels());
	}

	public static void main(String[] args) {
		ride(new UnicycleFactory());
		ride(new BicycleFactory());
		ride(new TricycleFactory());
	}
}

interface Cycle {
	int wheels();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {
	public int wheels() {
		return 1;
	}
}

class UnicycleFactory implements CycleFactory {
	public Unicycle getCycle() {
		return new Unicycle();
	}
}

class Bicycle implements Cycle {
	public int wheels() {
		return 2;
	}
}

class BicycleFactory implements CycleFactory {
	public Bicycle getCycle() {
		return new Bicycle();
	}
}

class Tricycle implements Cycle {
	public int wheels() {
		return 3;
	}
}

class TricycleFactory implements CycleFactory {
	public Tricycle getCycle() {
		return new Tricycle();
	}
}
