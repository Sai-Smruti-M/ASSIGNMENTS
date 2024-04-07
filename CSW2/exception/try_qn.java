//write a program that allows you to keep
//accessing an array until a valid index 
//is given by the user
import java.util.Scanner;
public class try_qn 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ar[]={1,2,3,4,5,6};
        boolean flag=true;
        while(flag)
        {
        int index;
        try
            {
                System.out.println("enter the index of the array");
                index=sc.nextInt();
                System.out.println(ar[index]);
                flag=false;

            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                
            }
        }
    }
    
    
}
