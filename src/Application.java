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

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.*;
public class Application {

	public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
		
		
		Scanner input = new Scanner(System.in);
		
		String txt;
		
		System.out.print("Please input the name / location of the file to be hashed: ");
		//	C:\\Users\\adfis\\eclipse-workspace\\MerkleTreeARF\\src\\movies2.txt
		//  C:\\Users\\adfis\\eclipse-workspace\\MerkleTreeARF\\src\\movies.txt
		txt = input.next();
		
		DataReader data = new DataReader(txt);
		MerkleTree tree = new MerkleTree();
		
		for(int i = 1; i!=data.getFileLength(txt)+1; i++) {
			
			System.out.println(tree.hashNode(data.createDataBlocks(i)));
			
		}// end for loop
			    
	}// end main

}// end application
