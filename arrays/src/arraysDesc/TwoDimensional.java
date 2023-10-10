package arraysDesc;

public class TwoDimensional {

	public static void main(String[] args) {
	    // matrix
		
		
        /*3 4 7
		 *2 6 0 
		 */
		/*int a[][] = new int[2][3];
		
		a[0][0] = 3;
		a[0][1] = 4;
		a[0][2] = 7;
		a[1][0] = 2;
		a[1][1] = 6;
		a[1][2] = 0;
		
		System.out.println(a[1][2]);

	
	/* d o g
	 * o d g
	 *
	 */
   char  s[][] = new char[2][3];
		
			s[0][0] = 'd';
			s[0][1] = 'o';
			s[0][2] = 'g';
			s[1][0] = 'g';
			s[1][1] = 'o';
			s[1][2] = 'd';

			
	
    for(char i=0;i<s.length;i++) {
    	for(char j=0;j<s[0].length;j++) {
    		
    		System.out.print(s[i][j]+"  ");
    		
    		}
    	System.out.println();
    	
	
        }
			
			
	
	}
	  

}
