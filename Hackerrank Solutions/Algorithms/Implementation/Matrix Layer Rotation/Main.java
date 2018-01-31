import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int r = scan.nextInt();
        int i, j, k;

        int[][] matrix = new int[m][n];
        for(i=0 ; i<m ; i++)
            for(j=0 ; j<n ; j++)
                matrix[i][j] = scan.nextInt();
        
        //Logic
        int optimalRotations;
        int layers = min(m,n)/2;
        int temp=0, temp2=0;

        for(i=0 ; i<layers ; i++)
        {
            optimalRotations = r % (2*(m+n-(4*i)-2));

            while(optimalRotations>0)
            {
                //Top left rotation
                temp = matrix[i][i];
                for(j=i+1 ; j<n-i ; j++)
                    matrix[i][j-1] = matrix[i][j];
                
                //Left bottom rotation
                temp2 = matrix[m-i-1][i];
                for(j=m-i-1 ; j>i ; j--)
                    matrix[j][i] = matrix[j-1][i];
                matrix[i+1][i] = temp;

                //Bottom Right Rotation
                temp = matrix[m-i-1][n-i-1];
                for(j=n-1-i ; j>i+1 ; j--)
                    matrix[m-i-1][j] = matrix[m-i-1][j-1];
                matrix[m-i-1][i+1] = temp2;

                //Right Upper Rotation
                temp2 = matrix[i][n-i-1];
                for(j=i ; j<m-i-2 ; j++)
                    matrix[j][n-i-1] = matrix[j+1][n-i-1];
                matrix[m-i-2][n-i-1] = temp;

                optimalRotations--;
            }
            
        }
        

        //Print Values
        for(i=0 ; i<m ; i++)
        {
            for(j=0 ; j<n ; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int min(int m, int n)
    {
        if(m<=n)
            return m;
        else
            return n;
    }
}