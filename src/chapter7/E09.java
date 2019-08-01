package chapter7;

public class E09 {
	public static void main(String[] args) {
		new Stem();
	}

}

class Component1 {
	public Component1(String s) {
		System.out.println(s + " Component1");
	}

	public void dispose(String s) {
		System.out.println(s + " Component1 dispose");
	}
}

class Component2 {
	public Component2(String s) {
		System.out.println(s + " Component2");
	}

	public void dispose(String s) {
		System.out.println(s + " Component2 dispose");
	}
}

class Component3 {
	public Component3(String s) {
		System.out.println(s + " Component3");
	}

	public void dispose(String s) {
		System.out.println(s + " Component3 dispose");
	}
}

class Root {
	Component1 c1 = new Component1("root");
	Component2 c2 = new Component2("root");
	Component3 c3 = new Component3("root");

	public Root() {
		System.out.println("Root");
	}

	public void dispose() {
		System.out.println("Root dispose");
		c3.dispose("root");
		c2.dispose("root");
		c1.dispose("root");

	}
}

class Stem extends Root {
	Component1 c1 = new Component1("stem");
	Component2 c2 = new Component2("stem");
	Component3 c3 = new Component3("stem");

	public Stem() {
		System.out.println("Stem");
	}

	public void dispose() {
		System.out.println("Stem dispose");
		c3.dispose("stem");
		c2.dispose("stem");
		c1.dispose("stem");
		super.dispose();

	}
}
