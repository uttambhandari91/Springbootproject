package arrayshow;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[]) { 
		 int n,i;
		 Scanner sc = new Scanner(System.in);
		     System.out.println("Enter the number that you want to see Fibonacci series");
		     n=sc.nextInt();
		     System.out.println("Fibonacci series of first "+n+" terms is given below");
		     for(i=0;i<n;i++)
		     {
		         System.out.print(fibo(i)+" ");
		     }
		 }
		 
		 static int fibo(int val)
		 {
		     if (val==0)
		         return 0;
		     else if (val==1)
		       return 1;
		     else
		         return (fibo(val-1)+fibo(val-2));
		 }
		}