import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		long[] array = new long[5];
		int i=0,j=0;
		
		for(i=0 ; i<5 ; i++)
		{
			array[i] = scan.nextLong();
		}
		
		long swap=0;
		for(i=0 ; i<5 ; i++)
		{
			swap = array[i];
			for(j=0 ; j< 5-i-1 ; j++)
			{
				if(array[j] >= array[j+1])
				{
					swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
		
		long max=0,min=0;
		
		for(i=1 ; i<5 ; i++)
			max = max +array[i];
		
		for(i=0 ; i<4 ; i++)
			min = min + array[i];
		
		System.out.print(min+" "+max);
	}
}