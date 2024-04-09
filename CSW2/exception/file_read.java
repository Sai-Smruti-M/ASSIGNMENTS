import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class file_read
{
    public static void main(String[] args) 
    {
        try
        {
        FileReader fr=new FileReader("text1.txt");
        Scanner sc=new Scanner(fr);
        while(sc.hasNextLine())
        {
            String s=sc.nextLine();
            System.out.println(s);
        }
        sc.close();

        }
        catch(FileNotFoundException e)
        {
            System.out.println("FILE DOES NOT EXIST!!");
            System.out.println(e.getMessage());
        }

    }
}
