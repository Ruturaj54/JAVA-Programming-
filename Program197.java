//To Check wether the 7th Bit and 15th bit is ON or OFF

import java.util.*;

class Program197
{
    public static boolean CheckBit(int iNo)
    {
        int iMask = 16448; //2^6 + 2^16
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
            System.out.println("7th and 15th Bit is ON");
        }
        else
        {
            System.out.println("7th and 15th Bit is OFF");
        }

    }
}
