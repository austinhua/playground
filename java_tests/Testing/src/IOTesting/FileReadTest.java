package IOTesting;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class FileReadTest {
	static final String fileName = "test.txt";
	
	public static void main(String[] args) {
		//System.out.println("current dir : " +  System.getProperty("user.dir"));
				
		URL url = FileReadTest.class.getResource("test.txt");
		// getClass().getResource(fileName") for non-static contexts
		File file;
		Scanner s;
		try {  
			file = new File(url.toURI());
			s = new Scanner(file);
		} 
		
		catch (URISyntaxException | FileNotFoundException e) {
			System.out.println("Error finding file: " + fileName);
			return;
		}
	    
		String data = s.useDelimiter("\\Z").next();
		s.close();
		
		System.out.println(data);
	}
	
	
}
