package basic_Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) throws FileNotFoundException{
		
		File file = new File("D:\\input.txt");
		
		Scanner scan = new Scanner(file);
		
		File outfile = new File("D:\\output.txt");
		
		PrintWriter writer = new PrintWriter(outfile);
		
		while(scan.hasNext())
		{
			int number = scan.nextInt();
			number = number*number;
			
			writer.println(number);
		}
		
		scan.close();
		writer.close();
	}

}
