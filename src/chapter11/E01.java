package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E01 {
	public static void main(String[] args) {
		List<Gerbil> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			list.add(new Gerbil(i));
		}
		for (Gerbil b : list) {
			b.hop();
		}
//		List<Integer> list = new ArrayList<>();
//		list.addAll(Arrays.asList(2,3,22,1,44,5,1));
//		System.out.println(list);
//		list.remove(2);
//		System.out.println(list);
//		list.remove(Integer.valueOf(1));
//		System.out.println(list);
	}
}
