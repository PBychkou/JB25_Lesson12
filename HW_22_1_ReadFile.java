import java.io.*;
import java.util.*;

public class HW_22_1_ReadFile {

	private Scanner file;
	
	public void openFile() {
		
		try {
			file = new Scanner (new File("d:/HW_22_1_Library.txt"));
		}
		catch (Exception e) {
			System.out.println ("Could not find File");
		}
	}
	
	public void readFile() {
		while (file.hasNext()) {
			String bookName = file.next();
			String author = file.next();
			String yearPublished = file.next();
			String price = file.next();
			
			List<String> list = new ArrayList<String>();
			list.add(bookName);
			list.add(author);
			list.add(yearPublished);
			list.add(price);
			
			System.out.printf("%s\n", list.toString());
	
		}
	}
	
	public void closeFile() {
		file.close();
	}
}
