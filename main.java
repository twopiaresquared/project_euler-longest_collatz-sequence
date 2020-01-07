
import java.io.*; 
  
class GFG  
{ 
    static void printCollatz(int n) 
    { 
       
        while (n != 1) 
        { 
            System.out.print(n + " "); 
      
            // If n is odd 
            if ((n & 1) == 1) 
                n = 3 * n + 1; 
      
            // If even 
            else
                n = n / 2; 
        } 
      
        // Print 1 at the end 
        System.out.print(n); 
    } 
      
    public static void main (String[] args)  
    { 
        printCollatz(6); 
    } 
} 
