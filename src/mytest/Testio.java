package mytest;
import java.io.*;
public class Testio {
public static void main(String[] args){
String 	dirname="d:/";
	File a1=new File(dirname);
	 System.out.println(dirname);
	 String b1[]=a1.list();
	 for(int i=0;i<b1.length;i++){
		 File b2=new File(dirname+"/"+b1[i]);
		 if (b2.isDirectory()){
			 System.out.println(b1[i]+" is a directory");
		 }else{
			 System.out.println(b1[i]+" is a file");
		 }
	 }

}
}
