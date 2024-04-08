import java.util.Scanner;

class customnullpointerexception extends Exception
{
    customnullpointerexception(String msg)
    {
        super(msg);
    }

}
public class Qn3 
{
    public static void main(String[] args) 
    {

        String s=null;
        try
        {
            if(s==null)
            {
            throw new customnullpointerexception("cant find the length of a null value");
            }
            System.out.println("length of the string="+s.length());//dead code ,just for understanding

        }
        catch(customnullpointerexception e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
}
