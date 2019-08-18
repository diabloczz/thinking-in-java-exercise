package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E07 {
  public static Gerbil[] generate(int size) {
	  Gerbil[] array=new Gerbil[size];
	  for(int i=0;i<size;i++) {
		  array[i]=new Gerbil(i);
	  }
	  return array;
  }
  
  public static void main(String[] args) {
	List<Gerbil> gerbilList =new ArrayList<>(Arrays.asList(generate(10)));
	System.out.println("gerbilList:"+gerbilList);
	List<Gerbil> sub=gerbilList.subList(1, 3);
	System.out.println("sub:"+sub);
	//gerbilList.removeAll(sub);  将数组转化为集合使用Arrays.asList方法，但是注意此方法返回的是一个不可变集合（Arrays.asList()返回的
	//ArrayList继承自AbstractList，它仅支持那些不会改变数组大小的操作），对集合的扩容或减容都会报错,所以将此方法产生的定长list当做构造参数创建新的集合实例即可。
	                            
	gerbilList.removeAll(sub);
	System.out.println("gerbilList:"+gerbilList);
}
}
