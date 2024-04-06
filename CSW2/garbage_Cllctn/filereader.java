package garbage_Cllctn;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class filereader {

	public static void main(String[] args) 
	{
		try
		{
			
	
      //FileReader fr=new FileReader(new File("inputfile.txt"));
      FileInputStream fr=new FileInputStream(new File("inputfile.txt"));

      int c;
      try
      { 
      while((c=fr.read())!=-1)
      {
    	  System.out.println((char)c);
      }
      }
      catch(IOException e)
      {
    	  System.out.println("error");
      }
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
		}
	}

}
