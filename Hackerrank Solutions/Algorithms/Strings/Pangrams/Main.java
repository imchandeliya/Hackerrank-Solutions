import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //Create 2D array containing all alphabets and maintain occurence 
        char[][] characters = 
        {
            
            {'a','0'},
            {'b','0'},
            {'c','0'},
            {'d','0'},
            {'e','0'},
            {'f','0'},
            {'g','0'},
            {'h','0'},
            {'i','0'},
            {'j','0'},
            {'k','0'},
            {'l','0'},
            {'m','0'},
            {'n','0'},
            {'o','0'},
            {'p','0'},
            {'q','0'},
            {'r','0'},
            {'s','0'},
            {'t','0'},
            {'u','0'},
            {'v','0'},
            {'w','0'},
            {'x','0'},
            {'y','0'},
            {'z','0'} 
        };
        boolean[] alphabets = 
        {
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false, 
            false
        };

        int i, j;
        //Just -cross check all values (Testing purpose)
/*        
        System.out.println("All characters with occurence flag:");
        for(i=0 ; i<26 ; i++)
        {  
            System.out.println(characters[i][0]+" : "+alphabets[i]);
        }
*/
        String input = scan.nextLine();
        input = new String(input.toLowerCase());
        for(i=0 ; i<input.length() ; i++)
        {
  //          System.out.print("\nCurrent letter:"+input.charAt(i)+", ASCII:"+(int)input.charAt(i) );
            if( input.charAt(i) >=97 && input.charAt(i)<=122 )
            {
                if( characters[(int)input.charAt(i)-97][1] == '0'  )
                {
    //                System.out.println("\nCurrent Letter input:"+input.charAt(i)+", current letter Array:"+characters[(int)input.charAt(i)-97][0]);
                    characters[(int)input.charAt(i)-97][1] = '1';
                }
                    
            }
            
        }

        boolean isTrue = true;
        for(i=0 ; i<26 ; i++)
        {
            if(characters[i][1] == '0')
            {
                isTrue = false;
            }
        }
        if(isTrue)
            System.out.println("pangram");
        else
            System.out.println("not pangram");

/*        //Testing
        System.out.println("All characters with occurence flag:");
        for(i=0 ; i<26 ; i++)
        {  
            System.out.println(characters[i][0]+" : "+characters[i][1]);
        }
 */
    }
}