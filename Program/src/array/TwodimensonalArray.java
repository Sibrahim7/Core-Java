package array;
import java.util.*;
public class TwodimensonalArray {
	
	
	    public static void main(String[] args) 
	    {
	        Scanner in = new Scanner(System.in);
	        int n = 3;
	        int a[][] = new int[n][n];
	       System.out.println("Enter all the elements of matrix:");
	        for (int i = 0; i < n; i++) 
	        {
	            for (int j = 0; j < n; j++) 
	            {
	                a[i][j] = in.nextInt();
	            }
	        }
	        
	        System.out.println("Original Matrix:");
	        for (int i = 0; i < n; i++) 
	        {
	            for (int j = 0; j < n; j++) 
	            {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println("");
	        }
	         
	        System.out.println("Top Element of Right Diagonal :" + a[1][0]);
	        
	        System.out.println("Right Diagnonal elements:");
	        for (int i = 0; i< n; i++) 
	        {
	            for (int j = 0; j < n; j++) 
	            {
	                if(i+j == n-1) 
	                    System.out.println(a[i][j] + " ");
	            }
	        }
	    }
	}
