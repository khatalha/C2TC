package com;





class Box{
	    float w;
	    float h;
	    float l;


	    public float volume(){
	        return w*l*h;
	    }

	}
public class classandobject {
	

	public static void main(String[] args) {
		
		Box box1 = new Box();

        box1.h=2.3f;
        box1.l=4.3f;
        box1.w=4.3f;

        float vol = box1.volume();
        System.out.println("the volume is"+vol);
		
        
		
		
	}

}
