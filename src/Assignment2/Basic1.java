package Assignment2;

import java.util.Date;

public class Basic1 {

	
//	Java Program to Add two Numbers
	public int Add(int a,int b) {
		return a+b;
	}
	
	
//	Java Program to Check Even or Odd Number
	public String VerifyEvenOrOddNumber(int a) {	
		if (a%2==0) {
			return "even";
		}else {
			return "odd";
		}	
	}

//	Java Program to Multiply two Numbers
	public int Multiply(int a,int b) {
		return a*b;
	}
//	Java Program to check Leap Year
	
	
	
//	Java Program to check whether input character is vowel or consonant
	public String VeriyVowelOrConsonent(char c) {
		
		if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			return "Vowel";
		} else {
			return "Consonent";
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Basic1 test=new Basic1();
		System.out.println(test.VerifyEvenOrOddNumber(5));
		System.out.println(test.VerifyEvenOrOddNumber(6));
		System.out.println(test.VeriyVowelOrConsonent('U'));
	}
	
}
