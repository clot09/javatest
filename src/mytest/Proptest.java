package mytest;
import java.util.Hashtable;
import java.util.Properties;
//Properties �̳��� Hashtable.��ʾһ���־õ����Լ�.�����б���ÿ���������Ӧֵ����һ���ַ�����
//Properties �౻���Java��ʹ�á����磬�ڻ�ȡ��������ʱ������ΪSystem.getProperties()�����ķ���ֵ��
//Properties ��������ʵ������.�����������һ��Properties������ص�Ĭ�������б�
public class Proptest {
public static void main(String args[]){
	Properties aa=new Properties();
	//Object setProperty(String key, String value)
aa.put(11, "haha");
aa.put(22, "xixi");
aa.put(33, "hehe");
String bb=aa.getProperty("haha","Not Found");
//��ָ���ļ��������б����������ԡ�
//�������Ĭ�ϵ�ֵ����������ھ���ô����
//String getProperty(String key, String defaultProperty)
//String getProperty(String key)


System.out.println(bb);

System.out.println("----------------------------");
Properties pps = System.getProperties();
// �������б������ָ�����������

pps.list(System.out);
}
}
