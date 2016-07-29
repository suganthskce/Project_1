public class BiggestNumber
{
    public static void main(String args[])
    {   
        if(args.length<9)
          System.out.println("Please enter 9 integer numbers ");
        else
        {
            int a[] [] =new int[3][3];   //declaring 3*3 array
            int k=0;
            int big=0;
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    int number=Integer.parseInt(args[k]);    //getting values from args[] array
                    a[i][j]=number;
                    if(number>big)                          //checking biggest value
                    {
                      big=number;
                    }
                    k++;                                   //To get next value in args[] array
                }
            }
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(a[i][j]+" ");           //Printing values in array
                }
                System.out.println("");
            }    
            System.out.println("The biggest number in the given array is " +big);  //Printing biggest value
        }
    }
}