package mytest;
import java.util.Enumeration;
import java.util.Hashtable;
public class Hashtest {
public static void main(String arg[]){
	Hashtable aa=new Hashtable();
	//Object put(Object key, Object value)
	Enumeration bb;
	//定义bb为枚举对象
	aa.put(0, 1);
	aa.put(1, 2);
	aa.put(2, 3);
	bb=aa.keys();
 System.out.println(aa.get(1));
System.out.println("---------------");
System.out.println(bb.nextElement());
System.out.println("---------------");
boolean cont=aa.containsKey(1);
//测试指定对象是否为此哈希表中的键。
boolean vue=aa.containsValue("a");
//a不存在为啥返回的是ture
//测试指定对象是否为此哈希表中的键。
System.out.println("test the key is exists?");
System.out.println(cont);
System.out.println("---------------");
System.out.println("check the value is exists?");

System.out.println(vue);
  Object cc = aa.clone();
  //创建此哈希表的浅表副本。
  System.out.println("test the clone option");

System.out.println(cc);
aa.remove(2);

System.out.println("---------------");
System.out.println("test the remove key option");

System.out.println(aa);
  }
}
