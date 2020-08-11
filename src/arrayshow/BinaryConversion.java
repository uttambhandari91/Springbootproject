package arrayshow;
import java.util.*;

public class BinaryConversion {
	
		public static void main(String[] args)
	    {
			Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the number");
	        int n = scan.nextInt();
	        int rem;
	        int num =n; 
	        String str="";
	        while(num>0)
	        {
	            rem = num%2;
	            str = rem + str;
	            num=num/2;
	        }
	        System.out.println("the binary number for "+n+" is : "+str);
	    }
}