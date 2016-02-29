package mytest;

import java.util.Calendar;
import java.util.Date;
import java.text.*;

public class Enumtest {

	public enum datelist {
		mon, tue, wed, thu, fri, sat, sun;
	}
 
	  public static void main(String args[]){
		  for (datelist a : datelist.values()) 
			  //Ã¶¾ÙµÄ±éÀú
switch(a){
case mon:
	System.out.println("the day of week is 1 "+a);
	break;
case wed:
	System.out.println("the day of week is 2 "+a);
	break;

case tue:
	System.out.println("the day of week is 3 "+a);
	break;

case thu:
	System.out.println("the day of week is 4 "+a);
	break;

case fri:
	System.out.println("the day of week is 5 "+a);
	break;

case sat:
	System.out.println("the day of week is 6 "+a);
	break;

case sun:
	System.out.println("the day of week is 7 "+a);
	break;

	
}
	  }
 
  

 
}
