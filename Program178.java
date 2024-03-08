import java.util.*;

class Program177
{
    public static void EvenOddFactors(int iNo)
    {
        int iFact = 1;
        int i = 1;
        int iSumEven = 0;
        int iSumOdd = 0;

        for(i = 1;i <= iNo;i++)
        {     
                if((i % 2)== 0)
                {
                    iSumEven = iSumEven + i;
                }
                else
                {
                    iSumOdd = iSumOdd + i;

                }
        }
        System.out.println("Addition of even factors is : "+iSumEven);
         System.out.println("Addition of Odd factors is : "+iSumOdd);

    
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

