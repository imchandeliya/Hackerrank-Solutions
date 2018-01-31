import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int noClouds = scan.nextInt();
        int jumpDistance = scan.nextInt();
        int[] cloudType = new int[noClouds];
        int i;

        for(i=0 ; i<noClouds ; i++)
            cloudType[i] = scan.nextInt();
        int energy = 100;
        int currentCloud = 0;
        while(currentCloud < noClouds-1)
        {
            currentCloud = currentCloud + jumpDistance;
            if(currentCloud > noClouds-1)
                break;
            if(cloudType[currentCloud] == 1)
                energy = energy - 3;
            else if(cloudType[currentCloud] == 0)
                energy = energy-1;
//            System.out.println("Current Cloud="+currentCloud+", Energy Remaining:"+energy);
        }
        if(cloudType[0] == 1)
            System.out.println(energy-3);
        else
            System.out.println(energy-1);
    }
}