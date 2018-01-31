import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        int topics = scan.nextInt();
        String[] input = new String[people];

        int i,j,k;
        for(i=0; i<people; i++)
            input[i] = scan.next();

/*
        //Output
        System.out.println("Output:");
        for(i=0 ; i<people ; i++)
            System.out.println(input[i]);
*/      
        //Logic
        

        int count=0;
        int tempCount=0;
        //count max-topics
        for(i=0; i<people ; i++)
        {
            for(j=0 ; j<people; j++)
            {
                tempCount=0;
                for(k=0 ; k<topics ; k++)
                {
//                    System.out.println("i:"+i+", j:"+j+", k:"+k+"");
                    if(input[i].charAt(k) == '1' || input[j].charAt(k) == '1')
                    {
                        tempCount++;
                    }
                }
                if(tempCount >= count)
                {
                    count = tempCount;
                }
            }
        }

        //fetching number of team who knows count topics
        int countTeam=1;
        for(i=0; i<people ; i++)
        {
            for(j=0 ; j<people; j++)
            {
                tempCount=0;
                for(k=0 ; k<topics ; k++)
                {
//                    System.out.println("i:"+i+", j:"+j+", k:"+k+"");
                    if(input[i].charAt(k) == '1' || input[j].charAt(k) == '1')
                    {
                        tempCount++;
                    }
                }
                if(tempCount == count)
                {
                    countTeam++;
                }    
            }
            
        }
        System.out.println(count);
        System.out.println(countTeam);
    }
}