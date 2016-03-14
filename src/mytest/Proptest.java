package mytest;
import java.util.Hashtable;
import java.util.Properties;
//Properties 继承于 Hashtable.表示一个持久的属性集.属性列表中每个键及其对应值都是一个字符串。
//Properties 类被许多Java类使用。例如，在获取环境变量时它就作为System.getProperties()方法的返回值。
//Properties 定义如下实例变量.这个变量持有一个Properties对象相关的默认属性列表。
public class Proptest {
public static void main(String args[]){
	Properties aa=new Properties();
	//Object setProperty(String key, String value)
aa.put(11, "haha");
aa.put(22, "xixi");
aa.put(33, "hehe");
String bb=aa.getProperty("haha","Not Found");
//用指定的键在属性列表中搜索属性。
//后面的是默认的值，如果不存在就这么返回
//String getProperty(String key, String defaultProperty)
//String getProperty(String key)


System.out.println(bb);

System.out.println("----------------------------");
Properties pps = System.getProperties();
// 将属性列表输出到指定的输出流。

pps.list(System.out);
}
}
