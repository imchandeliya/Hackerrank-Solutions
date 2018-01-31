import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        double num1, num2; 
        int i, countNums = 0;
        double min,max;
        while(testCases>0)
        {
            num1 = scan.nextDouble();
            num2 = scan.nextDouble();
            countNums = 0;

            min = Math.sqrt(num1);
            max = Math.sqrt(num2);
            min = Math.ceil(min);
            max = Math.floor(max);


            for(i=(int)min ; i<=(int)max ; i++)
            {
                countNums++;
            }

            System.out.println(countNums);
            testCases--;
        }
    }

}