import java.util.Scanner;

class Main
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		String a = scan.nextLine();
		String[] b = a.split(" ");
		int sum=0;
		try
		{
			for(int i=0 ; i<n ; i++)
			{
				sum = sum + Integer.parseInt(b[i]);
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(sum);
	}
}