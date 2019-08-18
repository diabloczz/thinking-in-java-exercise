package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E08 {
public static void main(String[] args) {
	List<Gerbil> list = new ArrayList<>();
	for (int i = 0; i < 3; i++) {
		list.add(new Gerbil(i));
	}
	Iterator<Gerbil> iterator=list.iterator();
	while(iterator.hasNext()) {
		iterator.next().hop();
	}
}
}
