import java.io.FileWriter;
import java.io.IOException;

public class file_write 
{
    public static void main(String[] args) 
    {
        try
        {
        FileWriter fw=new FileWriter("text1.txt");
        fw.write("i am writing on the file");
        fw.close();//closing the fridge
        }
        catch(IOException e)
        {
            System.out.println("FILE NOT PRESENT!");
            System.out.println(e.getMessage());
        }

        
    


    }
}
