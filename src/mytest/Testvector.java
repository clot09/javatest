package mytest;
//��������

import java.util.Vector;
//vector��������arraylist��������δͬ������
//Ĭ�ϴ�С10

public class Testvector {
	public static void main(String args[]) {
		// ��ʼ��һ��vector����
		Vector aa = new Vector(4);
		// ���Ԫ��
		aa.add("a1");
		aa.add("a2");
		aa.add("a3");
		aa.add("a4");
		aa.add("a5");
		// �ɱ䳤�ȣ������ֻ�ǳ�ʼ�Ĵ�С
		for (int i = 0; i < aa.size(); i++) {
			System.out.println(aa.get(i));
		}
		System.out.println("------------------------");
		Vector bb = new Vector();
		bb.addElement("one");
		// ��ָ���������ӵ���������ĩβ�������С���� 1��

		bb.addElement("two");
		bb.addElement("three");
		bb.insertElementAt("zero", 0);
		// ��ָ��������Ϊ�������е�������뵽ָ���� index ��

		bb.setElementAt("the", 3);
		// ��������ָ�� index �����������Ϊָ���Ķ���

		bb.removeElementAt(0);
		//ɾ��ָ���������������
		for(int k=0;k<bb.size();k++){
			System.out.println("------------------------");

			System.out.println(bb.get(k));
		}
		System.out.println("------------------------");

		System.out.println("First element: " +
		         (String)aa.firstElement());
		//��ӡ��һ��Ԫ��
		System.out.println("last element: " +
		         (String)aa.lastElement());
		//��ӡ���һ��Ԫ��
	}
}
