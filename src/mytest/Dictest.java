package mytest;

import java.util.Dictionary;
import java.util.Hashtable;;

//dictionary类测试，
//Dictionary 类是任何可将键映射到相应值的类（如 Hashtable）的抽象父类。
//每个键和每个值都是一个对象。在任何一个 Dictionary 对象中，每个键至多与一个值相关联。
//给定一个 Dictionary 和一个键，就可以查找所关联的元素。任何非 null 对象都可以用作键或值。
public class Dictest {
	public static void main(String args[]) {
		Dictionary aa = new Hashtable();
		System.out.println("is the hash table empty?:" + aa.isEmpty());
		System.out.println("----------------------------------------------");
		aa.put(1, "one");
		aa.put(0, "zero");
		aa.put(2, "two");
		// Object put(Object key, Object value)指定ele的值
		for (int i = 0; i < aa.size(); i++) {
			System.out.println(aa.get(i));
		}
		System.out.println("------------------------------------");

		aa.remove(0);

		for (int k = 0; k <aa.size(); k++) {
			System.out.println(aa.get(k));
		}
		//为什么不显示the？

	}
}
