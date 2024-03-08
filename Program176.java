import java.util.*;

class Program176
{
    public static int Factorial(int iNo)
    {
        int iFact = 1;
        int i = 1;

        while(i <= iNo)
        {
            iFact = i * iFact;
            i++;
        }
        return iFact;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iAns = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        iAns = Factorial(iValue);

        System.out.println("Factorial is : "+iAns);

        sobj.close();
    }
}

