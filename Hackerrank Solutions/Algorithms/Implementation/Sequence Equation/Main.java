import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] S = new int[n+1];
        int i, j, k;

        for(i=1 ; i<=n ; i++)
            S[i] = scan.nextInt();
        int temp;
        for(i=1 ; i<=n ; i++)
        {
            for(j=1 ; j<=n ; j++)
            {
                if(S[j] == i)
                {
                    temp = j;
                    for(k=1 ; k<=n ; k++)
                    {
                        if(S[k] == temp)
                        {
                            System.out.println(k);
                            break;
                        }
                            
                    }
                    break;
                }
            }

        }
    }
}