package Assignment1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListIterator j=null;
		List<String> s= new ArrayList<String>();
		s.add("s");
		s.add("s");
		s.add("s");
		s.add("d");
		
		LinkedList<String>k= new LinkedList<String>(s);
		Iterator i= k.iterator();
		while (i.hasNext()) {
			String t=(String) i.next();
			System.out.println(t);	
		}
		
		
	
		 j=k.listIterator();
		
		while (j.hasPrevious()) {
			String p = (String) j.previous();
			System.out.println(p);
		}
		//System.out.println(s.size());
		
		
		MathClass mc=new MathClass(2, 3);
		MathClass mc1=new MathClass();
		
		System.out.println(mc.Addition());
		System.out.println(mc1.Addition(4, 7));
		
	}

}
