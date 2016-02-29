package mytest;

public class Puppy {
	public Puppy(String name) {
		// 这个构造器仅有一个参数：name
		String str1 = "this is my test ";

		System.out.println("Passed Name is :" + name);
		System.out.println("test  is :" + name + ' ' + str1);
	}

	public static void main(String[] args) {
		// 下面的语句将创建一个Puppy对象
		Puppy myPuppy = new Puppy("tommy");
	}
}
