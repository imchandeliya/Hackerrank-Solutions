/*
    Lisa's workbook hackerrank problem solution'
*/

import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int chapters = scan.nextInt();
        int k = scan.nextInt();
        int[] problems = new int[chapters];
        int i;

        for(i=0 ; i<chapters ; i++)
            problems[i] = scan.nextInt();
        
        //Logic
        int currentPage=1;
        int pageNumber=1;
        int currentChapter=0;
        int countSpecial=0;
        int pageInThisChapter;
        while(currentChapter < chapters)
        {
            pageInThisChapter = problems[currentChapter] / k;
            if(problems[currentChapter]%k > 0)
                pageInThisChapter++;
            for(i=1 ; i<=problems[currentChapter] ; i = i+k)
            {
                if(i<= currentPage && currentPage<(i+k))
                {
                    System.out.println("Question:"+i+" , Page:"+currentPage);
                    countSpecial++;
                }
                currentPage++;
            }
            currentChapter++;
        }
        System.out.println(countSpecial);
    }
}