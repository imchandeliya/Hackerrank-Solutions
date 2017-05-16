import java.util.Scanner;

class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int entry;
		int gain=0,loss=0;
		int highest=0,lowest=0;
		int[] records = new int[n];
		int i=0;
		
		for(i=0 ; i<n ; i++)
			records[i] = scan.nextInt();
		
		highest = records[0];
		lowest = records[0];
		for(i=1 ; i<n ; i++)
		{
			if(records[i]>highest)
			{
				gain++;
				highest = records[i];
			}
				
			else if(records[i]<lowest)
			{
				loss++;
				lowest = records[i];
			}
				
		}
		System.out.println(gain+" "+loss);
		
		
	}
}