import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        String input;
        char[] str;
        char[] strRev;
        int i,j;
        boolean checkFunny = true;
        
        while(testCases>0)
        {
            checkFunny = true;
            input = scan.next();
            str = new char[input.length()];
            strRev = new char[input.length()];
            for(i=0 ; i<str.length  ; i++)
            {
                str[i] = input.charAt(i);
                strRev[str.length - i -1] = input.charAt(i);
            }
/*
            //Print Str
            System.out.println("Str:");
            for(i=0 ; i<str.length ; i++)
                System.out.print(str[i]+" ");
            System.out.println("StrRev:");
            for(i=0 ; i<str.length ; i++)
                System.out.print(strRev[i]+" ");
*/        
            //Logic
            int temp1;
            int temp2;
            for(i=0 ; i<str.length-1 ; i++)
            {
                temp1 = (int)str[i+1] - (int)str[i];
                temp2 = ((int)strRev[i+1] - (int)strRev[i] );
                
                //Modulo
                if(temp1<0)
                {
                    temp1 = temp1*(-1);
                }
                if(temp2<0)
                {
                    temp2 = temp2*(-1);
                }

  //              System.out.println("Str Diff("+(int)str[i+1]+"-"+(int)str[i]+"):"+temp1+", StrReverse Diff("+(int)strRev[i+1]+"-"+(int)strRev[i]+"):"+temp2);
//                System.out.println();
                if( temp1 != temp2)
                    checkFunny = false;
            }
            if(checkFunny)
                System.out.println("Funny");
            else
                System.out.println("Not Funny");

            testCases--;
        }
    }
}