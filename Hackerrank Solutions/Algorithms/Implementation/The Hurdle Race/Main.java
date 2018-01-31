class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();
        int hurdle=0;
        int maxhurdle = 0;
        int i=0;

        for(i=0 ; i<n ; i++)
        {
            hurdle = scan.nextInt();
            if(hurdle>maxhurdle)
                maxhurdle = hurdle;
        }
        if( k - maxhurdle <= 0 )
        {
            i = maxhurdle - k;
            System.out.println(i);
        }
        else
        {
            System.out.println("0");
        }
    }
}