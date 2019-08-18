package chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class E04 {
	int index=0;
  public static String [] movies= {"肖生克的救赎","闻香识女人","魔戒：护戒使者","魔戒：双塔奇兵","魔戒：王者归来","地球上最后一个男人","本杰明巴顿奇事"};
  public String next() {
	  if(index==movies.length)
		  index=0;
	  return movies[index++];
  }
  public  String  generate(Collection<String> c) {
	  index=0;
	  for(int i=0;i<10;i++) {
			c.add(next());
		}
	  return c.toString();
  }
  
  public static void main(String[] args) {
	E04 e =new E04();
	System.out.println(e.generate(new ArrayList<>()));
	System.out.println(e.generate(new LinkedList<>()));
	System.out.println(e.generate(new HashSet<>()));
	System.out.println(e.generate(new LinkedHashSet<>()));
	System.out.println(e.generate(new TreeSet<>()));
}
}
