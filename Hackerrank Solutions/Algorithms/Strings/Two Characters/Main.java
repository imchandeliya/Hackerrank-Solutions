//Incompleted
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        String input = scan.next();
        int i, j;
        boolean present = false;
        //find distinct values is input
        char[] distinct = new char[26];
        int flagDistinct = 1;
        distinct[0] = input.charAt(0);
        for(i=0 ; i<input.length() ; i++)
        {
            present = false;
            for(j=0 ; j<flagDistinct ; j++)
            {
                if(input.charAt(i) == distinct[j])
                {
                    present = true;
                }
            }
            if(!present)
            {
                distinct[flagDistinct] = input.charAt(i);
                flagDistinct++;
            }
        }

/*        //Printing distinct values (Testing Purpose)
        for(i=0 ; i<flagDistinct ; i++)
        {
            System.out.print(distinct[i]+" ");
        }
*/
        int k, temp;
        char[] charS = new char[2];
        //Checking the right string
        StringBuilder tempString = new StringBuilder(""); 
        for(i=0 ; i<flagDistinct ; i++ )
        {
            for(j=0 ; j<flagDistinct ; j++)
            {
                if(distinct[i] != distinct[j])
                {
                    for(k=0 ; k<input.length() ; k++)
                    {
                        if(input.charAt(k)!=distinct[i] && input.charAt(k)!=distinct[j])
                        {
                            tempString.append(input.charAt(k));
                        }
                    }
                }

                charS[0] = input.charAt(0);
                charS[1] = input.charAt(1);
                temp = 0;
                present = true;
                for(k=0 ; k<tempString.length() ; k++)
                {
                    if(tempString.charAt(k) != charS[temp])
                    {
                        present = false;
                    }
                    if(temp == 0)
                        temp = 1;
                    else
                        temp = 0;
                }

                if(present)
                {
                    length = tempString.length();
                    System.out.println(length);
                }

            }
        }
    }
}