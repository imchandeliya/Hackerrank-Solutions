import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        char[] hackerrank = {'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
        int flag = 0;
        int i, j;
        String input;
        for(i=0 ; i<testCases ; i++)
        {
            flag = 0;
            input = scan.next();

            for(j=0 ; j<input.length() ; j++)
            {
                if( input.charAt(j) == hackerrank[flag] )
                {
                    flag++;
                    if(flag>9)
                        break;
                }
            }
            if(flag > 9)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}