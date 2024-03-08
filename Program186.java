import java.util.*;

class Program186
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter Your Name : ");
        str = sobj.nextLine();

        int iCnt = 0;

        for(iCnt = 0;iCnt < str.length();iCnt++)
        {
            System.out.println(str.charAt(iCnt)); //Character At index 0,1,2,3,4
        }

        sobj.close();
    }
}

