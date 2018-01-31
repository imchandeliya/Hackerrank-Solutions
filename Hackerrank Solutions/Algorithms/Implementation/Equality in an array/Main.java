class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        int i=0,j=0;

        for(i=0; i<n; i++)
            array[i] = scan.nextInt();
        
        int count = 0;
        int temp = 0;

        for(i=0 ; i<n ; i++)
        {
            temp=0;
            for(j=0 ; j<n ; j++)
            {
                if(array[i] == array[j])
                {
                    temp++;
                }
            }
            if(temp>=count)
                count = temp;
        }
        int result = n-count;
        System.out.println(result);
    }
}