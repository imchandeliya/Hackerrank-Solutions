
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //0 is ground level
        int current_level=0, no_valleys=0, no_hills=0, prev_step;
        int n = scan.nextInt();
        String input = scan.next();
        int i=0;
        char temp;
        for(i=0 ; i<input.length() ; i++)
        {
            temp = input.charAt(i);
            prev_step = current_level;
            if(temp == 'U')
            {
                current_level++;
            }
            else if(temp == 'D')
            {
                current_level--;
            }

            if(current_level == 0 && prev_step<0)
            {
                no_valleys++;
            }
            else if(current_level==0 && prev_step>0)
            {
                no_hills++;
            }
            prev_step=current_level;
        }
        System.out.println(no_valleys);
    }
}