
import Marvellous1.Arithmetic;
import java.util.*;

class Program174
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

        Arithmetic aobj = new Arithmetic(iNo1,iNo2);
        iAns = aobj.Addition();
        System.out.println("Addition is : "+iAns);
        sobj.close();
    }
}
