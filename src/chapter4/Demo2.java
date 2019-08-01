package chapter4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("sss");
		a.add("ccc");
		a.add("aaa");
		a.add("bbb");
		Iterator it = a.iterator();
		while (it.hasNext()) {
			Object str = it.next();
			if ("aaa".equals(str)) {
				it.remove();
			}

		}
		System.out.println(a);
	}
}
