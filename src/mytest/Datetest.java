package mytest;

import java.util.Calendar;
import java.util.Date;
import java.text.*;

//类
public class Datetest {
	public static void main(String[] args) {
		// 构造方法，无参返回
		Date cc = new Date();
		Calendar ee = Calendar.getInstance();
		int ff = ee.get(Calendar.YEAR);

		SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 声明一个对象
		System.out.println(cc.toString());
		System.out.println(dd.format(cc));
		System.out.printf("%s %tB %<te, %<tY", "Due date:", cc);
		System.out.println(ee);
		System.out.println(ff);
		System.out.println(cc.getYear());

		System.out.println(cc.getDate());

	}

}
