	import java.util.Scanner;

	class Main
	{
		public static void main(String[] args) 
		{
			Scanner scan = new Scanner(System.in);
			
			int n = scan.nextInt();
			int[] str = new int[n];
			int odd = scan.nextInt();
			int i=0, j=0 ;
			for(i=0 ; i<n ; i++)
				str[i] = scan.nextInt();
			int charged= scan.nextInt();

			int actual = 0;
			for(i=0 ; i<n ; i++)
				if(i != odd)
					actual = actual + str[i] ;
			actual = actual/2;
			
			if(actual == charged)
				System.out.println("Bon Appetit");
			else
			{
				int diff= charged - actual;
				System.out.println(diff);
			}



		}
	}