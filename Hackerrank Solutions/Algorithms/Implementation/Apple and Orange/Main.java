import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int s,t,a,b,m,n;
		int i,j;
		int apples_on_house=0, orange_on_house=0;
		s = scan.nextInt();
		t = scan.nextInt();
		a = scan.nextInt();
		b = scan.nextInt();
		m = scan.nextInt();
		n = scan.nextInt();
		int[] apples = new int[m];
		int[] oranges = new int[n];
		for(i=0 ; i<m ; i++)
		{
			apples[i] = scan.nextInt();
			apples[i] = apples[i] + a;
		}
			
		for(i=0 ; i<n ; i++)
		{
			oranges[i] = scan.nextInt();
			oranges[i] = oranges[i] + b;
		}
			

		for(i=0 ; i<m ; i++)
		{
			if(apples[i] >= s && apples[i] <= t)
				apples_on_house++;
		}

		for(i=0 ; i<n ; i++)
		{
			if(oranges[i] >= s && oranges[i] <= t)
				orange_on_house++;
		}
		

		System.out.println(apples_on_house);
		System.out.println(orange_on_house);
	}
}
