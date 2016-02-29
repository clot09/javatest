package mytest;

public class teststru {
	private static final String getage = null;
	int testage;

	public teststru(String name) {
		System.out.println("Passed Name is :" + name);
	}

	public void setage(int age) {
		testage = age;

	}

	public int getage() {
		System.out.println("the age is : " + testage);
		return testage;
	}

	public static void main(String[] args) {
		/* 创建对象 */
		teststru teststru = new teststru("tommy");
		/* 通过方法来设定age */
		teststru.setage(2);
		/* 调用另一个方法获取age */
		teststru.getage();
		/* 你也可以像下面这样访问成员变量 */
		System.out.println("Variable Value :" + teststru.getage);
	}
}