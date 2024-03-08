//To Check wether the 7th and 15th Bit is ON or OFF using hexadecimal

import java.util.*;

class Program195
{
    public static boolean CheckBit(int iNo)
    {
        int iMask = 0X00004040;
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
            System.out.println("7th and 15 th Bit is ON");
        }
        else
        {
            System.out.println("17th and 15th Bit is OFF");
        }

    }
}
