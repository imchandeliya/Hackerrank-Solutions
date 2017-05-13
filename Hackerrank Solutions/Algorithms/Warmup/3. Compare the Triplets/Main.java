import java.util.Scanner;

class Main
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		String b = scan.nextLine();
		
		String[] aa = a.split(" ");
		String[] bb = b.split(" ");
		
		int aaa=0;
		int bbb=0;
		for(int i=0 ; i<3 ; i++)
		{
			if(Integer.parseInt(aa[i]) > Integer.parseInt(bb[i]))
			{
				aaa++;
			}
			else
			{
				if(Integer.parseInt(aa[i]) < Integer.parseInt(bb[i]))
				{
					bbb++;	
				}
			}
		}
		System.out.println(aaa+" "+bbb);
	}
}