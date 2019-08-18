package chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class E14 {
 public static void main(String[] args) {
	 List<Integer> list =new ArrayList<>();
	 ListIterator<Integer> listIterator = list.listIterator();
	  for(int i=0;i<15;i++) {
		  if(list.size()%2==0&&list.size()!=0)
			  listIterator.previous();
		  listIterator.add(i);
	  }
	  System.out.println(list);
}
}
