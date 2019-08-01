package chapter8;

public class E09 {
	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[] { new Mouse(), new Gerbil(), new Hamster() };
		for (Rodent c : rodents) {
			c.run();
		}
	}
}

class Rodent {
	public void run() {
		System.out.println("rodent is running...");
	}
}

class Mouse extends Rodent {
	public void run() {
		System.out.println("mouse is running...");
	}
}

class Gerbil extends Rodent {
	public void run() {
		System.out.println("Gerbil is running...");
	}
}

class Hamster extends Rodent {
	public void run() {
		System.out.println("Hamster is running...");
	}
}
