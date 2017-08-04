import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //Declaration
        int i=0, j=0, ctr=0, min=0, max=100;
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[m];

        //Inputs
        for(i=0 ; i<n ; i++)
        {
            array1[i] = scan.nextInt();
            if(array1[i]>=min)
                min = array1[i];
        }
        for(i=0 ; i<m ; i++)
        {
            array2[i] = scan.nextInt();
            if(array2[i]<=max)
                max = array2[i];
        }

        //System.out.println("min "+min+", max"+max);
        boolean flag;
        for(i=min ; i<=max ; i++)
        {
            flag = true;
            for(j=0 ; j<array1.length ; j++)
                if(i%array1[j] != 0)
                    flag = false;
            for(j=0 ; j<array2.length ; j++)
                if(array2[j]%i != 0)
                    flag = false;

            if(flag)
                ctr++;
        }          
        System.out.println(ctr);
    }
}