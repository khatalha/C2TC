package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
        hs.add("hash");
        hs.add("set");
        hs.add("demo");
        hs.add("demo");

        Iterator i = hs.iterator();
        while(i.hasNext()){
            Object o = i.next();
            System.out.println(o);
        }

	}

}
