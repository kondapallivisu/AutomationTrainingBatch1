package JavaBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Basics1 {

	/*Description : This method will add two numbers .
	 * Input params :int a,int b
	 * Author:XYZ
	 * Change Date :
	 * output parameters : int
	 * 
	 */	
	public int addition (int a,int b) {
				
		return a+b;
	
		
	}
	
	public static void main(String[] args) {
		
		List l= new ArrayList();
		l.add("String");
		l.add(4);
		
		System.out.println(l.get(1).getClass().toString());
		
		Vector v = new Vector();
		v.add("string");
		v.add(6);
		System.out.println(v.capacity());
		// TODO Auto-generated method stub
		int[] i= {1,2,3,4,5};
int[] j= new int[10];
		Basics1 s=new Basics1();
		int c=s.addition(4, 5);
		System.out.println(c);
		
	}

}
