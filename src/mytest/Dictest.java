package mytest;

import java.util.Dictionary;
import java.util.Hashtable;;

//dictionary����ԣ�
//Dictionary �����κοɽ���ӳ�䵽��Ӧֵ���ࣨ�� Hashtable���ĳ����ࡣ
//ÿ������ÿ��ֵ����һ���������κ�һ�� Dictionary �����У�ÿ����������һ��ֵ�������
//����һ�� Dictionary ��һ�������Ϳ��Բ�����������Ԫ�ء��κη� null ���󶼿�����������ֵ��
public class Dictest {
	public static void main(String args[]) {
		Dictionary aa = new Hashtable();
		System.out.println("is the hash table empty?:" + aa.isEmpty());
		System.out.println("----------------------------------------------");
		aa.put(1, "one");
		aa.put(0, "zero");
		aa.put(2, "two");
		// Object put(Object key, Object value)ָ��ele��ֵ
		for (int i = 0; i < aa.size(); i++) {
			System.out.println(aa.get(i));
		}
		System.out.println("------------------------------------");

		aa.remove(0);

		for (int k = 0; k <aa.size(); k++) {
			System.out.println(aa.get(k));
		}
		//Ϊʲô����ʾthe��

	}
}
