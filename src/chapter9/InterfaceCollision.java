//: interfaces/InterfaceCollision.java
package chapter9;

interface I1 {
	void f();
}

interface I2 {
	int f(int i);
}

interface I3 {
	int f();
}

class C {
	public int f() {
		return 1;
	}
}

class C2 implements I1, I2 {
	public void f() {
	}

	public int f(int i) {
		return 1;
	} // overloaded
}

class C3 extends C implements I2 {
	public int f(int i) {
		return 1;
	} // overloaded
}

class C4 extends C implements I3 {
	// Identical, no problem:
	public int f() {
		return 1;
	}
}

// Methods differ only by return type:
// class C5 extends C implements I1 {}//The return types are incompatible for the inherited methods I1.f(), C.f()
// interface I4 extends I1, I3 {} ///:~same  compile error as above
