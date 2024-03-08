//To Check wether the 3rd Bit is ON or OFF

import java.util.*;

class Program194
{
    public static boolean CheckBit(int iNo)
    {
        int iMask = 4;
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
        

        System.out.println("Enter the Number:");
        iNo = sobj.nextInt();

        bRet = CheckBit(iNo);
        
        if(bRet == true)
        {
            System.out.println("3rd Bit is ON");
        }
        else
        {
            System.out.println("3rd Bit is OFF");
        }

    }
}
