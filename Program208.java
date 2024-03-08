//********WAP which takes position from user and then toggles that bit *********
//input 865 -> 833
import java.util.*;

class Program204
{
    public static int ToggleBit(int iNo,int iPos)
    {
        int iMask = 0X00000001;
        iMask = iMask << (iPos - 1);  //used for shifting purpose
        int iResult = 0;
        iResult = iNo ^ iMask;
                
        return iResult; // if On then off else if off then on
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;
        int iPos = 0;
        
        System.out.println("Enter the Number:");
        iNo = sobj.nextInt();

        System.out.println("Enter the Position of bit that you want to toggle..:");
        iPos = sobj.nextInt();

        iRet = ToggleBit(iNo,iPos);
        System.out.println("Toggled Updated number is : "+iRet);

        sobj.close();
       
    }
}
