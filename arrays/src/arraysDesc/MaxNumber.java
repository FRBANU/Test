package arraysDesc;

public class MaxNumber {

	public static void main(String[] args) {
	
		int abc[][]= {{2,4,8},{3,9,0},{0,5,7}};
		
		int max = abc[0][0];
		
		for(int i=0;i<abc.length;i++)
		{
			for(int j=0;j<abc[i].length;j++)
			{
				if(abc[i][j]>max)
				{
					max = abc[i][j];
				}
			}
		}

	      System.out.println(max);
	}

}
