public class try1 
{
    public static void main(String[] args) 
    {
        int a=1000;
        int b=0;
        try
        {
            int c=a/b;
            System.out.println(c);

        }
        catch(ArithmeticException e)
        {
            System.out.println("failed to divide by zero");
            System.out.println(e);
        }
    }

}

