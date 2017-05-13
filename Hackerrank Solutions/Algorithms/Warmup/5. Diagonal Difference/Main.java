	import java.util.Scanner;

	class Main
	{
		public static void main(String[] args) 
		{
			Scanner scan = new Scanner(System.in);

			int n = scan.nextInt();

			int[][] matrix = new int[n][n]; 
			int i=0, j=0;

			for(i=0 ; i<n ; i++)
				for(j=0 ; j<n ; j++)
					matrix[i][j] = scan.nextInt();
			
			int diag1=0;
			int diag2=0;
			for(i=0 ; i<n ; i++)
				diag1 = diag1 + matrix[i][i];
			
			for(i=0 ; i<n ; i++)
				diag2 = diag2 + matrix[i][n-i-1];
			
			int diff = diag1 - diag2;

			if(diff < 0)
				diff = diff * (-1);
			

			System.out.println(diff);
		}
	}