/*
    Matrix array rotation hackerrank algorithm solution
    author = Aditya Kumar Chandeliya
*/

import java.util.Scanner;

class Main 
{
    public static void main(String[] args)
    {
        Scanner  scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int r = scan.nextInt();

        int[][] matrix = new int[m][n];

        int i,j;

        //Inputs
        for(i=0 ; i<m ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }

        //No of rotations
        for(i=0 ; i<r ; i++)
        {
            matrix = rotation(matrix,m,n);
        }
        
        print(matrix,m,n);
    }

    //Main logic
    static int[][] rotation(int[][] matrix, int m, int n)
    {
        int max = max(m,n) / 2;
        int min = min(m,n) / 2;
        
        int[] tempUpper = new int[min];
        int[] tempLower = new int[min];
        int[] tempRight = new int[min];
        int[] tempLeft = new int[min];
        int i,j;
        //Store temp upper values
        for(i=0 ; i<min ; i++)
            tempUpper[i] = matrix[i][i];


        //Top left movement
        for(i=0 ; i<min ; i++)
            for(j=i+1 ; j<n-i ; j++)
                matrix[i][j-1] = matrix[i][j];

        //Store temp left values
        for(i=0 ; i<min ; i++)
            tempLeft[i] = matrix[m-i-1][i];

        //Left bottom movement
        for(j=0 ; j<min ; j++)
            for(i=m-j-1 ; i>j ; i--)
                 matrix[i][j] = matrix[i-1][j];
        for(i=0 ; i<min ; i++)
            matrix[i+1][i] = tempUpper[i];

        //Store temp bottom values
        for(i=0 ; i<min ; i++)
            tempLower[i] = matrix[m-i-1][n-i-1];

        //Bottom right movement
        int temp=0;
        for(i=m-1 ; i>m-1-min ; i--)
        {
            for(j=n-temp-1 ; j>temp+1 ; j--)
            {
                matrix[i][j] = matrix[i][j-1];
            }
            temp++;
        }
        for(i=0 ; i<min ; i++)
            matrix[m-i-1][i+1] = tempLeft[i];
        
        //Store temp right values
        for(i=0 ; i<min ; i++)
            tempRight[i] = matrix[i][n-1-i];

        temp = 0;
        //Right Upper movement
        for(j=n-1 ; j>min-1 ; j--)
        {
            for(i=temp ; i<m-temp-1 ; i++ )
            {
                matrix[i][j] = matrix[i+1][j];
            }
            temp++;
        }
        for(i=0 ; i<min ; i++)
            matrix[m-i-2][n-i-1] = tempLower[i];

        //Assign remaining temp values


/*
        //temp test (to be erased)
        System.out.println("Minimum value is:"+min);
        System.out.print("UpperTemp Values: ");
        for(i=0 ; i<min ; i++)
            System.out.print(tempUpper[i]+" ");
        System.out.print("\nLeftTemp values: ");
        for(i=0 ; i<min ; i++)
            System.out.print(tempLeft[i]+" ");
        System.out.print("\nBottomTemp values: ");
        for(i=0 ; i<min ; i++)
            System.out.print(tempLower[i]+" ");
        System.out.print("\nRightTemp values: ");
        for(i=0 ; i<min ; i++)
            System.out.print(tempRight[i]+" ");
        System.out.println();
*/
        //return matrix
        return matrix;
    }

    //Print function
    static void print(int[][] matrix, int m, int n)
    {
        for(int i=0 ; i<m ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int max(int m, int n)
    {
        if(m>=n)
            return m;
        else
            return n;
    }
    static int min(int m, int n)
    {
        if(m<=n)
            return m;
        else
            return n;
    }
}