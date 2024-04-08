import java.util.Scanner;
class myexception extends Exception
{
    public String toString()
    {
        return super.toString()+"i am to string";
    }
    public String getMessage()
    {
        return super.getMessage()+"i am get message";

    }


}
public class classexception 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the reg no of any student in ITER(REG IS OF 6 NOS)");
        int reg=sc.nextInt();
        if(reg<100000)
        {
            try
            {
            throw new myexception();
            }
            catch(myexception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
            System.out.println("finish");


        
        
    }
    }
}
