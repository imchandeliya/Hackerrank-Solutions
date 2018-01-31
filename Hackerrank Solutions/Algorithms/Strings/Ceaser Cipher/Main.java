import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        String input = scan.next();
        int cipherOrder = scan.nextInt();
        int temp;
        StringBuilder result = new StringBuilder("");

        for (int i=0; i<size ; i++)
        {
            if( (int)input.charAt(i)>=65 && (int)input.charAt(i)<=90 || (int)input.charAt(i)>=97 && (int)input.charAt(i)<=122   )
            {
                if (Character.isUpperCase(input.charAt(i)))
                {
                    char ch = (char)(((int)input.charAt(i) +
                                    cipherOrder - 65) % 26 + 65);
                    result.append(ch);
                }
                else
                {
                    char ch = (char)(((int)input.charAt(i) +
                                    cipherOrder - 97) % 26 + 97);
                    result.append(ch);
                }
            }
            else{
                result.append(input.charAt(i));
            }
        }

        System.out.println(result);
    }
}