package chapter9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class E16 extends CharGenerator implements Readable {
	private int count;

	public E16(int length, int count) {
		super(length);
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0) {
			return -1;
		}
		cb.append(generate());
		return 1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(new E16(10, 7));
		while (scan.hasNext()) {
			System.out.println(scan.next());
		}
	}
}
