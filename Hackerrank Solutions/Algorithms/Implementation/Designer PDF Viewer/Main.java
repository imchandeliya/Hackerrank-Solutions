import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
	//	char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		
		int[] heights = new int[26];
		int i=0;
		for(i=0 ; i<26 ; i++)
			heights[i] = scan.nextInt();
		
		String input = scan.next();
		int input_length = input.length();
		
		char temp;
		int no=0;
		int hight_temp =0;
		for(i=0 ; i<input_length ; i++)
		{
			temp = input.charAt(i);
			no = (int)temp - 97;
			
			if(hight_temp <= heights[no])
				hight_temp = heights[no];
		}
		
		int area = hight_temp * input_length;
		
		System.out.println(area);
		
	}
}