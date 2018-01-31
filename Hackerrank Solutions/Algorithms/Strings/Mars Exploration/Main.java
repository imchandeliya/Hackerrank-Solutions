import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int n = input.length() / 3 ;
        System.out.println("Number of SOS :"+n);
        int count=0;
        for(int i=0 ; i<n ; i++)
        {
            //check first letter
            if(input.charAt(3*i+0) != 'S' )
                count = count + 1;
            //check second letter
            if(input.charAt(3*i+1) != 'O' )
                count = count + 1;
            //check third letter
            if(input.charAt(3*i+2) != 'S' )
                count = count + 1;
        }
        System.out.println(count);
    }
}