//********WAP which takes position from user and off the bit *********
//input 865 -> 833
import java.util.*;

class Program209
{
    public static int OffBit(int iNo,int iPos)
    {
        int iMask = 0X00000001;
        iMask = iMask << (iPos - 1);  //used for shifting purpose
        int iResult = 0;

        iResult = iNo & iMask;
        if(iResult == iMask)
        {
            return (iNo ^ iMask);
        }
        else
        {
            return iNo;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;
        int iPos = 0;
        
        System.out.println("Enter the Number:");
        iNo = sobj.nextInt();

        System.out.println("Enter the Position of bit that you want to Offf..:");
        iPos = sobj.nextInt();

        iRet = OffBit(iNo,iPos);
        System.out.println("Updated number is : "+iRet);

        sobj.close();
       
    }
}
