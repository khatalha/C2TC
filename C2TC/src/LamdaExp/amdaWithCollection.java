package LamdaExp;

//Comparator have campare() mthod
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
/*
class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {

        return (o1<o2)?-1:(o1>o2)?1:0;
//        if (o1<o2){
//            return -1;
//        }
//        else if (o1>o2){
//            return +1;
//        }
//        else{
//            return 0;
//        }

    };


}
*/


public class amdaWithCollection {

	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<>();
        l.add(13);
        l.add(11);
        l.add(9);
        l.add(92);
        l.add(0);
        l.add(24);
        l.add(27);
        System.out.println(l);
//        Collections.sort(l,new MyComparator());

        Comparator<Integer> c=(o1,o2)->(o1<o2)?-1:(o1>o2)?1:0;
        Collections.sort(l,c);


        System.out.println(l);
	}

}
