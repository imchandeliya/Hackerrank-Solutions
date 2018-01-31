import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        StringBuilder input;
        StringBuilder tempStr;
        int i, deletions;
        scan.nextLine();
        while(testCases>0)
        {
            deletions = 0;
            
            input = new StringBuilder(scan.nextLine());
            tempStr = new StringBuilder("");
            tempStr.append(input.charAt(0));

            for(i=1 ; i<input.length() ; i++)
            {
                if( input.charAt(i-1)==input.charAt(i) )
                {
                    deletions++;
                }
                else
                {
                    tempStr.append(input.charAt(i-1));
                }
            }

            if( input.charAt(input.length()-1) != input.charAt(input.length()-1) )
            {
                tempStr.append(input.charAt(input.length()-1));
            }

            System.out.println(deletions);

            testCases--;
        }
    }
}