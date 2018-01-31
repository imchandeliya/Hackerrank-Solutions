import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int i, catA, catB, mouseC;
        int diffAC, diffBC;
        for(i=0 ; i<testCases ; i++)
        {
            catA = scan.nextInt();
            catB = scan.nextInt();
            mouseC = scan.nextInt();
            diffAC = catA - mouseC;
            diffBC = catB - mouseC;
            if(diffAC < 0)
                diffAC = diffAC + diffAC*(-2);
            if(diffBC < 0)
                diffBC = diffBC + diffBC*(-2); 
            if(diffAC > diffBC)
                System.out.println("Cat B");
            else if(diffBC > diffAC)
                System.out.println("Cat A");
            else 
                System.out.println("Mouse C");
            
        }
    }
}