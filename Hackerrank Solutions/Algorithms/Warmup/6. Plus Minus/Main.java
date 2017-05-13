import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int plus=0 ,minus=0 ,zero=0 ;
		int no = scan.nextInt();
		scan.nextLine();
		String str = scan.nextLine();
		String strr[] = str.split(" ");
		
		for(int i=0 ; i<no ; i++)
		{
			if(Integer.parseInt(strr[i]) > 0 )
			{
				plus++;
			}
			else
			{
				if(Integer.parseInt(strr[i]) < 0)
				{
					minus++;
				}
				else
				{
					zero++;
				}
			}
		}
		
		/*
		System.out.println("Zeros:"+zero);
		System.out.println("Plus:"+plus);
		System.out.println("minus:"+minus);
		*/
			
		double frplus = (double)plus/no;
		double frminus = (double)minus/no;
		double frzero = (double)zero/no;
		
		System.out.println(frplus);
		System.out.println(frminus);
		System.out.println(frzero);
	}
}