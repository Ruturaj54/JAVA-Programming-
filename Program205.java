//WAP to off the 18th bit of the users Number

import java.util.*;

class Program204
{
    public static int OffBit(int iNo)
    {
        int iMask = 0X00020000;
        int iResult = 0;
        iResult = iNo & iMask;
        

        if(iResult == iMask)    //18th bit is ON
        {
           return (iNo ^ iMask);
        }
        else                    //18th bit is OFF
        {
            return iNo;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;
        
        System.out.println("Enter the Number:");
        iNo = sobj.nextInt();

        iRet = OffBit(iNo);

        System.out.println("Updated number is : "+iRet);

        sobj.close();
       
    }
}
