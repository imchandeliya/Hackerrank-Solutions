import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String input[] = scan.nextLine().split(" ");
		int x1= Integer.parseInt(input[0]);
		int v1= Integer.parseInt(input[1]);
		int x2= Integer.parseInt(input[2]);
		int v2= Integer.parseInt(input[3]);
		String status="NO";
		int step1 = x1;
		int step2 = x2;
		
		for(int i=1 ; i<=10000 ; i++)
		{
			step1 = step1 + v1 ;
			step2 = step2 + v2 ;
			
			if(step1 == step2)
			{
				status = new String("YES");
			}
		}
		
		System.out.println(status);
	}
}