import java.math.BigInteger;
import java.util.Scanner;



class Main    
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		
		int input = scan.nextInt();
		BigInteger sol = BigInteger.valueOf(input);
		input--;
		while(input>0)
		{
			sol = sol.multiply(BigInteger.valueOf(input));
			input--;
		}
		System.out.println(sol);
	}
}