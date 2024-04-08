//write a program that allows you to keep
//accessing an array until a valid index 
//is givrn by the user and if there are 
//more than 5 retries produce an errror 
import java.util.Scanner;
public class task1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ar[]={1,2,3,4,5,6};
        boolean flag=true;
        int i=0;
        while(flag&&i<5)
        {
        int index;
        try
            {
                System.out.println("enter the index of the array");
                index=sc.nextInt();
                System.out.println(ar[index]);
                break;
                

            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("invalid index");
                i++;

            }
        }
        if(i==5)
        {
            System.out.println("error: u have exceeded 5 retries");
        }
    }
    
    
}
