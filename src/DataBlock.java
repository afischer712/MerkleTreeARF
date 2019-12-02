/**
 * 
 * This class allows for the DataBlock object to take in a string when instantiated. It is used to 
 * create hashes for the data within the MerkleTree class
 * 
 * @author Adam Fischer
 * @version 12/2/19
 * 
 * 
 * CS 215 Programming Project 4
 * Fall 2019
 * 
 */
public class DataBlock {
	
	String data;// a line from a text file
	
	public DataBlock(String data) {
		setData(data);
	}// end constructor

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}// end dataBlock
