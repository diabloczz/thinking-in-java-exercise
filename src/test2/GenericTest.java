package test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericTest {
	public <T> void add(Collection<T> c) {
		c.add((T) new Father());
		c.add((T) new Son());

	}

	public static void main(String[] args) {
		// ~ Cannot create a generic array of ArrayList<Integer>
		// List<Integer> [] list =new ArrayList<Integer>[6];
		List<?>[] list = new ArrayList<?>[6];
	}
}
