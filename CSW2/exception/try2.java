import java.util.Scanner;
public class try2
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter index to display its element=");
        int index=sc.nextInt();
        System.out.println("eneter the no u want to divide with the extracted array element");
        int no=sc.nextInt();


        try
        {
            System.out.println("the element is="+a[index]);

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("invalid index which is out of arrays range");
            System.out.println(e);
        }
        try 
        {
            System.out.println(4/no);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cant divide the no by zero");
            System.out.println(e);
        }
        sc.close();


    }
    
}
//a pgm can have two try catch blocks
//and will run simuntaneously one after the other