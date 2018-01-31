//Incompleted
import java.util.Scanner;
class Main
{
    Scanner scan = new Scanner(System.in);
    int testCases = scan.nextInt();
    int i, size, j;
    int[] array;

    for(i=0 ; i<testCases ; i++)
    {
        size = scan.nextInt();
        array = new int[size];
        for(j=0 ; j<size ; j++)
            array[j] = scan.nextInt();
        arrayTransform(array);
    }
    public static void arrayTransform(int[] array)
    {

    }
}