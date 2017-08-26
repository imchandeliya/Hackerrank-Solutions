//Birthday Chcolate
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int barSize = scan.nextInt();
        int[] barNumbers = new int[barSize];
        int i=0;
        for(i=0 ; i<barSize ; i++)
            barNumbers[i] = scan.nextInt();
        int date = scan.nextInt();
        int month = scan.nextInt();
        int ways=0;

        for(i=0 ; i<barSize-month+1 ; i++)
        {
            if(addCheck(date,month, barNumbers, i))
                ways++;
        }
        System.out.println(ways);
    }
    static boolean addCheck(int date, int month, int[] barNumbers, int x)
    {
        int add=0;
        for(int i=x ; i<x+month ; i++)
            add = add + barNumbers[i];
        if(add == date)
            return true;
        else 
            return false;
    }
}