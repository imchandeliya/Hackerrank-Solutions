import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int j,i;
		for( i=0 ; i<n ; i++)
		{
			for( j=0 ; j<n-i-1 ; j++)
			{
				System.out.print(" ");
			}
			for(j=0 ; j<=i ; j++)
			{
				System.out.print("#");
			}
			
			System.out.println();
		}
		
	}
}