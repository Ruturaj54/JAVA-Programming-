
import java.util.*;

class Program181
{
    public static void Display(int Brr[])
    {
        int iCnt = 0;
        System.out.println("Elements of array are : ");
        for(iCnt = 0;iCnt < Brr.length;iCnt++)
        {
            System.out.print(Brr[iCnt]+"\t");
        }
        System.out.println();
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize = 0,iCnt = 0;

        System.out.println("Enter the Number of Elememts : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");
        for(iCnt = 0;iCnt < iSize;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        Display(Arr);
    
        sobj.close();
    }
}

