package mytest;
//stack��vector�����࣬�̳�������
//����ȳ���ջ
import java.util.Stack;

public class Stacktest {
	public static void main(String[] args){
		Stack aa=new Stack();
		//����
		System.out.println("is the stack empty?:    "+aa.isEmpty());
		//�Ƿ���Ԫ��
		aa.push("the first ele");
		//��ջ������Ԫ��
		aa.push("the sec ele");

		aa.push("the thd ele");

		aa.push("the four ele");
System.out.println(aa);
System.out.println("------------------------------------");
		aa.pop();
		//�Ƴ�Ԫ��
		System.out.println(aa);
		System.out.println("------------------------------------");
		//����ȳ�
		aa.push("1");
		aa.push("2");

		aa.push("3");
		System.out.println("the position of ele 2  is "+aa.search("3"));
		//����Ԫ��
		System.out.println("------------------------------------");
System.out.println("the head of the stack is :"+aa.peek());
		//�鿴�����Ķ���

	}

}
