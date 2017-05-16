import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int days = scan.nextInt();
		int totallikes=0;
		int likes=0;
		int shares=5;
		
		for(int i=0 ; i<days ; i++)
		{
			likes = shares / 2;
			shares = likes * 3;
			totallikes = likes + totallikes;
		}
		System.out.println(totallikes);
		
	}
}