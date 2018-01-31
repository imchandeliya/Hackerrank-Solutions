import  java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        //Inputs
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int i=0;
        StringBuilder temp;
        boolean repeat = true;
        //Operation
        while(repeat)
        {
            repeat = false;
            for(i=0 ; i<input.length()-1 ; i++)
            {
                if(input.charAt(i) == input.charAt(i+1))
                {
                    temp = new StringBuilder(input.substring(0,i));
                    temp.append(input.substring(i+2,input.length()));
                    input = new String(temp);
                    repeat = true;
                }
            }
        }
        if(input.length() == 0)
            System.out.println("Empty String");
        else
            System.out.println(input);
    }
}