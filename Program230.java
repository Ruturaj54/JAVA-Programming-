
//====================================================================
//************************Problems on Matrix**************************
//====================================================================

import java.util.*;

class Program230
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0,iCol = 0;
        int i = 0,j = 0;

        System.out.println("Enter the number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iCol = sobj.nextInt();

        int Arr[][] = new int [iRow][iCol];

        System.out.println("Enter the elements : ");
        //    1     2       3
        for(i = 0;i < iRow;i++) //Outer
        {
            //    1     2       3
            for(j = 0;j < iCol;j++)  //Inner
            {
                Arr[i][j] = sobj.nextInt(); //4
            }
        }

        Matrix mobj = new Matrix();
        mobj.Display(Arr);
        int iRet = mobj.Summation(Arr);
        System.out.println("Summation of All Array Elements is : "+iRet);
        mobj.SummationOfRow(Arr);
        sobj.close();
        
    }
}
class Matrix
{   
    public void Display(int Arr[][])
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

    public int Summation(int Arr[][])
    {
        int iSum = 0;

        for(int i = 0;i < Arr.length;i++)
        {
            for(int j = 0;j < Arr[i].length;j++)
            {
                iSum = iSum + Arr[i][j];
            }
            
        }
        return iSum;
    }

    public void SummationOfRow(int Arr[][])
    {
        int RowSum = 0;

        for(int i = 0;i < Arr.length;i++)
        {
            RowSum = 0;
            for(int j = 0;j < Arr[i].length;j++)
            {
                RowSum = RowSum + Arr[i][j];
            }
            System.out.println("Summation of each Row of Array Elements is : "+RowSum);
            
        }
       
    }
}