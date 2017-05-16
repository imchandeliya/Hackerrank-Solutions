import java.util.Scanner;

class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int p = scan.nextInt();

		int fromFront = p/2 ;
		int fromLast = (n-p)/2 ;

		if(fromFront <= fromLast)
			System.out.println(fromFront);
		else
			System.out.println(fromLast);
	}
}