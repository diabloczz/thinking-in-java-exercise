package chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class E12 {
  public static List<Integer> generate(int size) {
	  List<Integer> list =new ArrayList<>();
	  for(int i=0;i<size;i++) {
		  list.add(i);
	  }
	  return list;
  }
  public static void main(String[] args) {
	List<Integer> list1 = generate(10);
	List<Integer>  list2=new ArrayList<>(list1);
	System.out.println("list1:"+list1);
	System.out.println("list2:"+list2);
	ListIterator<Integer> listIterator1 = list1.listIterator();
	ListIterator<Integer> listIterator2 = list2.listIterator(list1.size());//此时已经移动到了末尾，n个元素有n+1个下标，最大下标为n(从0开始)
	while(listIterator1.hasNext()) {
		if(listIterator2.hasPrevious()) {
			listIterator2.previous();
			listIterator2.set(listIterator1.next());
		}
			
	}
	System.out.println("list2:"+list2);
}
}
