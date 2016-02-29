package mytest;

import java.io.*;
import java.util.Scanner;
public class Readinpath {

	public static void main(String[] args) throws IOException {
 		Scanner input = new Scanner(System.in);
		String a= input.toString();
	 
		File d=new File(a);
		String e[]=d.list();
		for(int i=0;i<e.length;i++){
 File f=new File(a+"/"+e[i]);
 if(f.isDirectory()){
	 System.out.println(e[i]+" is a directory;");
 }else{
	 System.out.println(e[i]+" is a file;");
 }
		}
	}
}
