package week1day2;



public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int r,sum=0,temp;    
		  int n=1001;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0)
		  {    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10; 
		  }    
		  if(temp==sum)    
		   System.out.println(temp+" is a palindrome number ");    
		  else    
		   System.out.println(temp+" is not a palindrome");    
		}  
		}  