package Assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BasicStrings {

	
//	Java Program to Convert char to String and String to Char
	
	public String convertCharToString(char c) {
	return Character.toString(c);
	}
	
	public char[] stringCharToChar(String c) {
	return c.toCharArray();
	}
	
//	Java Program to find duplicate characters in a String
	public char[] findAndReturnDuplicateCharacters(String s) {
		char[] c=s.toCharArray();
		String res="";
		for (int i = 0; i < c.length-1; i++) {
			for (int j = i+1; j < c.length; j++) {
					if (c[i]==c[j]) {
						res=res+c[i];
					}
			}
		}
		return res.toCharArray();
	}
	
//	Java Program to check Palindrome String using Stack, Queue, For and While loop
	
	public boolean verifyPalindrome(String s) {
		char[] origString=s.toCharArray();
		int j=0;
		char[] reversedString = new char[origString.length];
		for (int i = origString.length-1; i >=0 ; i--) {
			reversedString[j]=origString[i];
			j=j+1;
		}
		if (String.copyValueOf(reversedString).equals(s)) {
			return true;
		}else {
			return false;
		}
		
	}
//	Java Program to sort strings in alphabetical order
	public String[] sortStrings(String[] s) {
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if ((s[i].compareTo(s[j]))>0) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		return s;
	}
	
	
//	Java Program to reverse words in a String

//	Java program to find occurrence of a character in a String
//	Java program to count vowels and consonants in a String
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BasicStrings strings= new BasicStrings();
		System.out.println(strings.findAndReturnDuplicateCharacters("Naga"));
		System.out.println(strings.verifyPalindrome("LIRIL"));
		String[] s1= {"Naga","Jiva","Zebra","Kelly"};
		String[] s2=(strings.sortStrings(s1));
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
		
	}

}
