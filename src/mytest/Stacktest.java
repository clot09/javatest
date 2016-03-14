package mytest;
//stack是vector的子类，继承其特性
//后进先出的栈
import java.util.Stack;

public class Stacktest {
	public static void main(String[] args){
		Stack aa=new Stack();
		//申明
		System.out.println("is the stack empty?:    "+aa.isEmpty());
		//是否有元素
		aa.push("the first ele");
		//向栈中推入元素
		aa.push("the sec ele");

		aa.push("the thd ele");

		aa.push("the four ele");
System.out.println(aa);
System.out.println("------------------------------------");
		aa.pop();
		//移除元素
		System.out.println(aa);
		System.out.println("------------------------------------");
		//后进先出
		aa.push("1");
		aa.push("2");

		aa.push("3");
		System.out.println("the position of ele 2  is "+aa.search("3"));
		//查找元素
		System.out.println("------------------------------------");
System.out.println("the head of the stack is :"+aa.peek());
		//查看顶部的对象

	}

}
