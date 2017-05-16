import java.util.Scanner;

class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int start = scan.nextInt();
		int end = scan.nextInt();
		int k = scan.nextInt();

		int n=0, j=0,i=0;
		int reverse_n=0;
		int length=0, temp=0;

		int counter=0;
		
		for(n=start ; n<=end ; n++)	
		{
			reverse_n=0;
			length = (int)(Math.log10(n)+1);
			temp = n;
		
			for(i=0 ; i<length ; i++)
			{
				reverse_n = reverse_n + temp % 10 * (int)Math.pow(10,length - i);
				temp = temp/10; 
			}
			reverse_n = reverse_n/10;

			if((n-reverse_n)%k == 0 )
				counter++;
		}
		
		
		
		
		
		
		System.out.println(counter);
	}
}