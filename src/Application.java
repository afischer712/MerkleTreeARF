/**
 * 
 * This class prompts the user for the location of a text file, then generates DataBlocks of the information
 * with the DataReader class before passing the DataBlocks to the MerkleTree class to be hashed and added
 * to the tree.
 * 
 * @author Adam Fischer
 * @version 12/2/19
 * 
 * 
 * CS 215 Programming Project 4
 * Fall 2019
 * 
 */

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.*;


public class Application {

	public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
		
		Scanner input = new Scanner(System.in);
		
		String txt;
		
		System.out.print("Please input the name / location of the file to be hashed: ");
		//  Needs the location of the text file to be input in a way that will allow it to be used
		//  as a string (meaning that it needs a double backslash)
		//	C:\\Users\\adfis\\eclipse-workspace\\MerkleTreeARF\\src\\movies2.txt
		//  C:\\Users\\adfis\\eclipse-workspace\\MerkleTreeARF\\src\\movies.txt
		txt = input.next();
		
		DataReader data = new DataReader(txt);
		MerkleTree tree = new MerkleTree();
		
		for(int i = 1; i!=data.getFileLength(txt)+1; i++) {
			
			System.out.println(tree.hashNode(data.createDataBlocks(i)));
			
		}// end for loop to generate a datablock for each line in the .txt file
			    
	}// end main

}// end application
