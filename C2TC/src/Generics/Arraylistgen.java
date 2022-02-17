package Generics;

import java.util.ArrayList;

import java.util.Iterator;

public class Arraylistgen {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cat");
		
		String animal=list.get(0);
		System.out.println("Animal is :"+animal);
		
		Iterator <String> itr=list.iterator();
		While(itr.hasNext());
			System.out.println(itr.next());
	
		
		
			
		
	

	}

	private static void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}

}
