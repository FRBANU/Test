package arraysDesc;

public class CiscoInterview {

	public static void main(String[] args) {
		
		// 4 5 2 
		// 9 3 8 
		// 6 4 1 
		
		//find the min number and get the maximum number in that column


		int abc[][] = { { 4, 5, 2 }, { 9, 3, 8 }, { 6, 4, 1 } };

		int min = abc[0][0];
		int minColumn= abc[0][0];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (abc[i][j] < min) {

					min = abc[i][j];
					minColumn=j;
				}

			}
		}
		int max= abc[0][minColumn];
		int k=0;
		while(k<3) {
			if(abc[k][minColumn]>max) {
				max=abc[k][minColumn];
			}
			k++;
		}
		System.out.println(max);

	}

}
