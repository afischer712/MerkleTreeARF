import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * This class creates DataBlocks from an input text file for use in MerkleTree.
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
	
	String filename;// the location and name of the file that needs to be converted into data blocks
	int fileLength;//  the number of lines in the file
	
	public DataReader() {
		
	}//end empty argument constructor
	
	public DataReader(String name) {
		setFilename(name);
	}// end constructor

	/**
	 * 
	 * This method takes in a line number and creates a data block of that line
	 * 
	 * @param line - the int line number needed to be turned into a datablock
	 * @return - returns a datablock with the information from the specified line from the file
	 * @throws IOException
	 */
	public DataBlock createDataBlocks(int line) throws IOException {
		
		File file =   new File(filename); 
	    Scanner sc = new Scanner(file);
	    
	    for(int i=1; i<line; i++) {// iterates through to the specified line
	    	sc.nextLine();
	    }
		
	    DataBlock block = new DataBlock(sc.nextLine());
	    
		return block;
		
	}// end create Datablocks
	
	/**
	 * 
	 * This method takes in a file name and outputs the number of lines in the file
	 * 
	 * @param filename - the string location of the file
	 * @return - returns the int number of lines in the file
	 * @throws FileNotFoundException
	 */
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
