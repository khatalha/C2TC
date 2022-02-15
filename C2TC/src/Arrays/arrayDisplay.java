package Arrays;

public class arrayDisplay {

	public static void main(String[] args) {
		int [][] num= {{1,3,2},
						{4,5,6},
						{4,5,6},
						{7,8,9}};
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(num[i][j]+" ");
				
			}
			System.out.println();
			

		}
		System.out.println(num.length);

	}

}
