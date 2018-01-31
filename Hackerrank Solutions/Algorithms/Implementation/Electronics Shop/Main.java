import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] keyboard = new int[n];
        int[] mouse = new int[m];

        int i,j;
        for(i=0 ; i<n ; i++)
            keyboard[i] = scan.nextInt();
        for(i=0 ; i<m ; i++)
            mouse[i] = scan.nextInt();

        int max_amount=-1;
        for(i=0 ; i<n ; i++)
        {
            for(j=0 ; j<m ; j++)
            {
                if(keyboard[i]+mouse[j] >= max_amount && keyboard[i]+mouse[j]<=money)
                    max_amount = keyboard[i]+mouse[j];
            }
        }
        System.out.println(max_amount);
    }
}