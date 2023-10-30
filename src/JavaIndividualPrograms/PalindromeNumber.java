package JavaIndividualPrograms;



public class PalindromeNumber {

	public static void main(String[] args) {
		
		  int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10; //454%10==>4 //45%10==5//getting remainder  
		   sum=(sum*10)+r;//0*10+4==4 ==>0*10+5==5   
		   n=n/10;  //454/10==>45 ===>45/10= 
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");  
		

	}

}
