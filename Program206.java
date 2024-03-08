//********WAP to toggle the 7th bit from the number given by user*********

import java.util.*;

class Program204
{
    public static int ToggleBit(int iNo)
    {
        int iMask = 0X00000040;
        int iResult = 0;
        iResult = iNo ^ iMask;
                
        return iResult; // if On then off else if off then on
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;
        
        System.out.println("Enter the Number:");
        iNo = sobj.nextInt();

        iRet = ToggleBit(iNo);

        System.out.println("Toggled Updated number is : "+iRet);

        sobj.close();
       
    }
}
