import java.io.File;


public class file_delete
{
    public static void main(String[] args) 
    {
        

            File f=new File("text2.txt");
            f.delete();
            if(f.delete())
            {
                System.out.println("file succesfully deleted");
            }
    
    }
}
//first create a file named text 2 using createfile
// method whicg works with a file object 
