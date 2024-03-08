import java.util.*;

class Program177
{
    public static void EvenOddFactors(int iNo)
    {
        int iFact = 1;
        int i = 1;

        for(i = 1;i <= iNo;i++)
        {
            if((iNo % i) == 0)
            {
                if((i % 2)== 0)
                {
                    System.out.println("Even Factor is : "+i);
                }
                else
                {
                    System.out.println("Odd Fcators is : "+i);

                }
            }
        }

    
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iAns = 0;

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        EvenOddFactors(iValue);

        sobj.close();
    }
}

