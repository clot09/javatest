package mytest;
//向量测试

import java.util.Vector;
//vector类类似于arraylist，但是其未同步访问
//默认大小10

public class Testvector {
	public static void main(String args[]) {
		// 初始化一个vector对象
		Vector aa = new Vector(4);
		// 添加元素
		aa.add("a1");
		aa.add("a2");
		aa.add("a3");
		aa.add("a4");
		aa.add("a5");
		// 可变长度，定义的只是初始的大小
		for (int i = 0; i < aa.size(); i++) {
			System.out.println(aa.get(i));
		}
		System.out.println("------------------------");
		Vector bb = new Vector();
		bb.addElement("one");
		// 将指定的组件添加到此向量的末尾，将其大小增加 1。

		bb.addElement("two");
		bb.addElement("three");
		bb.insertElementAt("zero", 0);
		// 将指定对象作为此向量中的组件插入到指定的 index 处

		bb.setElementAt("the", 3);
		// 将此向量指定 index 处的组件设置为指定的对象。

		bb.removeElementAt(0);
		//删除指定索引处的组件。
		for(int k=0;k<bb.size();k++){
			System.out.println("------------------------");

			System.out.println(bb.get(k));
		}
		System.out.println("------------------------");

		System.out.println("First element: " +
		         (String)aa.firstElement());
		//打印第一个元素
		System.out.println("last element: " +
		         (String)aa.lastElement());
		//打印最后一个元素
	}
}
