package mytest;

public class Puppy {
	public Puppy(String name) {
		// �������������һ��������name
		String str1 = "this is my test ";

		System.out.println("Passed Name is :" + name);
		System.out.println("test  is :" + name + ' ' + str1);
	}

	public static void main(String[] args) {
		// �������佫����һ��Puppy����
		Puppy myPuppy = new Puppy("tommy");
	}
}
