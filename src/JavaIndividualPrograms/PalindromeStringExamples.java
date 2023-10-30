package JavaIndividualPrograms;

import java.util.Scanner;

public class PalindromeStringExamples {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();//strings 
		
		String org_str=str;
		String rev="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);//Madam====>m a d a m
		}
		
 
		if(org_str.equals(rev)) {
			System.out.println(str+ " this is palindrome string");
		}
		else
		{
			System.out.println(str+" this is not a palindrome string");
		}
	}

}
