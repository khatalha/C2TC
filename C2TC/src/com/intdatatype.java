package com;

public class intdatatype {

	public static void main(String[] args) {
		
		byte minbyte=127;
		byte maxbyte=-128;
		
		System.out.println("the min size is "+minbyte+"and max is "+maxbyte);
		
		short minshort=-32768;
		short maxshort=32767;
		System.out.println("the min size is "+minshort+"and max is "+maxshort);
		
		
		int minint=-2147483647;
		int maxint= 2147483646;
		System.out.println("the min size is "+minint+"and max is "+maxint);
		
		long minlong=-9223372036854774807L;
		long maxlong=9223372036854774806L;
		
		System.out.println("the min size is "+minlong+"and max is "+maxlong);
		
		float f1=2223.372036854774806f;
		System.out.println("the min size is "+f1);
		
		double f2=23.372036854774806d;
		System.out.println("the min size is "+f2);
		
		

	}

}
