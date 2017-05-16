	import java.util.Scanner;

	class Main
	{
		public static void main(String[] args) 
		{
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int i=0, lastt=0, j=0, no_prisoners=0 , no_sweets=0 , start=0;

			for(i=0 ; i<n ; i++)
			{
				no_prisoners = scan.nextInt();
				no_sweets = scan.nextInt();
				start = scan.nextInt();
				lastt = (no_sweets+start-1)%no_prisoners;
				if(lastt==0)
					System.out.println(no_prisoners);
				else
					System.out.println(lastt);
			}
		}
	}