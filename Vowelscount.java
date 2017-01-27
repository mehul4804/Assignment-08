import java.util.Scanner;
import java.io.FileReader;

public class Vowelscount 
{

	public static void main(String[] args) throws Exception 
	{
		FileReader file = new FileReader("C:/Users/Mrs.M.K.Shashikala/Desktop/story.txt");
		        
		        Scanner sc = new Scanner(file);
		        String fileContent = "";
		        while (sc.hasNext()) {
		            fileContent += sc.next() + " ";
		        }
		        
		        sc.close();
		     
		        char[] charArr = fileContent.toCharArray();
		     
		        int counter = 0;
		        for(char c : charArr)
		        {
		              if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y')
		                   counter++;
		        }
		        System.out.println("Number of Vowels: " + counter);
	}

}
