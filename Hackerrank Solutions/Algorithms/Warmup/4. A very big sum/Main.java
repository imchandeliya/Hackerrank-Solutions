import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		String str = scan.nextLine();
		
		String[] entrr = str.split(" ");
		long sum=0;
		for(int i=0 ; i<n ; i++)
		{
			sum = sum + Integer.parseInt(entrr[i]); 
		}
		System.out.println(sum);
	}
}