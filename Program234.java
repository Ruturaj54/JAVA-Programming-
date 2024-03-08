
//==============================================================================================w
//************************Problems on Matrix using Proper class Design Inheritance**************************
//==============================================================================================

import java.util.*;


class Program234
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0,iCol = 0;
        System.out.println("Enter the number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iCol = sobj.nextInt();

        MyMatrix mobj = new MyMatrix(iRow,iCol);
        mobj.Accept();
        mobj.Display();
        int iRet = mobj.Summation();
        System.out.println("Summation all Array Elements is :"+iRet);

        iRet =mobj.MaximumNumb();
        System.out.println("Largest number from all Array Elements is :"+iRet);
        
        iRet = mobj.MinuimumNumb();
        System.out.println("Smallest number from all Array Elements is :"+iRet);
        mobj = null;
        System.gc();
        sobj.close();
        
    }
}

//Destructor in java is optional ie.Finalize

interface Calculation
{
    public int MaximumNumb();
    public int MinuimumNumb();
}

class Matrix
{   
    protected int Arr[][]; //characteristics

    public Matrix(int A,int B)  //parameterized constructor
    {
        Arr = new int[A][B];
    }

    protected void finalize() //it acts like a destructor here
    {
        Arr = null;
        System.out.println("Inside Finalize method\n");
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

}

class MyMatrix extends Matrix implements Calculation
{
    public MyMatrix(int A,int B)
    {
        super(A,B); //it calls the parent class constructor
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

    public int MaximumNumb()
    {
        int i = 0,j = 0,iMax = Arr[0][0];
        for(i = 0;i < Arr.length;i++)
        {
            for(j = 0;j < Arr[i].length;j++)
            {
                if(iMax < Arr[i][j])
                {
                    iMax = Arr[i][j];
                }
            }
        }
        return iMax;
    }

    public int MinuimumNumb()
    {
        int i = 0,j = 0,iMin = Arr[0][0];
        for(i = 0;i < Arr.length;i++)
        {
            for(j = 0;j < Arr[i].length;j++)
            {
                if(iMin > Arr[i][j])
                {
                    iMin = Arr[i][j];
                }
            }
        }
        return iMin;
    }
}