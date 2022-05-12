package assignment;
import java.util.*;
public class Abc {
	
	
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	       
	        //Taking rows value from the user
	        
	        System.out.println("How many rows you want in this pattern?");
	        
	        int rows = sc.nextInt();
	        
	        System.out.println("Here is your pattern....!!!");
	       
	        int alphabet = 65; // ASCII value of alphabet 'A'
	       
	        for (int i= 0; i<= rows-1 ; i++)
	        {
	            for (int j=rows-1; j>i; j--)
	            {
	                 System.out.print(" ");
	            }

	            for (int k=0; k<=i; k++)
	            {
	                 System.out.print((char) (alphabet+k) );
	            }
	            for (int l=i-1; l>=0; l--)
	            {
	                 System.out.print((char) (alphabet+l));
	            }
	            System.out.println();
	        }
	       sc.close();
	    }
	} 

