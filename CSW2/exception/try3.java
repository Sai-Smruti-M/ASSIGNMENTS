public class try3 
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("s");
            try
            {
                String s=null;
                System.out.println(s.length());


            }
            catch(NullPointerException e)
            {
                System.out.println("cant determine the length of a null value");
            }

        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }

}
