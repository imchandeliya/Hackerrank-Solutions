import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int hours = Integer.parseInt(s.substring(0,2));
		String minutes = s.substring(3,5);
		String seconds = s.substring(6,8);
		String zone = s.substring(8,10);
		
		if(hours == 12)
		{
			if(zone.equals("AM"))
			{
				hours = 0;
			}
		}
		else
		{
			if(zone.equals("PM"))
			{
				hours = hours + 12;
			}
		}
		
		
		String hr="";
		if((int)(Math.log10(hours)+1) == 1)
		{
			hr = new String("0"+hours);
		}
		else
		{
			if(hours == 0)
			{
				hr = new String("00");
			}
			else
			{
				hr = new String(""+hours);
			}
		}
		
		
		
		System.out.println(hr+":"+minutes+":"+seconds);
	}
}