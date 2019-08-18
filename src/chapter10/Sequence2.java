package chapter10;
//: innerclasses/Sequence.java

// Holds a sequence of Objects.

interface Selector2 {
	boolean end();

	Object current();

	void next();

	public Sequence2 getOutclass();
}

public class Sequence2 {
	private Object[] items;
	private int next = 0;

	public Sequence2(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}

	private class SequenceSelector2 implements Selector2 {
		private int i = 0;

		public boolean end() {
			return i == items.length;
		}

		public Object current() {
			return items[i];
		}

		public Sequence2 getOutclass() {
			return Sequence2.this;
		}

		public void next() {
			if (i < items.length)
				i++;
		}
	}

	public Selector2 selector() {
		return new SequenceSelector2();
	}

	public static void main(String[] args) {
		Sequence2 sequence = new Sequence2(10);
		Selector2 selector2 = sequence.selector();
		System.out.println(selector2.getOutclass());

	}
} /*
	 * Output: 0 1 2 3 4 5 6 7 8 9
	 */// :~
