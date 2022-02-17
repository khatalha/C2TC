package Generics;
class genrics<T>{
	T obj;
	
	void add(T obj) {
		this.obj=obj;
	}
	
	T get() {
		return obj;
	}
}

public class genericsclassdemo {

	public static void main(String[] args) {
		genrics<Integer> i= new genrics<Integer>();
		i.add(2);
		System.out.println(i.get());
		
		
		genrics<String> i1= new genrics<String>();
		i1.add("Talha");
		System.out.println(i1.get());
		
		genrics<Float> i2= new genrics<Float>();
		i2.add(5.45f);
		System.out.println(i2.get());
	}
	
}