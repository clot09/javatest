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
		/* �������� */
		teststru teststru = new teststru("tommy");
		/* ͨ���������趨age */
		teststru.setage(2);
		/* ������һ��������ȡage */
		teststru.getage();
		/* ��Ҳ�����������������ʳ�Ա���� */
		System.out.println("Variable Value :" + teststru.getage);
	}
}