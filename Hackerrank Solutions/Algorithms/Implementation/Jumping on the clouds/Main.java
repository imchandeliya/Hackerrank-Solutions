class Main
{
    public static void main(String[] args)
    {
        java.util .Scanner scan = new java.util.Scanner(System.in);
        
        int n = scan.nextInt();
        int[] clouds = new int[n];
        int i=0;

        for(i=0 ; i<n ; i++)
            clouds[i] = scan.nextInt();
        
        int steps=0;
        int currentCloud=0;

        while(currentCloud < n)
        {
            if( currentCloud+2 < n  && clouds[currentCloud+2]  == 0)
            {
                currentCloud += 2;
                steps++;
            }
            else
            {
                currentCloud++;
                steps++;
            }
            if(currentCloud == n-1)
                break;
        }
        System.out.println(steps);
    }
}