import java.util.*;

class Program236
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0,iRet = 0;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();
        
        MyMatrix mobj = new MyMatrix(iRow,iCol);

        mobj.Accept();
        mobj.Display();
        mobj.SummationOfRow();
        mobj.MaximumOfRow();
        mobj.MinimunOfRow();

        System.out.println("Enter the Number that you want to count frequency \n");
        int iNumb = sobj.nextInt();
        iRet = mobj.Frequency(iNumb);
        System.out.println("The Frequency of "+iNumb+" is : "+iRet);

        iRet = mobj.CountEven();
        System.out.println("Even numbers are : "+iRet);
        iRet = mobj.CountOdd();
        System.out.println("Odd numbers are : "+iRet);
        mobj.OddToEven();
        mobj.Display();

        // Function calls

        mobj = null;
        System.gc();
        sobj.close();
    }
}

class Matrix
{
    protected int Arr[][];

    public Matrix(int A, int B)
    {
        Arr = new int[A][B];
    }

    protected void finalize()
    {
        Arr = null;
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0, j = 0;

        System.out.println("Enter the elements : ");
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("Entered elements are : ");
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class MyMatrix extends Matrix
{
    public MyMatrix(int A, int B)
    {
        super(A,B);
    }

    public void SummationOfRow()
    {
        int RowSum = 0;

        for(int i = 0;i < Arr.length;i++)
        {
            RowSum = 0;
            for(int j = 0;j < Arr[i].length;j++)
            {
                RowSum = RowSum + Arr[i][j];
            }
            System.out.println("Summation of Row " +(i+1)+" of Array Elements is : "+RowSum);
            
        }
       
    }

    public void MaximumOfRow()
    {
        int RowMax = 0;

        for(int i = 0;i < Arr.length;i++)
        {
            RowMax = Arr[i][0];
            for(int j = 0;j < Arr[i].length;j++)
            {
                if(RowMax < Arr[i][j])
                {
                    RowMax = Arr[i][j];
                }
            }
            System.out.println("Maximum number of Row " +(i+1)+" of Array Elements is : "+RowMax);
            
        }
       
    }

    public void MinimunOfRow()
    {
        int RowMin = 0;

        for(int i = 0;i < Arr.length;i++)
        {
            RowMin = Arr[i][0];
            for(int j = 0;j < Arr[i].length;j++)
            {
                if(RowMin > Arr[i][j])
                {
                    RowMin = Arr[i][j];
                }
            }
            System.out.println("Minimum number of Row " +(i+1)+" of Array Elements is : "+RowMin);
            
        }
       
    }

    public int Frequency(int iNo)
    {
        int iCnt = 0;
        for(int i = 0;i < Arr.length;i++)
        {
            for(int j = 0;j < Arr[i].length;j++)
            {
                if(iNo == Arr[i][j])
                {
                    iCnt++;
                }
            }
            
        }
        return iCnt;
       
    }

    public void OddToEven()
    {
        for(int i = 0;i < Arr.length;i++)
        {
            for(int j = 0;j < Arr[i].length;j++)
            {
                if(Arr[i][j] % 2 != 0)
                {
                    Arr[i][j]++;
                }
            }   
        }
    }
    //call Display function

    public int CountOdd()
    {
        int iCnt = 0;
        for(int i = 0;i < Arr.length;i++)
        {
            for(int j = 0;j < Arr[i].length;j++)
            {
                if(Arr[i][j] % 2 != 0)
                {
                    iCnt++;
                }
            }
            
        }
        return iCnt;
    }

    public int CountEven()
    {
        int iCnt = 0;
        for(int i = 0;i < Arr.length;i++)
        {
            for(int j = 0;j < Arr[i].length;j++)
            {
                if(Arr[i][j] % 2 == 0)
                {
                    iCnt++;
                }
            }
            
        }
        return iCnt;
       
    }
}
