import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input  = scan.next();
        int noQuery = scan.nextInt();
        int query;
        char temp;
        int i;
        //Store Substring in separate 2-d array
        String[][] substrings = new String[input.length()][2];
        
        for(i=0 ; i<substrings.length ; i++)
        {
            //Check if it is not single letter
            if( input.charAt(i) != input.charAt(i+1) )
            {
                substrings[i][0] = (String)input.charAt(i);
                query = (int)input.charAt(i) - 96;
                substrings[i][1] = new String( query );
            }
        } 

        //Testing
        for(i=0 ; i<substrings.length ; i++)
        {
            System.out.println("Character:"+substrings[i][0]+", weight:"+substrings[i][1]);
        }

        while(noQuery>0)
        {
            query = scan.nextInt();
            noQuery--;
        }
    }
}