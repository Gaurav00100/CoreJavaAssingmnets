// Reading data from a file using FileReader
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
class ReaderTest
{
	public static void main(String[] args) throws IOException
	{
		
		int ch;

		FileReader fr=null;
		
		try
		{
			fr = new FileReader("E:\\\\IntellectTraining\\\\FIleIO.txt");
		}
		catch (FileNotFoundException fe)
		{
			System.out.println("File not found");
		}

		// read from FileReader till the end of file
		while ((ch=fr.read())!=-1)
			System.out.print((char)ch);

		// close the file
		fr.close();
	}
}
