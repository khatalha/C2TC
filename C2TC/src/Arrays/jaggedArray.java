package Arrays;

public class jaggedArray {

	public static void main(String[] args) {
		
		int [][] num= new int[3][];
		
		num [0]=new int[3];
		num [1]=new int[4];
		num [2]=new int[5];
		
		int count=0;
		for (int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = count++;
			}			
		}
		System.out.println("Contents of 2D Jagged Array");
        for (int i=0; i<num.length; i++)
        {
            for (int j=0; j<num[i].length; j++)
                System.out.print(num[i][j] + " ");
                  System.out.println();
        }       
            

	}

}
