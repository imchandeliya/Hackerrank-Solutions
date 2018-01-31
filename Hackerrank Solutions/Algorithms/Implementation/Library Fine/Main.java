import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int date1 = scan.nextInt();
        int month1 = scan.nextInt();
        int year1 = scan.nextInt();

        int date2 = scan.nextInt();
        int month2 = scan.nextInt();
        int year2 = scan.nextInt();

        checkYearDiff(year1, year2);
    }
    public static void main(int year1, int year2)
    {
        int difference = year2 - year1;
        
    }
}