package chapter11;

import static net.mindview.util.Print.print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import typeinfo.pets.Cymric;
import typeinfo.pets.Hamster;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class E05 {
  public static void main(String[] args) {
	  Random rand = new Random(47);
	List<Integer> pets =new ArrayList<>();
	for(int i=0;i<8;i++) {
		pets.add(i);
	}
		print("1: " + pets);
		pets.add(8); // Automatically resizes
		print("2: " + pets);
		print("3: " + pets.contains(8));
		pets.remove(8); // Remove by object
		Integer p = pets.get(2);
		print("4: " + p + " " + pets.indexOf(p));
		Integer cymric=4;
		print("5: " + pets.indexOf(cymric));
		print("6: " + pets.remove(cymric));
		// Must be the exact object:
		print("7: " + pets.remove(p));
		print("8: " + pets);
		pets.add(3, 15); // Insert at an index
		print("9: " + pets);
		List<Integer> sub = pets.subList(1, 4);
		print("subList: " + sub);
		print("10: " + pets.containsAll(sub));
		Collections.sort(sub); // In-place sort
		print("sorted subList: " + sub);
		// Order is not important in containsAll():
		print("11: " + pets.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		print("shuffled subList: " + sub);
		print("12: " + pets.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(pets);
		sub = Arrays.asList(pets.get(1), pets.get(4));
		print("sub: " + sub);
		copy.retainAll(sub);
		print("13: " + copy);
		copy = new ArrayList<Integer>(pets); // Get a fresh copy
		print("13-1: " + copy);
		copy.remove(2); // Remove by index
		print("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		print("15: " + copy);
		copy.set(1, 16); // Replace an element
		print("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		print("17: " + copy);
		print("18: " + pets.isEmpty());
		pets.clear(); // Remove all elements
		print("19: " + pets);
		print("20: " + pets.isEmpty());
		pets.addAll(Arrays.asList(20,21,22,23));
		print("21: " + pets);
		Object[] o = pets.toArray();
		print("22: " + o[3]);
		Integer[] pa = pets.toArray(new Integer[0]);
		print("23: " + pa[3]);
}
}
