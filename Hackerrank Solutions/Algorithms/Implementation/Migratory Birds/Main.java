import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int i=0,value;
        int[] count = {0,0,0,0,0,0};
        int posn=0;
        for(i=0 ; i<number ; i++)
        {
            value = scan.nextInt();
            switch(value)
            {
                case 1:
                    count[1]++;
                    break;
                case 2:
                    count[2]++;
                    break;
                case 3:
                    count[3]++;
                    break;
                case 4:
                    count[4]++;
                    break;
                case 5:
                    count[5]++;
                    break;
            }
        }
        value = 0;
        for(i=1 ; i<=5 ; i++)
        {
            if(count[i] > value)
            {
                value = count[i];
                posn = i;
            }
        }

        System.out.println(posn);
            
        


    }
}