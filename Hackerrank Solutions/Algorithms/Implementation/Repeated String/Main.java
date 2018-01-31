class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String input = scan.next();
        long n = scan.nextLong();
        input.toLowerCase();

        //Find number of a's in input
        int i;
        int counter=0;
        for(i=0 ; i<input.length() ; i++)
        {
            if(input.charAt(i) == 'a')
                counter++;
        }

        long temp = n/input.length();
        long finalCounter=0;
        finalCounter = temp*counter;
        temp = n % input.length();
        for(i=0 ; i<temp ; i++)
        {
            if(input.charAt(i) == 'a')
                finalCounter++;
        }
        System.out.println(finalCounter);
        

    }
}