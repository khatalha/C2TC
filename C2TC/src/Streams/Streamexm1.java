package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamexm1 {
	public static void main(String[] args) {
			ArrayList<Integer> l= new ArrayList<Integer>();
			l.add(4);
			l.add(5);
			l.add(6);
			l.add(7);
			l.add(8);
			System.out.println(l);
			List<Integer> l2=l.stream().filter(n->n%2==0).collect(Collectors.toList());
			System.out.println(l2);
		}
	

}
/*
*Stream()
*filter()
*map()
*Collect()
*Count()
**sorted()
*sorted(comparator)
*min(comparator)
*max(comparator)
**forEach()
*ToArray()
*Streamof()
*/
