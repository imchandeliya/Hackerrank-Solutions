import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		
		//inputs
		int i=0,j=0;
		int n = scan.nextInt();
		scan.nextLine();
		String str = scan.nextLine();
		String strr[] = str.split(" ");
		int entry[] = new int[n];
		for(i=0 ; i<n ; i++)
		{
			entry[i] = Integer.parseInt(strr[i]);
		}
		
		
		//logic
		int count=0;
		
		for(i=0 ; i<n ; i++)
		{
			for(j=0 ; j<n ; j++)
			{
					if(entry[i] == entry[j] && entry[i] != 0 && i != j)
					{
						count++;
						entry[i] = 0;
						entry[j] = 0;
					}
			}
		}
		
		System.out.println(count);
	}
}