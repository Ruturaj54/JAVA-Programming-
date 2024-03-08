
import java.util.*;

class Program183
{
    public static int Addition(int Brr[])
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 0;iCnt < Brr.length;iCnt++)
        {
            iSum = iSum + Brr[iCnt];
        }
       return iSum;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize = 0,iCnt = 0;
        int iAns = 0;

        System.out.println("Enter the Number of Elememts : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");
        for(iCnt = 0;iCnt < iSize;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        iAns = Addition(Arr);

        System.out.println("Addition of All Array Elements are : "+iAns);

        sobj.close();
    }
}

