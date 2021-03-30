package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataOfRange {
	
	public void ReadDatainRange(int start, int end) throws IOException
	{
		
		File f = new File("../learning/abc.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int a1=start;
		int a2=end;
	String line;
		
	for ( int ln = 0; (line = br.readLine()) != null && ln <= a2; ln++ ) {
	    if ( ln >= a1 ) {
//		for (int i = a1; i < a2+1; i++) {
//			if (br.readLine()) == null)
         //   while ((lineIWant = br.readLine()) != null) {
			line= br.readLine();
                System.out.println(line);
         //   }
        }
	}
//		while ( a2>=a1)
//		{
//		
//			 br.readLine();
//				 lineIWant = br.readLine();
//				System.out.println(lineIWant);
//				--a2;
//		}
	}

	public static void main(String[] args) throws IOException
	{
		Scanner s= new Scanner(System.in);
        System.out.println("Please enter the first row number you want to extract");
        int x1=s.nextInt();
        System.out.println("Please enter the last row number you want to extract");
        int x2=s.nextInt();
		ReadDataOfRange r=new ReadDataOfRange();
		r.ReadDatainRange(x1, x2);

}
}
