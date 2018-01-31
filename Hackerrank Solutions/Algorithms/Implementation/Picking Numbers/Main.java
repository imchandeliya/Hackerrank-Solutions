import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        int i, j;
        for(i=0 ; i<n ; i++)
            arr[i] = scan.nextInt();
        
        int count=0;
        int temp;
        for(i=0 ; i<n ;i++)
        {
            temp=0;
            for(j=0 ; j<n ; j++)
            {
                if(i != j && getDiff(arr[i],arr[j]) <= 1)
                {
                    temp++;
                }
            }
            if(temp>=count)
                count = temp;
        }
        System.out.println(count);
    }
    static int getDiff(int a, int b)
    {
        int difference = a - b;
        if(difference<0)
            difference = difference * (-1);
        return difference;
    }
}