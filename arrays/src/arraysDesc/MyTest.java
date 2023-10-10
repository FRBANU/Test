package arraysDesc;

public class MyTest {

	public static void main(String[] args) {
		
		//int a[] = {3,4,9,8,1};
		
		//System.out.println(a.);
		
		/*int a[] = new int[5];
		a[0] = 3;
		a[1] = 4;
		a[2] = 9;
		a[3] = 1;
		a[4] = 1;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		
		// 3 5 8
		// 1 0 9
		// 4 3 7
		
		int c[][] = {{3,5,8},{1,0,9},{4,3,7}};
		int i;
		int j;
	  
		for( i=0;i<c.length;i++) 
		{
			for(j=0;j<c[i].length;j++) {
				
				System.out.print(c[i][j]+" ");
				
				}System.out.println();
			
		}	
		
	
	
	}
	
	
	
	
	

}
