package mytest;
import java.util.BitSet;


public class Bitsettest {

	public static    void main(String[] args){
		BitSet aa= new BitSet();
		//��ʼ��Ĭ����64bit
		//��ʼ��һ������
		System.out.println(aa.isEmpty()+"--"+aa.size());  
		aa.set(0);  
		//һ���ֽ�byteռ8��bit
        System.out.println(aa.isEmpty()+"--"+aa.size());  
         aa.set(1);  
        System.out.println(aa.isEmpty()+"--"+aa.size());  
        System.out.println(aa.get(65));  
        System.out.println(aa.isEmpty()+"--"+aa.size());  
        aa.set(65);  
        System.out.println(aa.isEmpty()+"--"+aa.size());  
        
       BitSet test1= new BitSet();
       
       BitSet test2= new BitSet();
       for (int i=0;i<16;i++){
    	   if((i%2)==0) test1.set(i);
    	    if((i%4) != 0) test2.set(i);
    	           }
       System.out.println("Initial pattern in test1: ");
       System.out.println(test1);
       System.out.println("InInitial pattern in test2: ");
       System.out.println(test2);
       //and bits
       test2.and(test1);
       System.out.println("test1 + test2 and operation is :");
       System.out.println(test2);

        
       test2.or(test1);
       System.out.println("test1+test2 or operation is :");
       System.out.println(test2);
       
       
       
       test2.xor(test1);
       System.out.println("test1+test2 xor operation is :");
       System.out.println(test2);
       
	}
}
