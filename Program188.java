import java.util.*;

class Program188
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter Your Name : ");
        str = sobj.nextLine();

        char Arr[] = str.toCharArray();
        int iCnt = 0;

        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        sobj.close();
    }
}

