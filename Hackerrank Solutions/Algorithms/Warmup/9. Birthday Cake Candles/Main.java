import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] candles = new int[n];
        
        int i=0;
        int longest = 0;
        for(i=0 ; i<n ; i++)
        {
            candles[i] = scan.nextInt();
            if(longest <= candles[i])
                longest = candles[i];
        }
        int blow=0;
        for(i=0 ; i<n ; i++)
            if(candles[i] == longest)
                blow++;
        
        System.out.println(blow);
    }
}