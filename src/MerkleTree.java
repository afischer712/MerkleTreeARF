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

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import TreePackage.*;

public class MerkleTree  {
	
	BinarySearchTree bTree = new BinarySearchTree();
	
	
	
	public MerkleTree() {
		
		
		
	}// end contructor
	
	 private static byte[] getSHA(DataBlock input) throws NoSuchAlgorithmException 
	    {  
	        // Static getInstance method is called with hashing SHA  
	        MessageDigest md = MessageDigest.getInstance("SHA-256");  
	  
	        // digest() method called  
	        // to calculate message digest of an input  
	        // and return array of byte 
	        return md.digest(input.getData().getBytes(StandardCharsets.UTF_8));  
	    } 
	    
	    private static String toHexString(byte[] hash) 
	    { 
	        // Convert byte array into signum representation  
	        BigInteger number = new BigInteger(1, hash);  
	  
	        // Convert message digest into hex value  
	        StringBuilder hexString = new StringBuilder(number.toString(16));  
	  
	        // Pad with leading zeros 
	        while (hexString.length() < 32)  
	        {  
	            hexString.insert(0, '0');  
	        }  
	  
	        return hexString.toString();  
	    } 
	
	
	@SuppressWarnings("unchecked")
	public String hashNode(DataBlock data) throws NoSuchAlgorithmException {
		String hash;
		
		
		
		hash = toHexString(getSHA(data));
		
		bTree.add(hash);
		
		return hash;
		
	}// end hashNode
	
	public int getTreeHeight() {
		return bTree.getHeight();
	}
	

}// end MerkleTree
