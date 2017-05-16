import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int j=0,i=0,cycle_state=1;
		int no = scan.nextInt();
		int[] cycles = new int[no];
		int[] height = new int[no];
		for(i=0 ; i<no ; i++)
		{
			cycles[i] = scan.nextInt();
			height[i] = 1;
		}
		
		for(j=0 ; j<no ; j++)
		{
			cycle_state=1;
			for(i=0 ; i<cycles[j] ; i++)
			{
				if(cycle_state == 1)
				{
					height[j] = height[j] + height[j];
					cycle_state = 2;
				}
				else if(cycle_state == 2)
				{
					height[j] = height[j] + 1;
					cycle_state = 1;
				}
			}
		}
		
		for(i=0 ; i<no ; i++)
		{
			System.out.println(height[i]);
		}
		
	}
}
