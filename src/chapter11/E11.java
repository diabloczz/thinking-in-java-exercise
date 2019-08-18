package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class E11 {
  public static void printIterator(Collection<?> c) {
	  System.out.println();
	  Iterator<?> iterator = c.iterator();
	  while(iterator.hasNext()) {
		  System.out.print(iterator.next().toString()+" ");
	  }
  }
  public static void main(String[] args) {
	  printIterator(new ArrayList<String>(Arrays.asList("aaaa","bbbb","cccc")));
	  printIterator(new LinkedList<Integer>(Arrays.asList(123,456,789)));
	  printIterator(new TreeSet<Double>(Arrays.asList(521.0123,396.5864,8965.02)));
}
}
