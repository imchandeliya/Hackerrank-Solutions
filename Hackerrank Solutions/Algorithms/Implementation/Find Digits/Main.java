import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		long[] numbers = new long[scan.nextInt()];
		int i=0,j=0;
		int[] digits;
		long[] n = new long[numbers.length];
		for(i=0 ; i<n.length ; i++)
		{
			n[i] = scan.nextLong();
		}


		for(i=0 ; i<numbers.length ; i++)
			numbers[i] = n[i];
		
		int[] ans = new int[numbers.length];
		for(i=0 ; i<numbers.length ; i++)
			ans[i] = 0;
		
		for(i=0 ; i<numbers.length ; i++)
		{
			digits = new int[(int) Math.log10(numbers[i]) + 1];
			for(j=digits.length-1 ; j>=0 ; j--)
			{
				digits[j] =  (int)numbers[i]%10;
				numbers[i] = numbers[i]/10;
			}

			for(j=0 ; j<digits.length ; j++)
			{
				if(digits[j]!=0 && n[i]%digits[j] == 0 )
				{
					ans[i]++;
				}
			}
		}

		for(i=0 ; i<numbers.length ; i++)
			System.out.println(ans[i]);
	}
}