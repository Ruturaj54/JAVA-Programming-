//********WAP which takes position from user and check wether the bit is on or off *********
//input 865 -> 833
import java.util.*;

class Program210
{
    public static boolean CheckBit(int iNo,int iPos)
    {
        int iMask = 0X00000001;
        iMask = iMask << (iPos - 1);  //used for shifting purpose
        int iResult = 0;

        iResult = iNo & iMask;
        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        boolean bRet = false;
        int iPos = 0;
        
        System.out.println("Enter the Number:");
        iNo = sobj.nextInt();

        System.out.println("Enter the Position of bit that you want to Offf..:");
        iPos = sobj.nextInt();

        bRet = CheckBit(iNo,iPos);
        
        if(bRet == true)
        {
            System.out.println("Bit "+iPos+" is ON:");
        }
        else
        {
            System.out.println("Bit "+iPos+" is OFF:");
        }

        sobj.close();
       
    }
}
