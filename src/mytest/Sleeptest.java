package mytest;

import java.util.Date;

public class Sleeptest {
	public static void main(String[] args) {
		try {
			System.out.println(new Date() + "\n");
			Thread.sleep(1000 * 3); // ����3��
			System.out.println(new Date() + "\n");
		} catch (Exception e) {
			System.out.println("Got an exception!");
		}
	}

}
