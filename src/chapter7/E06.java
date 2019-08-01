package chapter7;

import static net.mindview.util.Print.print;

public class E06 extends BoardGame {
	public E06() {
		super(23);
		// Implicit super constructor BoardGame() is undefined. Must explicitly invoke
		// another constructor
	}
}

class Game {
	Game(int i) {
		print("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		print("BoardGame constructor");
	}
}
