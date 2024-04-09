import java.io.File;
import java.io.IOException;

public class file_creation
{
    public static void main(String[] args) 
    {
        try{
        File myfile=new File("text1.txt");
        myfile.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println("file couldnt be created");
            System.out.println(e.getMessage());

        }
    }
}
