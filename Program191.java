import java.util.*;

class Program191
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iDigit = 0;
        int Arr[] = {};

        System.out.println("Enter the Number:");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            iDigit = iNo % 2;
            iNo = iNo / 2;
            System.out.print(iDigit);
        }
        System.out.println();

    }
}

/*
1. &    Bitwise And
2. |    Bitwise OR
3. ^    Bitwise XOR
4. <<   Bitwise Left shift
5. >>   Bitwise Right Shift
*/