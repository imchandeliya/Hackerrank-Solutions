import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int count=0;
		int i,j;
		int smallest=1000;
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
		
		int array_length=n;
		int newarraylength=0;
		int temp[] = new int[array_length];
		for(i=0 ; i<array_length ; i++)
		{
			temp[i] = entry[i];
		}
		
		System.out.println(n);
		do
		{
			newarraylength=0;
			smallest=1000;
			for(i=0 ; i<array_length ; i++)
			{
				if(temp[i]>0 && temp[i]<smallest)
					smallest = temp[i];
				
			}
	
			for(i=0 ; i<array_length ; i++)
				temp[i] = temp[i] - smallest ; 
			
			for(i=0 ; i<array_length ; i++)
			{
				if(temp[i] != 0 )
				{
					temp[newarraylength] = temp[i];
					newarraylength++;
				}
			}
			array_length = newarraylength;
			if(array_length > 0)
				System.out.println(array_length);
			
		}while(array_length > 1);
	}
}