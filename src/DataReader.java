import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * 
 * Explanation
 * 
 * @author Adam Fischer
 * @version 12/2/19
 * 
 * 
 * CS 215 Programming Project 4
 * Fall 2019
 * 
 */
public class DataReader {
	
	String filename;
	int fileLength;
	
	public DataReader() {
		
	}//end empty argument constructor
	
	public DataReader(String name) {
		setFilename(name);
	}// end constructor

	public DataBlock createDataBlocks(int line) throws IOException {
		
		File file =   new File(filename); 
	    Scanner sc = new Scanner(file);
	    
	    for(int i=1; i<line; i++) {
	    	sc.nextLine();
	    }
		
	    DataBlock block = new DataBlock(sc.nextLine());
	    
		return block;
		
	}// end create Datablocks
	
	public int getFileLength(String filename) throws FileNotFoundException {
		
		Boolean bool = false;
		Integer number = 0;
		
		File file =   new File(filename); 
	    Scanner sc = new Scanner(file); 
	    
	    while(sc.hasNextLine()) {
	    	sc.nextLine();
	    	number++;
	    }// end while loop to iterate through the file, noting the number of lines
	    
		return number;
		
	}// end get file length
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
	

}// end DataReader
