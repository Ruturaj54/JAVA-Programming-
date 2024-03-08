
//==============================================================================================w
//************************Problems on Matrix using Proper class Design**************************
//==============================================================================================

import java.util.*;

class Program231
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0,iCol = 0;
        System.out.println("Enter the number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow,iCol);
        mobj.Accept();
        mobj.Display();
        int iRet = mobj.Summation();
        System.out.println("SUmmation all Array Elements is :"+iRet);
        sobj.close();
        
    }
}
class Matrix
{   
    public int Arr[][]; //characteristics

    public Matrix(int A,int B)  //parameterized constructor
    {
        Arr = new int[A][B];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements :");
        for(int i = 0;i < Arr.length;i++)
        {
            for(int j = 0;j < Arr[i].length;j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
    
        }
        sobj.close();
    }

    public void Display()
    {
        System.out.println("Entered Elements are: ");
        for(int i = 0;i < Arr.length;i++)
        {
            for(int j = 0;j < Arr[i].length;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int Summation()
    {
        int i = 0,j = 0,iSum = 0;
        for(i = 0;i < Arr.length;i++)
        {
            for(j = 0;j < Arr[i].length;j++)
            {
                iSum = iSum + Arr[i][j];
            }
        }
        return iSum;
    }
    
}