package chapter11;

import java.util.Collection;
import java.util.HashSet;

public class E02 {
	public static void main(String[] args) {
	    Collection<Integer> c = new HashSet<Integer>();
	    for(int i = 0; i < 10; i++)
	      c.add(i); // Autoboxing
	    for(Integer i : c)
	      System.out.print(i + ", ");
	  }
}
