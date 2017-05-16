import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		int i=0,j=0,count=0,temp;
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		
		String b = scan.nextLine();
		
		String aa[]= a.split(" ");
		int n = Integer.parseInt(aa[0]);
		int k = Integer.parseInt(aa[1]);
		
		String bb[] = b.split(" ");
		int array[] = new int[n];
		for(i=0 ; i<n ; i++)
		{
			array[i] = Integer.parseInt(bb[i]);
		}
		
		for(i=0 ; i<n ; i++)
		{
			for(j=i ; j<n-1 ; j++)
			{
				temp = array[i] + array[j+1];
				
				if(temp%k == 0)
				{
					count++;
				}
			}
		}
		System.out.println(count);
			
	}
}
