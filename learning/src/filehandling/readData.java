package filehandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readData {
	
	public static void main(String[] args) throws IOException
	{
		Scanner s= new Scanner(System.in);
        System.out.println("Please enter the line number you want to extract");
        int x1=s.nextInt();
		File f = new File("../learning/abc.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		for(int i = 1; i < x1; ++i)
			  br.readLine();
			String lineIWant = br.readLine();
			System.out.println(lineIWant);
				
	}

}
