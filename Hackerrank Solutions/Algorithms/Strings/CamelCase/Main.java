import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        int i=0, count=1;
        if(Character.isUpperCase(input.charAt(0)))
            count=0;

        for(i=0 ; i<input.length() ; i++)
        {
            if( Character.isUpperCase(input.charAt(i)) )
                count++;
        }
        System.out.println(count);
    }
}