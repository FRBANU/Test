package arraysDesc;

public class ThreeDimensional {

	public static void main(String[] args) {
		
		int [][][] a = new int [2][3][4];
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
				for(int k=0;j<a[i][j].length;k++) {
					
					//a[i][j][k] = (int)(Math.random()*1000);
					System.out.print(a[i][j][k]+"  ");
					
				}
			}
		}
	}
	

}
