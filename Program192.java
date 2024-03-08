import java.util.*;

class Program191
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iDigit = 0;
        int iCnt = 0;
        int Arr[] = {};

        System.out.println("Enter the Number:");
        iNo = sobj.nextInt();

        
        while(iNo != 0)
        {
            iDigit = iNo % 2;
            iNo = iNo / 2;
            if(iDigit == 1)
            {
                iCnt++;
            }
        }

        System.out.println("Number of 1 Bits are : "+iCnt);
    }
}

/*
1. &    Bitwise And
2. |    Bitwise OR
3. ^    Bitwise XOR
4. <<   Bitwise Left shift
5. >>   Bitwise Right Shift
*/