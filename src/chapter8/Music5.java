//: interfaces/music5/Music5.java
// Interfaces.
package chapter8;

import static net.mindview.util.Print.print;

import chapter9.Note;
import chapter9.Playable;

interface Instrument {
	// Compile-time constant:
	int VALUE = 5; // static & final
	// Cannot have method definitions:

	void adjust();
}

class Wind implements Instrument, Playable {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Percussion implements Instrument, Playable {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Stringed implements Instrument, Playable {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwind";
	}
}

public class Music5 {
	// Doesn't care about type, so new types
	// added to the system still work right:
	static void tune(Playable i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] e) {
		for (Playable i : e)
			tune(i);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Playable[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
} /*
	 * Output: Wind.play() MIDDLE_C Percussion.play() MIDDLE_C Stringed.play()
	 * MIDDLE_C Brass.play() MIDDLE_C Woodwind.play() MIDDLE_C
	 */// :~
