package mytest;
import java.util.Enumeration;
import java.util.Hashtable;
public class Hashtest {
public static void main(String arg[]){
	Hashtable aa=new Hashtable();
	//Object put(Object key, Object value)
	Enumeration bb;
	//����bbΪö�ٶ���
	aa.put(0, 1);
	aa.put(1, 2);
	aa.put(2, 3);
	bb=aa.keys();
 System.out.println(aa.get(1));
System.out.println("---------------");
System.out.println(bb.nextElement());
System.out.println("---------------");
boolean cont=aa.containsKey(1);
//����ָ�������Ƿ�Ϊ�˹�ϣ���еļ���
boolean vue=aa.containsValue("a");
//a������Ϊɶ���ص���ture
//����ָ�������Ƿ�Ϊ�˹�ϣ���еļ���
System.out.println("test the key is exists?");
System.out.println(cont);
System.out.println("---------------");
System.out.println("check the value is exists?");

System.out.println(vue);
  Object cc = aa.clone();
  //�����˹�ϣ���ǳ������
  System.out.println("test the clone option");

System.out.println(cc);
aa.remove(2);

System.out.println("---------------");
System.out.println("test the remove key option");

System.out.println(aa);
  }
}
