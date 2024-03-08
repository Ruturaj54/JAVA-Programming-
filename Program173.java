
import java.util.Scanner;

class Program173
{

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0;
        int iNo2 = 0;
        int iAns = 0;

        System.out.println("Enter First Number : ");
        iNo1 = sobj.nextInt();
        System.out.println("Enter Second Number : ");
        iNo2 = sobj.nextInt();

        Arithematic aobj = new Arithematic(iNo1,iNo2);
        iAns = aobj.Addition();
        System.out.println("Addition is : "+iAns);
        sobj.close();
    }
}

class Arithematic
{
    public int iValue1;
    public int iValue2;

    public Arithematic(int A,int B)
    {
        this.iValue1 = A;
        this.iValue2 = B;
    }
    public int Addition()
    {
        int iSum = 0;
        iSum = this.iValue1 + this.iValue2;
        return iSum;
    }
}