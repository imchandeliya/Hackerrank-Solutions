import java.util.Scanner;
class Main 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i=0;
        int grade,nextMultiple;
        for(i=0 ; i<n ; i++)
        {
            grade = scan.nextInt();

            if(grade < 35)
                System.out.println(grade);
            else
            {
                
                nextMultiple = grade + (5 - grade%5);
            //  System.out.println("grade%5 is : "+grade%5);
            //  System.out.println("nextMultiple is : "+nextMultiple);
                if((nextMultiple - grade) < 3)
                    System.out.println(nextMultiple);
                else
                    System.out.println(grade);
            }
        }
    }
}